package com11part3;
import java.time.LocalDateTime;

public class CompanyShares {

    private String stockSymbol;
    private int numberOfShares;
    private LocalDateTime transactionDateTime;

    public CompanyShares(String stockSymbol, int numberOfShares) {
        this.stockSymbol = stockSymbol;
        this.numberOfShares = numberOfShares;
        this.transactionDateTime = LocalDateTime.now();
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public LocalDateTime getTransactionDateTime() {
        return transactionDateTime;
    }

    public void addShares(int qty) {
        this.numberOfShares += qty;
        this.transactionDateTime = LocalDateTime.now();
    }

    public boolean removeShares(int qty) {
        if (qty > numberOfShares) return false;
        this.numberOfShares -= qty;
        this.transactionDateTime = LocalDateTime.now();
        return true;
    }

    @Override
    public String toString() {
        return stockSymbol + " | Shares: " + numberOfShares +
                " | Last Updated: " + transactionDateTime;
    }
}
