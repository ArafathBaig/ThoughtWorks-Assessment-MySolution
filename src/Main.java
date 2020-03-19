import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Map<String, Integer> discount = new HashMap<>();

    static {
        discount.put("DIS001",5);
        discount.put("DIS002",7);
        discount.put("DIS003",10);
    }

    public static void main(String[] args) {

        Machine machine  = new Machine();


        machine.calculate(11);
        machine.calculate(10);
        machine.calculate(25);
        machine.calculate(9);
        machine.calculate(1);
        machine.calculate(5);
        machine.calculate(11);
        machine.calculate(16);
        machine.calculate(30);
        machine.calculate(50);
        machine.calculate(25);
        machine.calculate(12);
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the amount of money: ");
//        int cost = scan.nextInt();
//        System.out.println("Enter any referral code if you have one: ");
//        String s = scan.next();
//
//        if(discount.containsKey(s)){
//            machine.calculate(cost + discount.get(s));
//        }else{
//            System.out.println("Coupon you entered is not valid.");
//        }



    }
}
