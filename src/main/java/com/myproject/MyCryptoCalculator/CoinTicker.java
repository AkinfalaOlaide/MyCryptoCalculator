package com.myproject.MyCryptoCalculator;
public enum CoinTicker {
    ETH(500),
    SOL(200),
    BTC(1900),
    BNB(250);
    private final double usdtPrice;
    CoinTicker(double usdtPrice) {
        this.usdtPrice = usdtPrice;
    }
    public double getUsdtPrice() {
        return usdtPrice;
    }
    public double getNairaPrice() {
        return usdtPrice * 1700;
    }
}
