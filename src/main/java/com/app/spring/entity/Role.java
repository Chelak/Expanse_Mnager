package com.app.spring.entity;

import javax.persistence.*;

/**
 * Created by scelac on 4/8/16.
 */

@Entity
@Table(name="Role")
public class Role
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="role_id")
    private Integer roleId;
    @Column(name="code")
    private String code;
    @Column(name="label")
    private String label;
    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
