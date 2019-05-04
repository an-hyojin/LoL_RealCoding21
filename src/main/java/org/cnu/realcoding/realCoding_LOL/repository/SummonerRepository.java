package org.cnu.realcoding.realCoding_LOL.repository;

import org.cnu.realcoding.realCoding_LOL.domain.League;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public class SummonerRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public Collection<League> insertSummoner(List<League> league) {
        return mongoTemplate.insertAll(league);
    }
}