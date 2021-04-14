package com.sign.login.domain.repository;

import com.sign.login.domain.entity.MemberEntity;

import java.util.Optional;

public interface MemberRepository {
    Optional<MemberEntity> findByEmail(String userEmail);
}
