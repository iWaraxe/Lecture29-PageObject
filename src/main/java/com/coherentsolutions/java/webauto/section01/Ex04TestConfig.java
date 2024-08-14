package com.coherentsolutions.java.webauto.section01;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * TestConfig is responsible for loading configuration properties from a file.
 * It allows accessing configuration values throughout the tests.
 */
public class Ex04TestConfig {

    private static final InputStream CONFIG_PROPS = Ex04TestConfig.class.getResourceAsStream("/conf.properties");
    private static final Properties PROPERTIES;

    static {
        PROPERTIES = new Properties();
        try {
            PROPERTIES.load(CONFIG_PROPS);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Retrieves the value associated with the provided key from the configuration file.
     *
     * @param key the property key
     * @return the property value as a String
     */
    public static String get(String key) {
        return PROPERTIES.getProperty(key);
    }
}
