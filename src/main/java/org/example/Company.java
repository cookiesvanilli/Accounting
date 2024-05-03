package org.example;

import org.example.deals.Deal;
import org.example.taxes.TaxSystem;

public class Company {
    public String title;
    private int debit;
    private int credit;
    public TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit = Math.abs(amount);
        }
    }

    public void payTaxes() {
        int totalTax = taxSystem.calcTaxFor(debit, credit);
        System.out.println("The company " + title + " paid the tax in the amount of: " + totalTax + " RUB");
        this.debit = 0;
        this.credit = 0;
    }

    public int applyDeals(Deal[] deals) {
        for (Deal deal : deals) {
            credit += deal.creditChange;
            debit += deal.debitChange;
        }
        int margin = debit - credit;
        payTaxes();
        return margin;
    }

    public void setDebit(int debit) {
        this.debit = debit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getDebit() {
        return debit;
    }

    public int getCredit() {
        return credit;
    }
}
