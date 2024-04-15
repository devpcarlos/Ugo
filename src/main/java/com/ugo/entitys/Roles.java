package com.ugo.entitys;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "roles")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Roles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 15, name = "role_name")
    private String roleName;

    @OneToMany(targetEntity = User.class, mappedBy = "roleId", fetch = FetchType.LAZY)
    private List<User>users;

}
