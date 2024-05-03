package org.example.deals;

public class Deal {
    private final String comment;
    public int creditChange;
    public int debitChange;

    public Deal(String comment, int creditChange, int debitChange) {
        this.comment = comment;
        this.creditChange = creditChange;
        this.debitChange = debitChange;
    }

    public String getComment() {
        return comment;
    }


}
