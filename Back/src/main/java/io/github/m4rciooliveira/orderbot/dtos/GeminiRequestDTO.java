package io.github.m4rciooliveira.orderbot.dtos;

import lombok.Builder;

import java.util.List;

@Builder
public record GeminiRequestDTO(
        List<GeminiContentDTO> contents
) {

    @Builder
    public record GeminiContentDTO(
            String role,
            List<GeminiPartDTO> parts
    ) {
    }

    @Builder
    public record GeminiPartDTO(
            String text
    ) {
    }

}
