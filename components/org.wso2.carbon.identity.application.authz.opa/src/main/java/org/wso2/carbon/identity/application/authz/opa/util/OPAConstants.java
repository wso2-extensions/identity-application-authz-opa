/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */
package org.wso2.carbon.identity.application.authz.opa.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.identity.application.authz.opa.InvokeOpaFunctionImpl;

/**
 * Set of the constants used in the opa related functions.
 */
public class OPAConstants {

    public static final Log LOG = LogFactory.getLog(InvokeOpaFunctionImpl.class);
    public static final String TYPE_APPLICATION_JSON = "application/json";
    public static final int TIME = 5000;
    public static final String CONTEXT = "context";
    public static final String INPUT = "input";
    public static final String SEND_CLAIMS = "sendClaims";
    public static final String SEND_ROLES = "sendRoles";
    public static final String JS_AUTHENTICATED_SUBJECT_IDENTIFIER = "authenticatedSubjectIdentifier";
    public static final String JS_USERNAME = "userName";
    public static final String JS_TENANT_DOMAIN = "tenantDomain";
    public static final String CLAIMS = "claims";
    public static final String ROLES = "roles";
    public static final String USER_STORE_DOMAIN = "userStoreDomain";
    public static final String USER_CONTEXT = "user_context";
    public static final String USER = "user";

}
