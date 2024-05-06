package io.github.m4rciooliveira.orderbot.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public record TelegramUpdateResponseDTO(
        @JsonProperty(value = "update_id")
        String updateId,
        TelegramMessageUpdateResponseDTO message
) {

    public record TelegramMessageUpdateResponseDTO(
            @JsonProperty(value = "message_id")
            String messageId,
            TelegramFromMessageUpdateResponseDTO from,
            TelegramChatMessageUpdateResponseDTO chat,
            String date,
            String text

    ) {
    }

    public record TelegramFromMessageUpdateResponseDTO(
            String id,
            @JsonProperty(value = "is_bot")
            boolean isBot,
            @JsonProperty(value = "first_name")
            String firstName
    ) {
    }

    public record TelegramChatMessageUpdateResponseDTO(
            String id,
            @JsonProperty(value = "first_name")
            String firstName
    ) {
    }

}
