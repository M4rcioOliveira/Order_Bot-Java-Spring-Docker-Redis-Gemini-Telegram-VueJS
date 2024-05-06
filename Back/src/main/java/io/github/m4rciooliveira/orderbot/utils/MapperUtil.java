package io.github.m4rciooliveira.orderbot.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MapperUtil {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static <T> T strToObj(String str, Class<T> tClass){

        log.info("Str recebido no strToObj: {}", str );

        try {
            return objectMapper.readValue(str, tClass);
        } catch (JsonProcessingException e) {
            log.error("Error no strToObj: {}", e.toString() );
            throw new RuntimeException("");
        }

    }

}
