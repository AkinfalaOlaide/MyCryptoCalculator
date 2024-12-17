package com.myproject.MyCryptoCalculator.service;
import com.myproject.MyCryptoCalculator.CoinTicker;
import com.myproject.MyCryptoCalculator.model.CoinTickerRequest;
import com.myproject.MyCryptoCalculator.model.Request;
import com.myproject.MyCryptoCalculator.model.Response;
public interface CryptoService {
    Response calculateCoin(Request request);
    Response fetchCoin(CoinTickerRequest coinTickerRequest);
}
