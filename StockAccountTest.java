package com11part3;
public class StockAccountTest {

    public static void main(String[] args) {

        StockAccount acc = new StockAccount("John Doe", 50000);

        acc.buy("TCS", 10, 3200);
        acc.buy("INFY", 5, 1500);
        acc.buy("TCS", 5, 3100);  // updates existing company

        acc.sell("INFY", 2, 1600);
        acc.sell("TCS", 20, 3200); // not enough shares

        acc.printReport();
    }
}

