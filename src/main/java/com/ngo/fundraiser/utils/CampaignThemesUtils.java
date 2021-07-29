package com.ngo.fundraiser.utils;

import com.ngo.fundraiser.dto.CampaignThemesDTO;
import com.ngo.fundraiser.dto.CampaignThemesDTO;
import com.ngo.fundraiser.entity.CampaignThemes;
import com.ngo.fundraiser.entity.CampaignThemes;

public class CampaignThemesUtils {
	
	public static CampaignThemes convertCampaignThemesDtoztoCampaignThemes(CampaignThemesDTO CampaignThemesDto)
	{
		CampaignThemes campaignThemes=new CampaignThemes();
		campaignThemes.setcTID(CampaignThemesDto.getcTID());
		
		return campaignThemes;
	}
	public static CampaignThemesDTO convertCampaignThemestoCamapignThemesDTO(CampaignThemes CampaignThemes)
	{
		CampaignThemesDTO campaignThemesDto=new CampaignThemesDTO();
		campaignThemesDto.setcTID(CampaignThemes.getcTID());
		campaignThemesDto.setCampaignID(CampaignThemes.getCampaignID().getCampaignID());
		campaignThemesDto.setThemeID(CampaignThemes.getThemeID().getThemeID());
		
		return campaignThemesDto;
	}
}
