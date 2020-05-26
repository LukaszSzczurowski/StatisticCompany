import java.io.*;
import java.util.Scanner;

public class FileUtils {

    static Employes[] read(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int size = size(fileName);
        Employes[] employes = new Employes[size];
        for (int i = 0; i < employes.length; i++) {
            String line = reader.readLine();
            String[] tableSplitLine = line.split(";");
            double salary = Double.parseDouble(tableSplitLine[4]);
            employes[i] = new Employes(tableSplitLine[0],tableSplitLine[1],tableSplitLine[2],tableSplitLine[3],salary);
        }
        reader.close();
        return employes;
    }

    private static int size(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        int lines = 0;
        while (scanner.hasNextLine()){
            lines++;
            scanner.nextLine();
        }

        scanner.close();
        return lines;
    }
}
