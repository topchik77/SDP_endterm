package controller;

import java.util.Scanner;

public class BookingCLI {
    private Scanner scanner = new Scanner(System.in);
    public void start() {
        System.out.println("Welcome to the Booking System!");
        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Book a Room");
            System.out.println("2. Show Bookings");
            System.out.println("3. Make a Payment");
            System.out.println("4. Exit");

            String choice = scanner.nextLine();
            switch (choice) {
                case "1" -> bookRoom();
                case "2" -> showBookings();
                case "3" -> makePayment();
                case "4" -> {
                    System.out.println("Exiting the Booking System");
                    return;
                }
                default -> System.out.println("Invalid choice, please try again");
            }
        }
    }
    private void bookRoom() {
    }
    private void showBookings() {
    }
    private void makePayment() {
    }
}
