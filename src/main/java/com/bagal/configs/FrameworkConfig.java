package com.bagal.configs;

import com.bagal.constants.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.ProviderNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public final class FrameworkConfig {
    private FrameworkConfig(){}
    private static final Map<String,String > MAP  = new HashMap<>();
    private static final Properties properties = new Properties();

    static {
        try (FileInputStream fileInputStream = new FileInputStream(Constants.getAPPLICATION_PROPERTIES_PATH())){
            properties.load(fileInputStream);
            properties.forEach((k,v)-> MAP.put(String.valueOf(k),String.valueOf(v)));
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static String getValue(String key){
        if(MAP.containsKey(key))
            return MAP.get(key);

        throw new ProviderNotFoundException(key + " key is not found in property file");
    }
}
