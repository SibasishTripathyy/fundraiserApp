package com.ngo.fundraiser.controller;

import com.ngo.fundraiser.dto.RoleDTO;
import com.ngo.fundraiser.entity.Role;
import com.ngo.fundraiser.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/create")
    public Role saveRole(@RequestBody RoleDTO role) {
        return roleService.saveRole(role);
    }

//    @PutMapping("/addUser/{user_id}")
//    public Role addUserToRole(@PathVariable("user_id") Long user_id, @RequestBody Role role) {
//        return roleService.addUserToRole(user_id, role);
//    }

    @GetMapping("/getAll")
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

}
