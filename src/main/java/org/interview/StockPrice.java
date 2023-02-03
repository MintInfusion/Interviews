package org.interview;

import java.time.LocalDate;

public class StockPrice {

    public StockPrice(LocalDate day, double price) {
        this.day = day;
        this.price = price;
    }

    private double price;

    private LocalDate day;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getDay() {
        return day;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }
}
