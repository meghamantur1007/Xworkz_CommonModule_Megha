package com.xworkz.commonModule.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {
    private String name;
    private String email;
    private long phoneNumber;
    private String alternateEmail;
    private long alternatePhoneNumber;
    private String location;
}
