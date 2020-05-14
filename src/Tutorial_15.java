import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Tutorial_15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What file would you like to write to?: ");
        String file = scanner.nextLine();
        System.out.println("What directory would you like to ls?: ");
        String directory = scanner.nextLine();
        try {
            FileWriter fileWriter = new FileWriter(file);
            toDocument(fileWriter);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("The files in " + directory + " are: ");
        ls(directory);
        scanner.close();

    }

    public static void toDocument(FileWriter fw) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while(true) {
            System.out.println("Enter a word to add to the file (or type nothing to quit): ");
            input = scanner.nextLine();
            try {
                fw.write(input + " ");
            } catch (Exception e) {
                e.printStackTrace();
            }
            if(input.equals("")) {
                break;
            }
        }
        scanner.close();
    }

    public static void ls(String directory) {
        File file = new File(directory);
        if(file.isDirectory()) {
            File[] files = file.listFiles();
            if(files != null) {
                for(File f : files) {
                    System.out.print(f.getName() + " ");
                }
            }
            else {
                System.out.print("");
            }
            System.out.print("");
        } else {
            System.out.println("[ERROR] The input " + directory + " is not a directory!");
        }
    }
}
