/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yx;

/**
 * Use short variable name to speed up FastJson deserialization process.
 */
public class SendLongMessageRequestHeaderV2 {

    private String aaaaaaaaaaaaa; // producerGroup;

    private String bbbbbbbbbbbbb; // topic;

    private String ccccccccccccc; // defaultTopic;

    private String ddddddddddddd; // defaultTopicQueueNums;


    public SendLongMessageRequestHeaderV2() {
    }

    public SendLongMessageRequestHeaderV2(String aaaaaaaaaaaaa, String bbbbbbbbbbbbb, String ccccccccccccc,
        String ddddddddddddd) {
        this.aaaaaaaaaaaaa = aaaaaaaaaaaaa;
        this.bbbbbbbbbbbbb = bbbbbbbbbbbbb;
        this.ccccccccccccc = ccccccccccccc;
        this.ddddddddddddd = ddddddddddddd;
    }

    public String getAaaaaaaaaaaaa() {
        return aaaaaaaaaaaaa;
    }

    public void setAaaaaaaaaaaaa(String aaaaaaaaaaaaa) {
        this.aaaaaaaaaaaaa = aaaaaaaaaaaaa;
    }

    public String getBbbbbbbbbbbbb() {
        return bbbbbbbbbbbbb;
    }

    public void setBbbbbbbbbbbbb(String bbbbbbbbbbbbb) {
        this.bbbbbbbbbbbbb = bbbbbbbbbbbbb;
    }

    public String getCcccccccccccc() {
        return ccccccccccccc;
    }

    public void setCcccccccccccc(String ccccccccccccc) {
        this.ccccccccccccc = ccccccccccccc;
    }

    public String getDdddddddddddd() {
        return ddddddddddddd;
    }

    public void setDdddddddddddd(String ddddddddddddd) {
        this.ddddddddddddd = ddddddddddddd;
    }
}