package PhoneIgorLanger;

import java.io.IOException;
import java.util.Scanner;

public class UserMenu extends PhoneBook {
    ExportToFile ex = new ExportToFile();
    ImportFromFile im = new ImportFromFile();

    public void userMenu() throws IOException {


        System.out.println("Hello , please choose from the following options: \n 1 - add new contact , \n 2 - delete exists contact , \n 3 - list of all contacts in Phone book , \n 4 - search specific contact by name, \n 5 - sorting all contacts  by name  from small to large , \n 6 - sorting all contacts by number in reverse order, \n 7 - show values in reverse order,  \n 8 - delete duplicates values, \n 9 - export data to file, \n 10 - import data from file" + ",\n 11 - exit. ");

        Scanner input = new Scanner(System.in);
        String line = input.nextLine().trim();


        while (!line.equals("exit")) {


            switch (line) {

                case "1":
                    System.out.println("your choose - 1 add new contact");
                    addNewContact();
                    break;

                case "2":
                    System.out.println("your choose - 2 delete exists contact");
                    deleteContact();
                    break;


                case "3":
                    System.out.println("your choose 3 - list all contact");
                    readContacts();
                    break;


                case "4":
                    System.out.println("your choose 4 - search contact by name");
                    searchContactByName();
                    break;

                case "5":
                    System.out.println("your choose - 5 sorting all contacts  by name from small to large");
                    sortingByNameFromSmallToLarge();
                    break;


                case "6":
                    System.out.println("your choose - 6 sorting all contacts by number from small to large");
                    sortingByNumberFromSmallToLarge();
                    break;

                case "7":
                    System.out.println("your choose - 7 sorting all contacts in reverse order");
                    sortingInReverseOrder();
                    break;

                case "8":
                    System.out.println("your choose - 8 delete duplicates contacts");
                    deleteDuplicateValues();
                    break;

                case "9":
                    System.out.println("your choose - 9  export contacts to file ");
                    // ex.exportToFile(); // A problem with empty array
                    exportToFile();
                    break;

                case "10":
                    System.out.println("your choose - 10 import contacts from file ");
                    im.importFromFile();
                    break;
                case "11":
                    System.out.println("you choose - 11 Good bay, Phone Book is terminated now.");
                    System.exit(0);

                default:
                    System.err.println("Invalid command please try again");
                    break;

            }
            System.out.println();
            userMenu();
            System.out.print("\n> ");
            line = input.nextLine().trim();


        }
        System.out.println("Good bay, Phone Book is terminated now.");
        System.exit(0);
        input.close();
    }
}


