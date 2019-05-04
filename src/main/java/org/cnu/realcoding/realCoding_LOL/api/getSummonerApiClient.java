package org.cnu.realcoding.realCoding_LOL.api;

import org.cnu.realcoding.realCoding_LOL.domain.Summoner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class getSummonerApiClient {

    @Autowired
    private RestTemplate restTemplate;
    private final String API_KEY = "RGAPI-cb52e1f1-de87-44e3-89d0-28bbe6d62ce0";
    private final String getSummonerNameUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/{summonerName}?api_key={API_KEY}";


    public Summoner getSummonerByName(String summonerName) {
        return restTemplate.exchange(getSummonerNameUrl, HttpMethod.GET, null, Summoner.class , summonerName, API_KEY)
                .getBody();
    }



}
