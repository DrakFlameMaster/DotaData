package com.erligaming.dota.Commons.Enum;

public enum  DotaUrlEnum  {
    /**
     *
     */
    BaseUrl("01","http://api.steampowered.com/"),

    MatchHistory("02","IDOTA2Match_570/GetMatchHistory/v001/"),

    MatchHistoryBySeqNum("03","IDOTA2Match_570/GetMatchHistoryBySequenceNum/v0001/"),

    MathDetail("04","IDOTA2Match_570/GetMatchDetails/v001/"),

    LeagueListing("05","IDOTA2Match_570/GetLeagueListing/v0001/"),

    LeagueGame("06","IDOTA2Match_570/GetLiveLeagueGames/v0001/"),

    TeamInfoByTeamId("07","IDOTA2Match_570/GetTeamInfoByTeamID/v001/"),

    PlayerSummaries("08","ISteamUser/GetPlayerSummaries/v0002/"),

    Heaores("09","IEconDOTA2_570/GetHeroes/v0001/"),

    GameItems("10","IEconDOTA2_570/GetGameItems/v0001/"),

    TournamentPrizePool("11","IEconDOTA2_570/GetTournamentPrizePool/v1/"),

    TopLiveGame("12","IDOTA2Match_570/GetTopLiveGame/v1/"),

    ItemsImagesUrl("13","http://cdn.dota2.com/apps/dota2/images/items/"),

    HeroImagesUrl("14","http://cdn.dota2.com/apps/dota2/images/heroes/");

    private String code;

    private String url;

    private DotaUrlEnum(String code, String url){
        this.code = code;
        this.url = url;
    }

    public String getCode() {
        return code;
    }

    public String getUrl(){
        return url;
    }

    public static DotaUrlEnum createDotaUrlEnum(String code){
        DotaUrlEnum[] values = DotaUrlEnum.values();
        for (DotaUrlEnum p :values){
            if (p.getCode().equals(code)){
                return p;
            }
        }
        return null;
    }


    @Override
    public String toString(){
        return this.code;
    }
}
