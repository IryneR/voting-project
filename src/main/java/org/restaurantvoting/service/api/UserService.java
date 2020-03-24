package org.restaurantvoting.service.api;

import org.restaurantvoting.repository.model.UserEntity;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface UserService {
    UserEntity addUser(UserEntity user);
    void delete(Integer id);
    UserEntity  getByName(String name);
    UserEntity  editUser(UserEntity  user);
    List<UserEntity > getAll();
}
