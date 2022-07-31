/*
Copyright (C) BABEC. All rights reserved.
Copyright (C) THL A29 Limited, a Tencent company. All rights reserved.

SPDX-License-Identifier: Apache-2.0
*/

package com.jd.hello.grpc.sdk;

import com.jd.hello.grpc.sdk.crypto.hibe.Hibe;
import com.jd.hello.grpc.sdk.utils.FileUtils;
import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestHibe {

    static String HIBE_ROOT_PRIKEY = "hibe-data/wx-org1.chainmaker.org/privateKeys/wx-topL.privateKey";
    static String HIBE_PARAMS = "hibe-data/wx-org1.chainmaker.org/wx-org1.chainmaker.org.params";
    static String PLAIN_TEXT = "abc";

    @Test
    public void testHibe() {
        Hibe hibe = new Hibe();
        try {
            byte[] rootPrivKeyBytes = FileUtils.getResourceFileBytes(HIBE_ROOT_PRIKEY);
            byte[] params = FileUtils.getResourceFileBytes(HIBE_PARAMS);
            byte[] encypted = hibe.encryptHibeMsg(new String(PLAIN_TEXT).getBytes(), new String[] {"wx-topL/secondL/thirdL"}, Stream.of(params).collect(Collectors.toList()), 1);
            byte[] ret = hibe.decryptHibeMsg("wx-topL", params, rootPrivKeyBytes, encypted, 1);
            System.out.println(new String(ret));
        } catch (SdkException e) {
            e.printStackTrace();
        }
    }
}
