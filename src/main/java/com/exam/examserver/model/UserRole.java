package com.exam.examserver.model;

import lombok.*;

import javax.persistence.*;
import javax.websocket.server.ServerEndpoint;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@ToString
@Builder
@Entity
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userRoleId;

    //user
    //many roles are associated with single user
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    @ManyToOne
    private Role role;
}
