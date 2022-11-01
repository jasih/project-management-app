package com.cooksys.groupproject.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Data
@NoArgsConstructor
public class Profile {

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

}