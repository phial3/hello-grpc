/*
Copyright (C) THL A29 Limited, a Tencent company. All rights reserved.

SPDX-License-Identifier: Apache-2.0
*/

package com.jd.hello.grpc.sdk;

import com.jd.hello.grpc.sdk.utils.*;
import org.bouncycastle.util.encoders.Hex;
import org.chainmaker.pb.common.ContractOuterClass;
import org.chainmaker.pb.common.Request;
import org.chainmaker.pb.common.ResultOuterClass;
import org.junit.Assert;
import org.junit.Test;
import org.web3j.abi.FunctionEncoder;
import org.web3j.abi.datatypes.Address;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.utils.Numeric;

import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TestEvmContract extends TestBase {

    private static final String EVM_CONTRACT_FILE_PATH = "token.bin";
    private static final String CONTRACT_NAME = "token101";
    private static final String CONTRACT_ARGS_EVM_PARAM = "data";
    private static String ADDRESS = "";

    private void makeAddrFromCert() {
        try {
            //公钥模式下，请替换ADDRESS的生成方式，通过公钥生成ADDRESS
//            ADDRESS = CryptoUtils.makeAddrFromPukPem(chainClient.getClientUser().getPublicKey());
            ADDRESS = CryptoUtils.makeAddrFromCert(chainClient.getClientUser().getCertificate());
        } catch (UtilsException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testCreateEvmContract() {
        makeAddrFromCert();
        //创建合约构造参数扽RLP编码值
        Function function = new Function("", Arrays.asList(new Address(ADDRESS)),
                Collections.emptyList());
        String methodDataStr = FunctionEncoder.encode(function);

        Map<String, byte[]> paramMap = new HashMap<>();
        paramMap.put(CONTRACT_ARGS_EVM_PARAM, methodDataStr.substring(10).getBytes());


        ResultOuterClass.TxResponse responseInfo = null;
        try {
            byte[] byteCode = FileUtils.getResourceFileBytes(EVM_CONTRACT_FILE_PATH);
            // 1. create payload
            Request.Payload payload = chainClient.createContractCreatePayload(Utils.calcContractName(CONTRACT_NAME),
                    "1", Hex.decode(new String(byteCode)),
                    ContractOuterClass.RuntimeType.EVM, paramMap);

            //2. create payloads with endorsement
            Request.EndorsementEntry[] endorsementEntries = SdkUtils.getEndorsers(
                    payload, new User[]{adminUser1, adminUser2, adminUser3});

            // 3. send request
            responseInfo = chainClient.sendContractManageRequest(
                    payload, endorsementEntries, rpcCallTimeout, syncResultTimeout);
        } catch (SdkException e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
        Assert.assertNotNull(responseInfo);
    }

    @Test
    public void testInvokeTransferEvmContract() throws UtilsException, NoSuchAlgorithmException {
        Map<String, byte[]> params = new HashMap<>();
        String toAddress = CryptoUtils.makeAddrFromCert(adminUser2.getTlsCertificate());
        BigInteger amount = BigInteger.valueOf(600);
        Function function = new Function("transfer", Arrays.asList(new Address(toAddress), new Uint256(amount)),
                Collections.emptyList());

        String methodDataStr = FunctionEncoder.encode(function);
        String method = methodDataStr.substring(0,10);
        params.put(CONTRACT_ARGS_EVM_PARAM, methodDataStr.getBytes());

        ResultOuterClass.TxResponse responseInfo = null;
        try {
            responseInfo = chainClient.invokeContract(Utils.calcContractName(CONTRACT_NAME),
                    method, null, params,rpcCallTimeout, syncResultTimeout);
        } catch (SdkException e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
        Assert.assertNotNull(responseInfo);
    }

    @Test
    public void testInvokeBalanceOfEvmContract() {
        makeAddrFromCert();
        Map<String, byte[]> params = new HashMap<>();
        Function function = new Function("balanceOf", Arrays.asList(new Address(ADDRESS)),
                Collections.emptyList());

        String methodDataStr = FunctionEncoder.encode(function);
        String method = methodDataStr.substring(0,10);
        params.put(CONTRACT_ARGS_EVM_PARAM, methodDataStr.getBytes());

        ResultOuterClass.TxResponse responseInfo = null;
        try {
            responseInfo = chainClient.invokeContract(Utils.calcContractName(CONTRACT_NAME),
                    method, null, params,rpcCallTimeout, syncResultTimeout);
        } catch (SdkException e) {
            e.printStackTrace();
            Assert.fail(e.getMessage());
        }
        Assert.assertNotNull(responseInfo);
        System.out.println(Numeric.toBigInt(responseInfo.getContractResult().getResult().toByteArray()));
    }
}
