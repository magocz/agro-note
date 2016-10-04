package com.an.bc.user.repo;

import com.an.bc.user.impl.UserDO;
import com.sun.istack.internal.NotNull;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.*;

@Entity
@Table(name = "user_roles")
public class UserRoleBE {


    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "role")
    private String role;

    @NotNull
    @Column(name = "username")
    private String userName;

    public UserRoleBE(String role, String userName) {
        this.role = role;
        this.userName = userName;
    }

    public UserRoleBE(String userName) {
        this.userName = userName;
        this.role = "ROLE_USER";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
