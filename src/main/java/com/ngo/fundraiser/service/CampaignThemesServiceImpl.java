package com.ngo.fundraiser.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ngo.fundraiser.dto.CampaignThemesDTO;
import com.ngo.fundraiser.entity.CampaignThemes;
import com.ngo.fundraiser.entity.Campaigns;
import com.ngo.fundraiser.entity.Theme;
import com.ngo.fundraiser.repository.CampaignThemesRepository;
import com.ngo.fundraiser.repository.CampaignsRepository;
import com.ngo.fundraiser.repository.ThemeRepository;
import com.ngo.fundraiser.utils.CampaignThemesUtils;

@Service
public class CampaignThemesServiceImpl implements CampaignThemesService {

	@Autowired
	CampaignThemesRepository campaignThemeRepository;
	@Autowired
	CampaignsRepository campaignRepository;
	@Autowired
	ThemeRepository themeRepository;
	@Override
	public CampaignThemesDTO createCampaignThemes(CampaignThemesDTO dto) {
		if(dto!=null)
		{
			Theme theme=this.themeRepository.findById(dto.getThemeID()).get();
			Campaigns campaigns=this.campaignRepository.findById(dto.getCampaignID()).get();
			CampaignThemes campaignThemes=CampaignThemesUtils.convertCampaignThemesDtoztoCampaignThemes(dto);
			campaignThemes.setCampaignID(campaigns);
			campaignThemes.setThemeID(theme);
			CampaignThemes createdCampaignThemes=this.campaignThemeRepository.save(campaignThemes);
			
			return CampaignThemesUtils.convertCampaignThemestoCamapignThemesDTO(createdCampaignThemes);
		}
		return null;
	}

	
	@Override
	public CampaignThemesDTO deleteCampaignThemes(CampaignThemesDTO dto) {
		if(dto!=null)
		{
			CampaignThemes campaignThemes=this.campaignThemeRepository.findById(dto.getcTID()).get();
			this.campaignThemeRepository.delete(campaignThemes);
			
			return CampaignThemesUtils.convertCampaignThemestoCamapignThemesDTO(campaignThemes);
		}
		return null;
	}

}
