package com.example.simpleuserannotationreactiveserv1.resource;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCollection {

    private List<User> items;

}
