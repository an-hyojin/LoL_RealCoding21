package org.cnu.realcoding.realCoding_LOL.api;

import org.cnu.realcoding.realCoding_LOL.domain.League;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class getLeagueApiClient {
    @Autowired
    private RestTemplate restTemplate;
    private final String API_KEY = "RGAPI-cb52e1f1-de87-44e3-89d0-28bbe6d62ce0";

    private final String getLeagueUrl =  "https://kr.api.riotgames.com/lol/league/v4/positions/by-summoner/{SummonoriD}?api_key={API_KEY}";
    private final ParameterizedTypeReference<List<League>> responseType = new ParameterizedTypeReference<List<League>>() {};

    public List<League> getLeagueNames(String summonerid){
        return restTemplate.exchange(getLeagueUrl, HttpMethod.GET, null, responseType , summonerid, API_KEY)
                .getBody();
    }
}
