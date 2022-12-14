import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Guests> guests = new ArrayList<>();

        while(true) {
            System.out.println();
            System.out.println("Choose one: "); choice = scanner.nextInt();
            System.out.println("1. Data insertion");
            System.out.println("2. Data printing");
            System.out.println("3. Names & prices in a particular city");
            System.out.println("4. Quit");

            switch (choice) {
                case 1:
                    System.out.println();
                    guests.add(insertData(scanner));
                    break;
                case 2:
                    System.out.println();
                    printData(guests);
                    break;
                case 3:
                    System.out.println();
                    printHotelGuestsFromParticularCity(guests, scanner);
                    break;
                case 4: exit(0);
                    break;
                default:
                    System.out.println("Incorrect input");
            }
        }
    }

    public static void printData(ArrayList<Guests> guests) {
        System.out.println("All data:");
        for (Guests h : guests) {
            System.out.println(h.toString());
        }
    }

    public static Guests insertData(Scanner scanner) {

        String test = scanner.nextLine();
        String name;
        String EGN;
        int familyStatus;
        double downtime;
        float price;
        String residence;

        System.out.println("Please insert data");
        System.out.println();
        System.out.print("Name: "); name = scanner.nextLine();
        System.out.println();
        System.out.print("EGN: "); EGN = scanner.nextLine();
        System.out.println();
        System.out.print("Family Status - 1 for engaged, 2 for single: "); familyStatus = scanner.nextInt();
        System.out.println();
        System.out.print("Nights: "); downtime = scanner.nextInt();
        System.out.println();
        System.out.print("Price for beds: "); price = scanner.nextInt();
        System.out.println();
        String test = scanner.nextLine();
        System.out.print("City: "); residence = scanner.nextLine();

        return new HotelGuests(name, EGN, familyStatus, downtime, price, residence);
    }

    public static void printHotelGuestsFromParticularCity(ArrayList<Guests> guests, Scanner sc) {

        int totalPrice = 0;
        ArrayList<Guests> newGuests = new ArrayList<>();

        String nothing = sc.nextLine();

        System.out.println();
        System.out.println("Enter a desired residence: ");
        String residence = sc.nextLine();

        for (Guests h : guests) {
            if(h.residence.equals(residence)) {
                newGuests.add(h);
                totalPrice += h.price;
            }
        }

        System.out.println();
        for (Guests h : newGuests) {
            System.out.println("The name of the guest is: " + h.name);
        }

        System.out.println("Total price for beds of the beds: " + totalPrice);
    }
}