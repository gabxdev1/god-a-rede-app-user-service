package br.com.gabxdev.domain.ports.in;

import br.com.gabxdev.domain.model.Profile;

public interface ProfileInboundPort {
    Profile createProfile(Profile profile);
}
