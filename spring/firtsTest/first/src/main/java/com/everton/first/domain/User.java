package com.everton.first.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


// Essas notações criam Getters e Setters e constuctors automaticamente
@Getter
@Setter
@AllArgsConstructor
public class User {
    private  String name;
    private  String email;

}
