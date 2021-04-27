package org.mi5.sightseeing.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    USER("ROLE_USER", "회원");

    private final String key;
    private final String title;


}
