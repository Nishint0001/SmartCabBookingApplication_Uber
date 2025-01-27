package com.nishintgoyal.project.uber.uberApplication.dto;

import com.nishintgoyal.project.uber.uberApplication.entities.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto
{
    private String name;

    private String email;

    private Set<Role> roles;
}
