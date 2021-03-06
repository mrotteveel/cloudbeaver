/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2020 DBeaver Corp and others
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.cloudbeaver.server.model;

import org.jkiss.dbeaver.model.data.json.JSONUtils;
import org.jkiss.dbeaver.model.meta.Property;
import org.jkiss.utils.CommonUtils;

import java.util.Map;

/**
 * Web connection config
 */
public class WebConnectionConfig {

    private String dataSourceId;

    private String driverId;
    private String host;
    private String port;
    private String serverName;
    private String databaseName;
    private String url;

    private String name;
    private String description;
    private Map<String, Object> properties;
    private String userName;
    private String userPassword;

    public WebConnectionConfig() {
    }

    public WebConnectionConfig(Map<String, Object> params) {
        dataSourceId = CommonUtils.toString(params.get("dataSourceId"));

        driverId = JSONUtils.getString(params, "driverId");
        host = JSONUtils.getString(params, "host");
        port = JSONUtils.getString(params, "port");
        serverName = JSONUtils.getString(params, "serverName");
        databaseName = JSONUtils.getString(params, "databaseName");
        url = JSONUtils.getString(params, "url");

        name = JSONUtils.getString(params, "name");
        description = JSONUtils.getString(params, "description");

        properties = JSONUtils.getObject(params, "properties");
        userName = JSONUtils.getString(params, "userName");
        userPassword = JSONUtils.getString(params, "userPassword");
    }

    @Property
    public String getDataSourceId() {
        return dataSourceId;
    }

    @Property
    public String getDriverId() {
        return driverId;
    }

    @Property
    public String getName() {
        return name;
    }

    @Property
    public String getDescription() {
        return description;
    }

    @Property
    public String getHost() {
        return host;
    }

    @Property
    public String getPort() {
        return port;
    }

    @Property
    public String getServerName() {
        return serverName;
    }

    @Property
    public String getDatabaseName() {
        return databaseName;
    }

    @Property
    public String getUrl() {
        return url;
    }

    @Property
    public Map<String, Object> getProperties() {
        return properties;
    }

    @Property
    public String getUserName() {
        return userName;
    }

    @Property
    public String getUserPassword() {
        return userPassword;
    }

}
