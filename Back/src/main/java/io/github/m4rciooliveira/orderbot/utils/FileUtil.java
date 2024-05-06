package io.github.m4rciooliveira.orderbot.utils;

import io.github.m4rciooliveira.orderbot.domains.CustomMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.util.Base64;

public class FileUtil{

    public static byte[] base64ToByte(String base64){

        try {
            return Base64.getDecoder().decode(base64);
        } catch (Exception e) {
            throw new IllegalArgumentException("Erro ao converter base64 em byte", e);
        }

    }


    public static MultipartFile toMultipartFile(byte[]content, String name, String originalFileName, String contentType){

        return new CustomMultipartFile(content, name, originalFileName, contentType);

    }

}
