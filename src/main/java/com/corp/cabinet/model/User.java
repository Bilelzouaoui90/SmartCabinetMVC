package com.corp.cabinet.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id ;
    private String username;
    private String email;
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    //création de table de jointure
    @JoinTable(name="user_roles",
            joinColumns = @JoinColumn(name="user_id"),
            inverseJoinColumns =@JoinColumn(name="role_id")
    )
    private Set<ROLE> roles=new HashSet<>();


}


