package org.cnu.realcoding.realCoding_LOL.controller;


import org.cnu.realcoding.realCoding_LOL.domain.League;
import org.cnu.realcoding.realCoding_LOL.service.SummonerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SummonerController {

    @Autowired
    private SummonerService summonerService;

    @GetMapping("/summoners/{name}")
    public List<League> getSummonerIdByRequestParam(@PathVariable String name){
        return summonerService.getLeagueById(name);

    }



}
