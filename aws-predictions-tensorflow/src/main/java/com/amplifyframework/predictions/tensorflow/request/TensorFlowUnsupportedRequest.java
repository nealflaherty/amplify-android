/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amplifyframework.predictions.tensorflow.request;

import androidx.annotation.NonNull;

import com.amplifyframework.predictions.PredictionsException;

/**
 * Placeholder request for unsupported operations.
 */
public final class TensorFlowUnsupportedRequest {
    private static final String ERROR_MESSAGE = "This operation is not supported.";
    private static final String RECOVERY_SUGGESTION = "Operation is not currently supported by offline mode.";
    private static final PredictionsException UNSUPPORTED_OPERATION_EXCEPTION =
            new PredictionsException(ERROR_MESSAGE, RECOVERY_SUGGESTION);

    /**
     * Return pre-determined {@link PredictionsException} for unsupported requests.
     * @return Exception containing message and recovery suggestion pertaining
     *          to unsupported operation error
     */
    @NonNull
    public PredictionsException getError() {
        return UNSUPPORTED_OPERATION_EXCEPTION;
    }
}
