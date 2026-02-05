package JavaQap2.Problem1;

public class money {
    private int dollars;
    private int cents;

    public money (double amount) {
        this.dollars = (int) amount;
        this.cents = (int) ((amount - this.dollars) * 100);
    }

    public money (money otherobject) {
        this.dollars = otherobject.dollars;
        this.cents = otherobject.cents;
    }

    public money add (money otheramount) {
        int totalCents = this.cents + otheramount.cents;
        int extraDollars = totalCents / 100;
        int newCents = totalCents % 100;
        int newDollars = this.dollars + otheramount.dollars + extraDollars;
        return new money(newDollars + newCents / 100.0);
    }

    public money subtract (money otheramount) {
        int totalCents1 = this.dollars * 100 + this.cents;
        int totalCents2 = otheramount.dollars * 100 + otheramount.cents;
        int diffCents = totalCents1 - totalCents2;
        int newDollars = diffCents / 100;
        int newCents = diffCents % 100;
        return new money(newDollars + newCents / 100.0);
    }

    public int compareTo (money otherobject) {
        int totalCents1 = this.dollars * 100 + this.cents;
        int totalCents2 = otherobject.dollars * 100 + otherobject.cents;
        return Integer.compare(totalCents1, totalCents2);
    }

    public boolean equals (money otherobject) {
        return this.dollars == otherobject.dollars && this.cents == otherobject.cents;
    }

    public String toString() {
        return "$" + this.dollars + "." + String.format("%02d", this.cents);
    }
}
