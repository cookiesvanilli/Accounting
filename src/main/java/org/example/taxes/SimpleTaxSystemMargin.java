package org.example.taxes;

public class SimpleTaxSystemMargin extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int margin = debit - credit;
        if (margin > 0) {
            return margin * 15 / 100;
        } else {
            return 0;
        }

        // return (debit - credit) * 15 / 100;
    }
}
