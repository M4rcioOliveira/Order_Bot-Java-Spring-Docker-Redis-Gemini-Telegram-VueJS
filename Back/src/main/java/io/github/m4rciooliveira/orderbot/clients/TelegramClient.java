package io.github.m4rciooliveira.orderbot.clients;


import io.github.m4rciooliveira.orderbot.dtos.TelegramSentResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(name = "telegram", url = "${telegram.url}")
public interface TelegramClient {
    @PostMapping(value = "/sendMessage")
    ResponseEntity<TelegramSentResponseDTO> sendMessage(@RequestParam("chat_id") String chatId, @RequestParam("text") String prompt);

    @PostMapping(value = "/sendPhoto", consumes = "multipart/form-data")
    ResponseEntity<TelegramSentResponseDTO> sendPhoto(@RequestParam(value = "chat_id") String chatId, @RequestPart(value = "photo") MultipartFile multipartFile);

}
