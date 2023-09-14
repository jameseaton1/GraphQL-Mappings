package org.example;

import com.netflix.graphql.dgs.*;
import graphql.schema.DataFetchingEnvironment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

@DgsComponent
public class MarketDataFetcher {

    private final Logger logger = LoggerFactory.getLogger(MarketDataFetcher.class);

    private final List<MarketTeamMapping> mappings = List.of(new MarketTeamMapping(1,1, 1),
            new MarketTeamMapping(2,1,1),
            new MarketTeamMapping(3,2,1),
            new MarketTeamMapping(4,2,1));


    @DgsEntityFetcher(name = "Market")
    public Market getMarket(Map<String, Object> values) {
        return new Market(Integer.valueOf((String) values.get("id")), 9, null, 0);
    }


    @DgsData(parentType = "Market", field = "marketTeamMappings")
    public List<MarketTeamMapping> getMarketMapping(DataFetchingEnvironment dfe) {
        Market market = dfe.getSource();
        logger.debug(String.format("We have market id {}", market.getId()));
        return mappings.stream().filter(x -> x.getMarketId()== market.getId()).toList();

    }
}
