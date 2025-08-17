package edu.pe.cibertec.spring_security.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String username;
    @Column
    private String password;
    @Column(name= "is_enabled")
    private boolean isEnabled;
    @Column (name = "account_no_expired")
    private boolean accountNoExpired;
    @Column (name= "account_no_locked")
    private boolean accountNoLocked;
    @Column (name =  "credential_no_expired")
    private boolean credentialNoExpired;

    ///  ROLES
}

