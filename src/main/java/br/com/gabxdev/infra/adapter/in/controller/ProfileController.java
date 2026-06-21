package br.com.gabxdev.infra.adapter.in.controller;

import br.com.gabxdev.domain.ports.in.ProfileInboundPort;
import br.com.gabxdev.infra.adapter.in.dto.ProfilePostRequest;
import br.com.gabxdev.infra.adapter.in.mapper.ProfileInboundMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Validated
public class ProfileController {

    private final ProfileInboundPort profileInboundPort;
    private final ProfileInboundMapper mapper;

    @PostMapping
    public ResponseEntity<Void> createProfile(@Valid @RequestBody ProfilePostRequest request) {
        var profile = mapper.toDomain(request);

        profileInboundPort.createProfile(profile);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
