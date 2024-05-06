package io.github.m4rciooliveira.orderbot.domains;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

@AllArgsConstructor
@Getter
@Builder
public class CustomMultipartFile implements MultipartFile {

    private byte[] content;
    private String name;
    private String originalFilename;
    private String contentType;


    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public long getSize() {
        return this.content.length;
    }

    @Override
    public byte[] getBytes() throws IOException {
        return this.content;
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new ByteArrayInputStream(this.content);
    }

    @Override
    public void transferTo(File dest) throws IOException, IllegalStateException {

    }
}
