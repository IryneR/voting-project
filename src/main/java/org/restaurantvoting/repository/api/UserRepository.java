package org.restaurantvoting.repository.api;

import org.restaurantvoting.repository.model.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity,Integer> {
}
