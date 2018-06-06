/*
 * Copyright 2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.libertymutualgroup.herman.aws.ecs;

import com.amazonaws.ClientConfiguration;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.regions.Regions;
import com.atlassian.bamboo.build.logger.BuildLogger;
import com.libertymutualgroup.herman.task.ecs.ECSPushTaskProperties;

public class EcsPushContext {

    private BuildLogger logger;
    private PropertyHandler bambooPropertyHandler;
    private String envName;
    private AWSCredentials sessionCredentials;
    private ClientConfiguration awsClientConfig;
    private Regions region;
    private int timeout;
    private String rootPath;
    private ECSPushTaskProperties taskProperties;

    public BuildLogger getLogger() {
        return logger;
    }

    public void setLogger(BuildLogger logger) {
        this.logger = logger;
    }

    public PropertyHandler getBambooPropertyHandler() {
        return bambooPropertyHandler;
    }

    public void setBambooPropertyHandler(PropertyHandler bambooPropertyHandler) {
        this.bambooPropertyHandler = bambooPropertyHandler;
    }

    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public AWSCredentials getSessionCredentials() {
        return sessionCredentials;
    }

    public void setSessionCredentials(AWSCredentials sessionCredentials) {
        this.sessionCredentials = sessionCredentials;
    }

    public ClientConfiguration getAwsClientConfig() {
        return awsClientConfig;
    }

    public void setAwsClientConfig(ClientConfiguration awsClientConfig) {
        this.awsClientConfig = awsClientConfig;
    }

    public Regions getRegion() {
        return region;
    }

    public void setRegion(Regions region) {
        this.region = region;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getRootPath() {
        return rootPath;
    }

    public void setRootPath(String rootPath) {
        this.rootPath = rootPath;
    }

    public ECSPushTaskProperties getTaskProperties() {
        return taskProperties;
    }

    public void setTaskProperties(ECSPushTaskProperties taskProperties) {
        this.taskProperties = taskProperties;
    }

    public EcsPushContext withLogger(final BuildLogger logger) {
        this.logger = logger;
        return this;
    }

    public EcsPushContext withBambooPropertyHandler(final PropertyHandler bambooPropertyHandler) {
        this.bambooPropertyHandler = bambooPropertyHandler;
        return this;
    }

    public EcsPushContext withEnvName(final String envName) {
        this.envName = envName;
        return this;
    }

    public EcsPushContext withSessionCredentials(final AWSCredentials sessionCredentials) {
        this.sessionCredentials = sessionCredentials;
        return this;
    }

    public EcsPushContext withAwsClientConfig(final ClientConfiguration awsClientConfig) {
        this.awsClientConfig = awsClientConfig;
        return this;
    }

    public EcsPushContext withRegion(final Regions region) {
        this.region = region;
        return this;
    }

    public EcsPushContext withTimeout(final int timeout) {
        this.timeout = timeout;
        return this;
    }

    public EcsPushContext withRootPath(final String rootPath) {
        this.rootPath = rootPath;
        return this;
    }

    public EcsPushContext withTaskProperties(final ECSPushTaskProperties taskProperties) {
        this.taskProperties = taskProperties;
        return this;
    }

    @Override
    public String toString() {
        return "EcsPushContext{" +
            "logger=" + logger +
            ", bambooPropertyHandler=" + bambooPropertyHandler +
            ", envName='" + envName + '\'' +
            ", sessionCredentials=" + sessionCredentials +
            ", awsClientConfig=" + awsClientConfig +
            ", region=" + region +
            ", timeout=" + timeout +
            ", rootPath='" + rootPath + '\'' +
            ", taskProperties=" + taskProperties +
            '}';
    }
}