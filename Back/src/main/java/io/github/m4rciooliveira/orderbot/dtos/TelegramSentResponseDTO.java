package io.github.m4rciooliveira.orderbot.dtos;

import lombok.Builder;

@Builder
public record TelegramSentResponseDTO(
        boolean ok
) {
}
