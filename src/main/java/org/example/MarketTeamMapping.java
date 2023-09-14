package org.example;

public class MarketTeamMapping {

    private int id;

    private int marketId;
    private int teamId;

    public MarketTeamMapping(int id,  int marketId, int teamId) {
        this.id = id;
        this.teamId = teamId;
        this.marketId = marketId;
    }

    public int getId() {
        return id;
    }

    public int getTeamId() {
        return teamId;
    }

    public int getMarketId() {
        return marketId;
    }
}
