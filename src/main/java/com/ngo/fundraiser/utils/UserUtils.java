package com.ngo.fundraiser.utils;

import com.ngo.fundraiser.dto.CampaignsDTO;
import com.ngo.fundraiser.dto.UserDTO;
import com.ngo.fundraiser.entity.Campaigns;
import com.ngo.fundraiser.entity.User;

public class UserUtils {
	
	
	public static UserDTO convertUsertoUserDto(User user)
	{
		UserDTO userDTO=new UserDTO();
		
		userDTO.setName(user.getName());
		userDTO.setRoleID(user.getRole().getRoleID());
		userDTO.setUserID(user.getUserID());
		
		
		return userDTO;
		
	}

}
