package com.opleiding.dms2.readprop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class ConfigProperties {
    @Autowired
    private Environment env;

    public ConfigProperties() {
        // TODO Auto-generated constructor stub
    }

    public String getConfigValue(String configKey) {
        return env.getProperty(configKey);
    }


}