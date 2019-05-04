package org.cnu.realcoding.realCoding_LOL.service;

import org.cnu.realcoding.realCoding_LOL.api.getLeagueApiClient;
import org.cnu.realcoding.realCoding_LOL.api.getSummonerApiClient;
import org.cnu.realcoding.realCoding_LOL.domain.League;
import org.cnu.realcoding.realCoding_LOL.domain.Summoner;
import org.cnu.realcoding.realCoding_LOL.repository.SummonerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SummonerService {
    @Autowired
    private getSummonerApiClient SummonerApiClient;
    @Autowired
    private getLeagueApiClient LeagueApiClient;
    @Autowired
    private SummonerRepository summonerRepository;

    public Summoner getSummonersByName(String name) {
        Summoner availableSummonersName = SummonerApiClient.getSummonerByName(name);
        return availableSummonersName;
    }

    public List<League> getLeagueById(String name){
        Summoner inputSummoner = this.getSummonersByName(name);
        List<League> league =  LeagueApiClient.getLeagueNames(inputSummoner.getId());
        summonerRepository.insertSummoner(league);
        return league;
    }



}
