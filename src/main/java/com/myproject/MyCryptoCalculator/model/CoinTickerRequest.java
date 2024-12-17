package com.myproject.MyCryptoCalculator.model;

import com.myproject.MyCryptoCalculator.CoinTicker;
import jakarta.validation.constraints.NotNull;

public class CoinTickerRequest {
    @NotNull(message = "cointicker cannot be empty")
    private CoinTicker coinTicker;

    public CoinTickerRequest(CoinTicker coinTicker) {
        this.coinTicker = coinTicker;
    }

    public CoinTicker getCoinTicker() {
        return coinTicker;
    }
}
