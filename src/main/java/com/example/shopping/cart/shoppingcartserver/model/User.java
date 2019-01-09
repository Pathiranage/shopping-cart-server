package com.example.shopping.cart.shoppingcartserver.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "USER_CODE")
    @NotEmpty
    private String userCode;

    @Column(name = "EMAIL")
    @Email
    @NotEmpty
    private String email;
}
