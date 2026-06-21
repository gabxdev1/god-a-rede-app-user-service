package br.com.gabxdev.infra.integration.repository;

import br.com.gabxdev.infra.integration.repository.entity.ProfileEntity;
import org.springframework.data.repository.ListCrudRepository;

import java.util.UUID;

public interface ProfileRepository extends ListCrudRepository<ProfileEntity, UUID> {
}
