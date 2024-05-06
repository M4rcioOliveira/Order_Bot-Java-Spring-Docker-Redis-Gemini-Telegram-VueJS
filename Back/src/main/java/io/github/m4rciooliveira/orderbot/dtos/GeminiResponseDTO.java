package io.github.m4rciooliveira.orderbot.dtos;

import lombok.Builder;

import java.util.List;

@Builder
public record GeminiResponseDTO(
        List<GeminiCandidateDTO> candidates
) {

    @Builder
    public record GeminiCandidateDTO(
            GeminiContentDTO content
    ) {
    }

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
