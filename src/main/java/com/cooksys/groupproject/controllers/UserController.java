package com.cooksys.groupproject.controllers;

import com.cooksys.groupproject.dtos.CredentialsDto;
import com.cooksys.groupproject.dtos.UserResponseDto;
import com.cooksys.groupproject.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")

public class UserController {

    private UserService userService;

    @PostMapping("/validate")
    public UserResponseDto getUser(@RequestBody CredentialsDto credentialsDto) {
        return userService.getUser(credentialsDto);
    }

    @GetMapping("/{companyId}")
    public List<UserResponseDto> getUsersInCompany(@PathVariable Long companyId) {
        return userService.getUsersInCompany(companyId);
    }


    }
