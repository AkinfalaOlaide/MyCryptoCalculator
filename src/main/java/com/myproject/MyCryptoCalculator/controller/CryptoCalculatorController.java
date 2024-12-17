package com.myproject.MyCryptoCalculator.controller;
import com.myproject.MyCryptoCalculator.CoinTicker;
import com.myproject.MyCryptoCalculator.model.CoinTickerRequest;
import com.myproject.MyCryptoCalculator.model.Request;
import com.myproject.MyCryptoCalculator.model.Response;
import com.myproject.MyCryptoCalculator.service.CryptoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/coin")
public class CryptoCalculatorController {
    @Autowired
    private CryptoService cryptoService;

    @PostMapping("/calculate")
    public ResponseEntity<Response> calculatePrice(@Valid @RequestBody Request request){
        return new ResponseEntity<>(  cryptoService.calculateCoin(request), HttpStatus.OK);
    }

    @PostMapping("/fetch")
    public ResponseEntity<Response> fetchCoin(@Valid @RequestBody CoinTickerRequest coinTickerRequest){
        return new ResponseEntity<>(  cryptoService.fetchCoin(coinTickerRequest), HttpStatus.OK);
    }
}
