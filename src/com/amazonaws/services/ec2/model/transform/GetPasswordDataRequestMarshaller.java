/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Get Password Data Request Marshaller
 */
public class GetPasswordDataRequestMarshaller implements Marshaller<Request<GetPasswordDataRequest>, GetPasswordDataRequest> {

    public Request<GetPasswordDataRequest> marshall(GetPasswordDataRequest getPasswordDataRequest) {
        Request<GetPasswordDataRequest> request = new DefaultRequest<GetPasswordDataRequest>(getPasswordDataRequest, "AmazonEC2");
        request.addParameter("Action", "GetPasswordData");
        request.addParameter("Version", "2011-02-28");
        if (getPasswordDataRequest != null) {
            if (getPasswordDataRequest.getInstanceId() != null) {
                request.addParameter("InstanceId", StringUtils.fromString(getPasswordDataRequest.getInstanceId()));
            }
        }


        return request;
    }
}
