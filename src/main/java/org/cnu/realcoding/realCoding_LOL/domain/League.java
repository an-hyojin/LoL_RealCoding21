package org.cnu.realcoding.realCoding_LOL.domain;

import lombok.Data;

@Data
public class League {
    String queueType;
    String summonerName;
    boolean hotStreak;
    String progress;
    int losses;
    int target;
    int wins;
    boolean veteran;
    String rank;
    String leagueId;
    boolean inactive;
    boolean freshBlood;
    String leagueName;
    String position;
}