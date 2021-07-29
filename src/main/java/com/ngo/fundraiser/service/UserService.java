package com.ngo.fundraiser.service;

import com.ngo.fundraiser.dto.UserDTO;
import com.ngo.fundraiser.entity.Role;
import com.ngo.fundraiser.entity.User;
import com.ngo.fundraiser.repository.RoleRepository;
import com.ngo.fundraiser.repository.UserRepository;
import com.ngo.fundraiser.utils.UserUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    public UserDTO saveUser(UserDTO userDTO) {

        User user = new User();
        user.setName(userDTO.getName());
        user.setPassword(userDTO.getPassword());
        Role role = roleRepository.getById(userDTO.getRoleID());
        user.setRole(role);
        return UserUtils.convertUsertoUserDto( userRepository.save(user));
    }
    
    public UserDTO loginUser(UserDTO userDto)
    {
    	List<User> user=this.userRepository.findByNameAndPassword(userDto.getName(),userDto.getPassword());
    	if(user.size()>0)
    	{
    		return UserUtils.convertUsertoUserDto(user.get(0));
    	}
    	else
    	{
    		UserDTO invalidUser=new UserDTO();
    		invalidUser.setMessage("wrong username and password");
    		return invalidUser;
    	}
    }

    public List<UserDTO> getAllUsers() {

        return userRepository.findAll().stream().map(us->UserUtils.convertUsertoUserDto(us)).collect(Collectors.toList());
    }
}
