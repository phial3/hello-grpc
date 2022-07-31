/*
Copyright (C) THL A29 Limited, a Tencent company. All rights reserved.

SPDX-License-Identifier: Apache-2.0
*/

package com.jd.hello.grpc.sdk;

public class RpcServiceClientException extends SdkException {
    public RpcServiceClientException(String message) {
        super(message);
    }
}
