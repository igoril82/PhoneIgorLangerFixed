package PhoneIgorLanger;

import java.io.*;
import java.util.Scanner;

public class ImportFromFile  extends PhoneBook{

    /**
     * TThis is a function that import all data from external file.
     */
    public void importFromFile() {
        System.out.println("Please enter the patch of DataFile");
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine();
        File f = new File(fileName);
        try {
            System.out.println("Below is a list of all contacts in the Phone book");
            File file = new File(fileName);
            Scanner sc = new Scanner(file);
            sc.useDelimiter("\\Z");
            System.out.println("Name   ||  Number");

            BufferedReader bf = new BufferedReader(
                    new FileReader(f));

            String line = bf.readLine();

            while (line != null) {
                list.add(line);
                line = bf.readLine();
            }
            bf.close();
            String[] array
                    = contacts.toArray(new String[0]);
            for (String str : array) {
                System.out.println(str);
            }
            System.out.println(sc.next());
        } catch (Exception e) {
            System.err.println("You Phone book is empty or patch to file is incorrect.");
            e.printStackTrace();

        }

    }

}


