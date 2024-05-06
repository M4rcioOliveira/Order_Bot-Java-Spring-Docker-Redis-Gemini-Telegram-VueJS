package io.github.m4rciooliveira.orderbot.domains;

import io.github.m4rciooliveira.orderbot.dtos.TelegramSentResponseDTO;
import io.github.m4rciooliveira.orderbot.dtos.TelegramUpdateResponseDTO;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Telegram {
    private TelegramUpdateResponseDTO telegramUpdateResponseDTO;
    private TelegramSentResponseDTO telegramSentResponseDTO;
}

