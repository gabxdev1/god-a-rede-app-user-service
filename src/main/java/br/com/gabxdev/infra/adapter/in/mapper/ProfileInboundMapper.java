package br.com.gabxdev.infra.adapter.in.mapper;

import br.com.gabxdev.domain.model.Profile;
import br.com.gabxdev.infra.adapter.in.dto.ProfilePostRequest;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProfileInboundMapper {
    Profile toDomain(ProfilePostRequest request);
}
