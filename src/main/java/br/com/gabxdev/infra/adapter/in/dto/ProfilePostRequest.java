package br.com.gabxdev.infra.adapter.in.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

import java.time.Instant;
import java.util.UUID;

public record ProfilePostRequest(
        @NotNull
        UUID userId,

        @NotBlank
        String firstName,

        @NotBlank
        String lastName,

        @NotNull
        String bio,

        @NotNull
        String avatarUrl,

        @NotNull
        @Past
        Instant createdAt,

        @NotBlank
        String username
) {
}
