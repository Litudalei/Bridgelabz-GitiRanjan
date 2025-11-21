package com11part3;

import java.util.ArrayList;
import java.util.List;

public class StockAccount {

    private String customerName;
    private double accountBalance;
    private List<CompanyShares> portfolio;

    public StockAccount(String customerName, double accountBalance) {
        this.customerName = customerName;
        this.accountBalance = accountBalance;
        this.portfolio = new ArrayList<>();
    }

    public double valueOf() {
        return accountBalance;
    }

    public void buy(String symbol, int shares, double pricePerShare) {
        double totalCost = shares * pricePerShare;

        if (totalCost > accountBalance) {
            System.out.println("Insufficient balance to buy shares.");
            return;
        }

        CompanyShares existing = findCompany(symbol);

        if (existing != null) {
            existing.addShares(shares);
        } else {
            portfolio.add(new CompanyShares(symbol, shares));
        }

        accountBalance -= totalCost;
        System.out.println("Bought " + shares + " shares of " + symbol);
    }

    public void sell(String symbol, int shares, double pricePerShare) {
        CompanyShares existing = findCompany(symbol);

        if (existing == null) {
            System.out.println("No shares of " + symbol + " found.");
            return;
        }

        if (!existing.removeShares(shares)) {
            System.out.println("Not enough shares to sell.");
            return;
        }

        double totalValue = shares * pricePerShare;
        accountBalance += totalValue;

        System.out.println("Sold " + shares + " shares of " + symbol);

        // If all shares sold, remove the company
        if (existing.getNumberOfShares() == 0) {
            portfolio.remove(existing);
        }
    }

    private CompanyShares findCompany(String symbol) {
        for (CompanyShares cs : portfolio) {
            if (cs.getStockSymbol().equalsIgnoreCase(symbol)) {
                return cs;
            }
        }
        return null;
    }

    public void printReport() {
        System.out.println("------ Stock Report for " + customerName + " ------");
        for (CompanyShares cs : portfolio) {
            System.out.println(cs);
        }
        System.out.println("Account Balance: " + accountBalance);
        System.out.println("--------------------------------------------");
    }
}

