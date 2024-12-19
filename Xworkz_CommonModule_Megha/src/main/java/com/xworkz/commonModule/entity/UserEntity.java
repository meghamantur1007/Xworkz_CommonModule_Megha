package com.xworkz.commonModule.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="user_details_table")
@Data
@RequiredArgsConstructor
@NamedQuery(name="getAll",query="select ue from UserEntity ue where ue.email =:setEmail and ue.password =:setPassword")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    @Column(name="phone_number")
    private long phoneNumber;
    @Column(name="alternate_email")
    private String alternateEmail;
    @Column(name="alternate_phone")
    private long alternatePhoneNumber;
    private String location;
    private String password;
}
