package com.ria.common.data;

public enum EnvironmentProperties {  //can store constructor

    RIA_BASE_URL("ria.base.url");

    private String propertyKey;

    EnvironmentProperties(final String propertyKey) {
        this.propertyKey = propertyKey;
    }

    public String readProperty() {
        final PropertiesReader propertiesReader = new PropertiesReader();
        return propertiesReader.getProperty(propertyKey);
    }
}
