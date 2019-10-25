package io.turntabl;

public class Borrower {

    private String borrowerName;
    private String date;
    private String time;
    private BorrowerType type;

    @Override
    public String toString(){

        return "Name of Borrower: " + borrowerName +
                "Date borrowed: " + date +
                "Time borrowed: " + time +
                "Borrower Type: " + type ;
    };

    public Borrower(String borrowerName, String date, String time, BorrowerType type) {
        this.borrowerName = borrowerName;
        this.date = date;
        this.time = time;
        this.type = type;
    }

    public BorrowerType getType() {
        return type;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }
}
