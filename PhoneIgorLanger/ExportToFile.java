package PhoneIgorLanger;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class ExportToFile extends PhoneBook {

    public void exportToFile() throws IOException {

        try {
            File f = new File("D:/Java/contacts.csv"); // Please enter here patch to data file
            FileWriter fw = new FileWriter(f, true);

            if (f.exists()) {

                System.err.println("file exists");

            } else {

                System.err.println("Create new file");
                f.createNewFile();
            }

            for (People p10 : contacts) {

                System.out.println("name " + p10.getName() + " and number " + p10.getPhoneNumber() + " saved to file " + f);
                fw.write(String.format("\"%s\" ", p10.getName()));
                fw.write(", ");
                fw.write(String.format("\"%s\" ", p10.getPhoneNumber()));
                fw.write("\n");
            }
            fw.close();
        } catch (Exception e) {
            System.err.println("An error occurred.");
            e.printStackTrace();
        }

    }
}


