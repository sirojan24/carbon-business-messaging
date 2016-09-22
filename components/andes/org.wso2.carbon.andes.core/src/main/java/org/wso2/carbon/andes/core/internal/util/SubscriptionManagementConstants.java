/*
 * Copyright (c) 2005-2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *   WSO2 Inc. licenses this file to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 */
package org.wso2.carbon.andes.core.internal.util;

/***
 * This class holds the MBean related constants so that they can be referred and modified from a single point within carbon-business-messaging.
 */
public class SubscriptionManagementConstants {

    public static final String SUBSCRIPTIONS_MBEAN_ATTRIBUTE = "getSubscriptions";
	public static final String SUBSCRIPTION_CLOSE_MBEAN_ATTRIBUTE = "removeSubscription";
    public static final String FILTERED_SUBSCRIPTIONS_MBEAN_ATTRIBUTE = "getFilteredSubscriptions";
    public static final String FILTERED_SUBSCRIPTION_COUNT_MBEAN_ATTRIBUTE = "getTotalSubscriptionCountForSearchResult";
    public static final String PENDING_MESSAGE_COUNT_MBEAN_ATTRIBUTE = "getPendingMessageCount";

}
