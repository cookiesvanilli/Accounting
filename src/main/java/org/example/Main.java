package org.example;

import org.example.deals.Deal;
import org.example.deals.Expenditure;
import org.example.deals.Sale;
import org.example.taxes.SimpleTaxSystem;
import org.example.taxes.SimpleTaxSystemMargin;
import org.example.taxes.TaxSystem;

public class Main {
    public static void main(String[] args) {
        TaxSystem simpleTaxSystem = new SimpleTaxSystem();
        Company company = new Company("Rrr", simpleTaxSystem);
        company.shiftMoney(2000);
        company.shiftMoney(-60000);
        System.out.println(company.getDebit());
        System.out.println(company.getCredit());

        TaxSystem simpleTaxSystemMargin = new SimpleTaxSystemMargin();
        company.setTaxSystem(simpleTaxSystemMargin);
        company.payTaxes();
        System.out.println("==============");



        Sale saleHouse = new Sale("House", 5_000_000);
        Sale saleTV = new Sale("TV", 40_000);
        System.out.println(saleHouse.getComment());

        Expenditure expenditureCar = new Expenditure("Car", 350_000);
        Expenditure expenditureRoof = new Expenditure("Roof", 150_000);
        System.out.println(expenditureCar.getComment());

        Deal[] deals = {saleHouse, saleTV, expenditureCar, expenditureRoof};

        int margin = company.applyDeals(deals);
        System.out.println(margin);

    }
}