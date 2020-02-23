package ro.iteahome.bikesharing.ui;

import ro.iteahome.bikesharing.dao.ListStationsDAO;

import java.util.Scanner;

import static java.lang.System.exit;

public class UserListBikesUI {

    public static void listStations() {

        ListStationsDAO.printStations();
        printMainMessageAndHandleAction("\nPick a station number to view bikes docked at that station. \n" + "B. Go back. \n" + "X. Exit session.");
    }

    public static void printMainMessageAndHandleAction(String message) {
        System.out.println(message);
        Scanner userOptions = new Scanner(System.in);
        String option = userOptions.nextLine();

        try {
            switch (option) {
                case "1":
                    //
                    break;
                case "2":
                    //
                    break;
                case "3":
                    break;
                case "4":
                    //
                    break;
                case "5":
                    //
                case "6":
                    //
                case "7":
                    //
                case "8":
                    //
                case "9":
                    //
                case "10":
                    //
                case "b":
                case "B":
                    UserOptionsUI.enteringUserOptionsUI();
                case "x":
                case "X":
                    System.out.println("You have terminated your session. Thank you and see you soon!");
                    exit(0);

                    break;


                default:
                    printMainMessageAndHandleAction("Error. Not a valid option. Pick a station number to view bikes docked at that station. \n" + "B. Go back. \n" + "X. Exit session.");
                    return;

            }
        } catch (Exception e) {
            e.printStackTrace();

        }

    }
}