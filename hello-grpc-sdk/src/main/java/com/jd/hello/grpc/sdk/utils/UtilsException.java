/*
Copyright (C) THL A29 Limited, a Tencent company. All rights reserved.

SPDX-License-Identifier: Apache-2.0
*/

package com.jd.hello.grpc.sdk.utils;


import com.jd.hello.grpc.sdk.SdkException;

public class UtilsException extends SdkException {
    public UtilsException(String message) {
        super(message);
    }
}
