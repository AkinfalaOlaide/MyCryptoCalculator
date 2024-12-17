package com.myproject.MyCryptoCalculator.model;
public class Response {
    private double usdt;
    private double nairaPrice;

    public Response() {
    }

    public Response(double usdt, double nairaPrice) {
        this.usdt = usdt;
        this.nairaPrice = nairaPrice;
    }

    public double getUsdt() {
        return usdt;
    }

    public void setUsdt(double usdt) {
        this.usdt = usdt;
    }

    public double getNairaPrice() {
        return nairaPrice;
    }

    public void setNairaPrice(double nairaPrice) {
        this.nairaPrice = nairaPrice;
    }
}
