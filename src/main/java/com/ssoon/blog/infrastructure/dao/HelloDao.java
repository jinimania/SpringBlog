package com.ssoon.blog.infrastructure.dao;

import com.ssoon.blog.domain.model.entity.Hello;

import org.springframework.data.jpa.repository.JpaRepository;

public interface HelloDao extends JpaRepository <Hello, Integer> {
}
