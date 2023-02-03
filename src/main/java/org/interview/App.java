package org.interview;

import java.time.LocalDate;
import java.util.ArrayList;

public class App
{
    public static void main( String[] args ) {

        SimpleStrategy simpleStrategy = new SimpleStrategy();
        double money = simpleStrategy.calculateDepot(100.0, getData());

        System.out.println("balance: " + money);
    }

    private static StockPrice[] getData() {
        ArrayList<StockPrice> data = new ArrayList<>(31);

        data.add(new StockPrice(LocalDate.of(2021, 1, 21), 36.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 22), 38.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 23), 35.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 24), 35.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 25), 35.0));

        data.add(new StockPrice(LocalDate.of(2021, 1, 1), 35.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 2), 37.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 3), 38.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 4), 41.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 5), 32.0));

        data.add(new StockPrice(LocalDate.of(2021, 1, 11), 44.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 12), 50.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 13), 53.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 14), 48.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 15), 49.0));

        data.add(new StockPrice(LocalDate.of(2021, 1, 6), 30.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 7), 28.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 8), 27.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 9), 26.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 10), 40.0));

        data.add(new StockPrice(LocalDate.of(2021, 1, 16), 43.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 17), 42.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 18), 35.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 19), 32.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 20), 33.0));

        data.add(new StockPrice(LocalDate.of(2021, 1, 26), 34.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 27), 35.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 28), 39.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 29), 41.0));
        data.add(new StockPrice(LocalDate.of(2021, 1, 30), 40.0));

        data.add(new StockPrice(LocalDate.of(2021, 1, 31), 44.0));
        return data.toArray(StockPrice[]::new);
    }
}
