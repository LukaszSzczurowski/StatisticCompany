import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class TestEmployes {
    public static void main(String[] args) {

        String readFile = "employes.txt";

        Statistic statistic = new Statistic();
        try (
                BufferedWriter bw = new BufferedWriter(new FileWriter("statistics.txt"))
                ){
            Employes[] employes = FileUtils.read(readFile);
            bw.write("Średnia wypłata: " + statistic.averageSalary(employes));
            bw.newLine();
            bw.write("Najmniejsza wypłata: " + statistic.minSalary(employes));
            bw.newLine();
            bw.write("Największa wypłata: " + statistic.maxSalary(employes));
            bw.newLine();
            bw.write("liczba pracowników: " + statistic.numberAllEmployes(employes));
            bw.newLine();
            bw.write("liczba pracowników w dziale IT: " + statistic.numberEmployesIT(employes));
            bw.newLine();
            bw.write("liczba pracowników w dziale Management: " + statistic.numberEmployesManagement(employes));
            bw.newLine();
            bw.write("liczba pracowników w dziale Support: " + statistic.numberEmployesSupport(employes));

        } catch (FileNotFoundException e){
            System.err.println("Nie znaleziono pliku " + readFile);
        } catch (IOException e) {
            System.err.println("Błąd odczytu z pliku");
        }

    }
}
