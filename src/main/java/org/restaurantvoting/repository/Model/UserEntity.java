package org.restaurantvoting.repository.Model;

import javax.persistence.*;

@Entity
    @Table(name="users")
    // This tells Hibernate to make a table out of this class
    public class UserEntity {
        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        @Column(name="user_id")
        private Integer id;

        @Column(name="user_name")
        private String name;

        @Column(name="is_admin")
        private Boolean isAdmin;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }
}

