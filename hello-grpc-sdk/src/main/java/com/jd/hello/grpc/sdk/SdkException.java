/*
Copyright (C) THL A29 Limited, a Tencent company. All rights reserved.

SPDX-License-Identifier: Apache-2.0
*/

package com.jd.hello.grpc.sdk;

public class SdkException extends Exception {
    public SdkException(String message) {
        super(message);
    }
}
