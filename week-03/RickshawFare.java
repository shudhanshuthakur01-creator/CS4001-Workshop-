import java.util.Scanner;

public class RickshawFare {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double distance;
        double time;

        boolean isLocal;
        boolean isNight;

        double baseFare = 50;
        double totalFare;

        // this variable stores distance
        System.out.println("Enter distance in km:");
        distance = input.nextDouble();

        // this variable stores time 
        System.out.println("Enter time in minutes:");
        time = input.nextDouble();

        // this variable stores if customer is local or not
        System.out.println("Is the customer local? (true/false)");
        isLocal = input.nextBoolean();
   
        // this variable stores if customer is traveling at night or not
        System.out.println("Is it night travel? (true/false)");
        isNight = input.nextBoolean();

        totalFare = baseFare + (distance * 20) + (time * 2);

        if (isLocal && distance > 5) {
            totalFare = totalFare - (totalFare * 0.10);
        }

        if (isNight) {
            totalFare = totalFare + 30;
        }
        // this calculates the final fare
        System.out.println("Final Fare: Rs. " + totalFare);

        input.close();
    }
}
