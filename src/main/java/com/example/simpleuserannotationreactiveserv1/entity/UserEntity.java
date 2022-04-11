package com.example.simpleuserannotationreactiveserv1.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("user")
public class UserEntity {

    @Id
    private Long id;
    private String username;
    private String firstName;
    private String lastName;

}
