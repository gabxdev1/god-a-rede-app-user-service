package br.com.gabxdev.infra.integration.repository.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.domain.Persistable;
import org.springframework.data.annotation.Transient;
import org.springframework.data.annotation.PersistenceCreator;

import java.time.Instant;
import java.util.UUID;

@Data
@Table(name = "tb_profile", schema = "user")
public class ProfileEntity implements Persistable<UUID> {
    @Id
    private UUID userId;
    private String username;
    private String firstName;
    private String lastName;
    private String bio;
    private String avatarUrl;
    private Instant createdAt;

    @Transient
    private boolean newRecord = true;

    @Override
    public UUID getId() {
        return this.userId;
    }

    @Override
    public boolean isNew() {
        return newRecord;
    }

    public void markNotNew() {
        this.newRecord = false;
    }
}
