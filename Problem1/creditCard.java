package JavaQap2.Problem1;

public class creditCard {
    private person owner;
    private money balance;
    private money creditLimit;

    // Constructor with Person and Money creditLimit parameters
    public creditCard(person owner, money creditLimit) {
        this.owner = owner;
        // Use copy constructor to create own copies of Money objects
        this.creditLimit = new money(creditLimit);
        this.balance = new money(0.0);
    }

    // Accessor method to get balance - returns a copy
    public money getBalance() {
        return new money(this.balance);
    }

    // Accessor method to get credit limit - returns a copy
    public money getCreditLimit() {
        return new money(this.creditLimit);
    }

    // Accessor method to get owner information as String
    public String getPersonals() {
        return this.owner.toString();
    }

    // Method to charge to the credit card
    public void charge(money amount) {
        money newBalance = this.balance.add(amount);
        // Check if new balance would exceed credit limit
        if (newBalance.compareTo(this.creditLimit) <= 0) {
            this.balance = newBalance;
        } else {
            System.out.println("Charge denied: exceeds credit limit.");
        }
    }

    // Method to make a payment on the credit card
    public void payment(money amount) {
        this.balance = this.balance.subtract(amount);
    }
}
