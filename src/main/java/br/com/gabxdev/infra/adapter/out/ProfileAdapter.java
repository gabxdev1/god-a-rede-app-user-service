package br.com.gabxdev.infra.adapter.out;

import br.com.gabxdev.domain.model.Profile;
import br.com.gabxdev.domain.ports.out.ProfileOutputPort;
import br.com.gabxdev.infra.adapter.out.mapper.ProfileOutputMapper;
import br.com.gabxdev.infra.integration.repository.ProfileRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class ProfileAdapter implements ProfileOutputPort {

    private final ProfileRepository repository;
    private final ProfileOutputMapper mapper;

    @Override
    public Profile save(Profile profile) {
        var entity = mapper.toEntity(profile);
        var save = repository.save(entity);
        return mapper.toDomain(save);
    }
}
