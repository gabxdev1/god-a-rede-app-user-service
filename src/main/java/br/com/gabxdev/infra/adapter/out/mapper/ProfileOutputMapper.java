package br.com.gabxdev.infra.adapter.out.mapper;

import br.com.gabxdev.domain.model.Profile;
import br.com.gabxdev.infra.adapter.in.dto.ProfilePostRequest;
import br.com.gabxdev.infra.integration.repository.entity.ProfileEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProfileOutputMapper {
    ProfileEntity toEntity(Profile profile);
    Profile toDomain(ProfileEntity entity);
}
