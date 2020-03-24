package org.restaurantvoting.repository.api;

import org.restaurantvoting.repository.model.VotesEntity;
import org.springframework.data.repository.CrudRepository;

public interface VotesRepository extends CrudRepository<VotesEntity,Integer> {
}
