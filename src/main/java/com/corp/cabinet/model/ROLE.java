package com.corp.cabinet.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

//ajouter les getter et le setter

@Getter
@Setter
@NoArgsConstructor


@Entity
@Table(name = "roles")
public class ROLE {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="name_role",nullable = false)
    @Enumerated(EnumType.STRING)

    private ERole name;
}


