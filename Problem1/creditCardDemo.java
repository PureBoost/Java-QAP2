package JavaQap2.Problem1;

public class creditCardDemo {

public static void main (String [] args) {

final money LIMIT = new money(1000); final money FIRST_AMOUNT = new money(200); final money SECOND_AMOUNT = new money(10.02); final money THIRD_AMOUNT = new money(25); final money FOURTH_AMOUNT = new money(990);

person owner = new person("Christie", "Diane", new address("237J Harvey Hall","Menomonie", "WI" , "54751")); creditCard visa = new creditCard(owner, LIMIT); System.out.println(visa.getPersonals()); System.out.println("Balance: " + visa.getBalance()); System.out.println("Credit Limit : " + visa.getCreditLimit()); System.out.println(); System.out.println("Attempt to charge " + FIRST_AMOUNT);

visa.charge(FIRST_AMOUNT); System.out.println("Balance : " + visa.getBalance()); System.out.println("Attempt to charge " + SECOND_AMOUNT); visa.charge(SECOND_AMOUNT); System.out.println("Balance : " + visa.getBalance()); System.out.println("Attempt to pay " + THIRD_AMOUNT); visa.payment(THIRD_AMOUNT);

System.out.println("Balance : " + visa.getBalance());

System.out.println("Attempt to charge " + FOURTH_AMOUNT);

visa.charge(FOURTH_AMOUNT);

System.out.println("Balance : " + visa.getBalance());


}

}
