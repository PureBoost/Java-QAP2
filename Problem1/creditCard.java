package Problem1;

public class creditCard {
    private person owner;
    private money balance;
    private money creditLimit;

    public creditCard(person owner, money creditLimit) {
        this.owner = owner;
        this.creditLimit = new money(creditLimit);
        this.balance = new money(0.0);
    }

    public money getBalance() {
        return new money(this.balance);
    }

    public money getCreditLimit() {
        return new money(this.creditLimit);
    }

    public String getPersonals() {
        return this.owner.toString();
    }

    public void charge(money amount) {
        money newBalance = this.balance.add(amount);
        if (newBalance.compareTo(this.creditLimit) <= 0) {
            this.balance = newBalance;
        } else {
            System.out.println("Charge denied: exceeds credit limit.");
        }
    }

    public void payment(money amount) {
        this.balance = this.balance.subtract(amount);
    }
}
