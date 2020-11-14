package com.cyber.model;

import com.cyber.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Mentor {

    private String firstname;
    private String lastname;
    private int age;
    private Gender gender;
}
