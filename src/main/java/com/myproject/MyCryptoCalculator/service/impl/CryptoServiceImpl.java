package com.myproject.MyCryptoCalculator.service.impl;
import com.myproject.MyCryptoCalculator.CoinTicker;
import com.myproject.MyCryptoCalculator.model.CoinTickerRequest;
import com.myproject.MyCryptoCalculator.model.Request;
import com.myproject.MyCryptoCalculator.model.Response;
import com.myproject.MyCryptoCalculator.service.CryptoService;
import org.springframework.stereotype.Service;
@Service
public class CryptoServiceImpl implements CryptoService {
    @Override
    public Response calculateCoin(Request request) {
        CoinTicker coin = request.getCoinTicker();
        double usdPrice = coin.getUsdtPrice() * request.getQuantity();
        double nairaPrice = coin.getNairaPrice() * request.getQuantity();
        return new Response(usdPrice, nairaPrice);
    }
    @Override
    public Response fetchCoin(CoinTickerRequest coinTickerRequest) {
        CoinTicker coin = coinTickerRequest.getCoinTicker();
        double usdPrice = coin.getUsdtPrice();
        double nairaPrice = coin.getNairaPrice();
        return new Response(usdPrice, nairaPrice);
    }
}