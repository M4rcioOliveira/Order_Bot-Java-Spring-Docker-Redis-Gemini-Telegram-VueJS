package io.github.m4rciooliveira.orderbot.domains;

import io.github.m4rciooliveira.orderbot.dtos.GeminiRequestDTO;
import io.github.m4rciooliveira.orderbot.dtos.GeminiResponseDTO;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Gemini {
    private GeminiRequestDTO geminiRequestDTO;
    private GeminiResponseDTO geminiResponseDTO;
}
