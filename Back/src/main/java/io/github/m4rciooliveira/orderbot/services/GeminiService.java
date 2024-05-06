package io.github.m4rciooliveira.orderbot.services;

import io.github.m4rciooliveira.orderbot.clients.GeminiClient;
import io.github.m4rciooliveira.orderbot.dtos.GeminiRequestDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Slf4j
@RequiredArgsConstructor
public class GeminiService {

    private final GeminiClient geminiClient;
    private static final String GEMINI_ROLE_USER = "user";

    public String getResult(String prompt) {
        var response = geminiClient.getResult(buildGeminiRequestDTO(prompt));
        return Objects.requireNonNull(response.getBody()).candidates().getFirst().content().parts().getFirst().text();
    }

    private GeminiRequestDTO buildGeminiRequestDTO(String prompt) {
        return GeminiRequestDTO.builder()
                .contents(
                        List.of(
                                GeminiRequestDTO.GeminiContentDTO.builder()
                                        .role(GEMINI_ROLE_USER)
                                        .parts(List.of(
                                                GeminiRequestDTO.GeminiPartDTO.builder()
                                                        .text(prompt)
                                                        .build()
                                        ))
                                        .build()
                        )
                )
                .build();
    }
}
