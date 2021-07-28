package com.ngo.fundraiser.controller;

import com.ngo.fundraiser.dto.ThemeDTO;
import com.ngo.fundraiser.entity.Theme;
import com.ngo.fundraiser.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("theme")
public class ThemeController {

    @Autowired
    private ThemeService themeService;

    @PostMapping("/create")
    public Theme saveTheme(@RequestBody ThemeDTO themeDTO) {
        return themeService.saveTheme(themeDTO);
    }

    @GetMapping("/getAll")
    public List<Theme> getAllThemes() {
        return themeService.getAllThemes();
    }
}
