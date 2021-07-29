package com.ngo.fundraiser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ngo.fundraiser.entity.Theme;

public interface ThemeRepository extends JpaRepository<Theme, Long> {

}
