package com.nagarro.remotelearning.main;

import com.nagarro.remotelearning.util.DateFormatter;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateFormatter customFormatter = new DateFormatter();

        System.out.print("Enter the date (format dd-MM-yyyy): ");
        String inputDate = scanner.nextLine();

        try {
            String formattedDate = customFormatter.formatDate(inputDate);
            System.out.println("Formatted date: " + formattedDate);
        } catch (Exception e) {
            System.out.println("Invalid input. Please make sure to follow the dd-MM-yyyy format.");
        }
    }
}
