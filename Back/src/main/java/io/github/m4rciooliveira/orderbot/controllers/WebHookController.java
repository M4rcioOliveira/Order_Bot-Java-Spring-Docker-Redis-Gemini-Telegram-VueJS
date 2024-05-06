package io.github.m4rciooliveira.orderbot.controllers;

import io.github.m4rciooliveira.orderbot.dtos.TelegramUpdateResponseDTO;
import io.github.m4rciooliveira.orderbot.services.TelegramService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/orderbot")
@RequiredArgsConstructor
@Slf4j
public class WebHookController {

    private final TelegramService telegramService;

    @PostMapping(value = "/webhook")
    public void handleWebhook(@RequestBody TelegramUpdateResponseDTO update) throws InterruptedException {
        telegramService.listeningWebHook(update);
    }

}
