package org.restaurantvoting.service.api;

import org.restaurantvoting.repository.model.RestaurantsEntity;
import org.restaurantvoting.repository.model.VotesEntity;

import java.util.List;

public interface VotesService {
    VotesEntity addVote(VotesEntity vote);
    void delete(Integer id);
   /* VotesEntity  getByName(String name);*/
    VotesEntity editVote(VotesEntity  vote);
    List<VotesEntity> getAll();
}
