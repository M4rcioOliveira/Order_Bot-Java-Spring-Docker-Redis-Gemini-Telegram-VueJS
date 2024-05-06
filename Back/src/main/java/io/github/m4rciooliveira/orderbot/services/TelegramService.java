package io.github.m4rciooliveira.orderbot.services;

import io.github.m4rciooliveira.orderbot.clients.TelegramClient;
import io.github.m4rciooliveira.orderbot.dtos.TelegramUpdateResponseDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class TelegramService{

    private final TelegramClient telegramClient;
    private final GeminiService geminiService;

    public void listeningWebHook(TelegramUpdateResponseDTO update) throws InterruptedException {
        Thread.sleep(2000);
        var updateChatId = update.message().chat().id();
        var updatePrompt = update.message().text();
        var gemini = geminiService.getResult(updatePrompt);
        sendMessage(updateChatId, STR."**GEMINI**: \{gemini}");
    }


    public void sendMessage(String chatId, String prompt) {
        var response = telegramClient.sendMessage(chatId, prompt);
        response.getBody();
    }


}