package entities;

public class Account {
    private String number;
    private String holder;
    private double balance;

    public static final Double TAX = 5.0;

    // Constructors

    public Account() {
    }

    public Account(String number, String holder, Double initialDeposit) {
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    public Account(String number, String holder) {
        this.number = number;
        this.holder = holder;
    }

    // Getters and Setters

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getNumber() {
        return number;
    }

    public Double getBalance() {
        return balance;
    }

    // Methods

    public void deposit (Double value) {
        if (value > 0) {
            balance += value;
        }
        else {
            System.out.println("Deposit need to be more than 0.");
        }
    }

    public void withdraw (Double value) {
        if (value > 0 && value <= balance) {
            balance -= (value + TAX);
        }
        else {
            System.out.println("Insufficient balance.");
        }
    }

    public String toString() {
        return String.format("Account: %s | Holder: %s | Balance: $ %.2f%n",number, holder, balance );
    }
}
