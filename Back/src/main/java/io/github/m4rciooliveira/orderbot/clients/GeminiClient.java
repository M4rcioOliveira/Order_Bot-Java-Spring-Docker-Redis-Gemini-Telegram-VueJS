package io.github.m4rciooliveira.orderbot.clients;


import io.github.m4rciooliveira.orderbot.dtos.GeminiRequestDTO;
import io.github.m4rciooliveira.orderbot.dtos.GeminiResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "gemini", url = "${gemini.url}")
public interface GeminiClient {
    @PostMapping(value = "")
    ResponseEntity<GeminiResponseDTO> getResult(@RequestBody GeminiRequestDTO request);

}
