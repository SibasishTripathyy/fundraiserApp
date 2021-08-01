package com.ngo.fundraiser.service;

import com.ngo.fundraiser.dto.ThemeDTO;
import com.ngo.fundraiser.entity.Theme;
import com.ngo.fundraiser.repository.ThemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThemeServiceImpl implements ThemeService {

    @Autowired
    private ThemeRepository themeRepository;

    @Override
    public Theme saveTheme(ThemeDTO themeDTO) {
        Theme theme = new Theme();
        theme.setCampaignName(themeDTO.getCampaignName());
        theme.setKeywords(themeDTO.getKeywords());
        return themeRepository.save(theme);
    }

    @Override
    public List<Theme> getAllThemes() {
        return themeRepository.findAll();
    }
}
