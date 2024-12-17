package com.myproject.MyCryptoCalculator.model;
import com.myproject.MyCryptoCalculator.CoinTicker;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
public class Request {
    @NotNull(message = "cointicker cannot be empty")
    private CoinTicker coinTicker;
    @NotNull(message = "Quantity cannot be null")
    @Positive(message = "Quantity must be greater than zero")
    private double quantity;
    public Request(CoinTicker coinTicker) {
        this.coinTicker = coinTicker;
    }

    public CoinTicker getCoinTicker() {
        return coinTicker;
    }

    public void setCoinTicker(CoinTicker coinTicker) {
        this.coinTicker = coinTicker;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
