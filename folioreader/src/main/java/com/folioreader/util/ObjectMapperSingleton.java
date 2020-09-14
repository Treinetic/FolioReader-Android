package com.folioreader.util;

import androidx.annotation.Keep;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by Hrishikesh Kadam on 21/04/2018.
 */
@Keep
public class ObjectMapperSingleton {

    private static volatile ObjectMapper objectMapper;

    private ObjectMapperSingleton() {
    }

    public static ObjectMapper getObjectMapper() {

        if (objectMapper == null) {
            synchronized (ObjectMapperSingleton.class) {
                if (objectMapper == null) {
                    objectMapper = new ObjectMapper();
                }
            }
        }

        return objectMapper;
    }
}
