package br.com.gabxdev.domain.model;

import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.UUID;

@Data
@Builder
public class Profile {
    private UUID userId;
    private String username;
    private String firstName;
    private String lastName;
    private String bio;
    private String avatarUrl;
    private Instant createdAt;
}
