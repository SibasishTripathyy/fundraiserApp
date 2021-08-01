package com.ngo.fundraiser.service;

import com.ngo.fundraiser.dto.ThemeDTO;
import com.ngo.fundraiser.entity.Theme;

import java.util.List;

public interface ThemeService {

    public Theme saveTheme(ThemeDTO themeDTO);

    public List<Theme> getAllThemes();
}
