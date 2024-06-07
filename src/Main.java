import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km = 0;
        int age = 0;
        int tripType = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the distance in kilometers : ");
        km = input.nextInt();
        System.out.println("Enter the age : ");
        age = input.nextInt();
        System.out.println("Enter the trip type (1 => One-way , 2=> Round-trip) : ");
        tripType = input.nextInt();

        if (km > 0 && age > 0 && (tripType == 1 || tripType == 2)) {
            double ticketPrice = km * 0.10;
            double ageDiscountRate = 0;

            if (age < 12){
                ageDiscountRate = 0.50;
            }else if (age <= 26){
                ageDiscountRate = 0.10;
            } else if (age >65) {
                ageDiscountRate = 0.30;
            }
            ticketPrice -= ticketPrice * ageDiscountRate;

            if (ticketPrice == 2){
                ticketPrice -= ticketPrice * 0.20;
                ticketPrice *= 2;
            }

            System.out.println("Total = " + ticketPrice);

        }else{
            System.out.println("Invalid input");
        }
    }
}