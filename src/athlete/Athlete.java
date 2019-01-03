package athlete;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Athlete {
    private Set<ConstructorAthlete> lista = new ArrayList<>();


    public void readFromFile() {

        File file = new File("Athlete.csv");

        try (Reader reader = new FileReader(file.getAbsolutePath())) {
            char[] buffer = new char[4];
            int read = reader.read(buffer);

            StringBuilder text = new StringBuilder();
            do {

                text.append(String.copyValueOf(buffer));
                read = reader.read(buffer);

            } while (read != -1);

            List<ConstructorAthlete> lista = addToList(text.toString());
            System.out.println(text);

        } catch (
                IOException e) {
            System.out.println(e.getMessage());

        }

    }


    public List<ConstructorAthlete> addToList(String allText) {
        List<ConstructorAthlete> lista = new ArrayList<>();
        String[] lis = allText.split("\n");

        for (String line : lis) {
            String[] indicator = line.split(",");
            ConstructorAthlete person = new ConstructorAthlete(indicator[0], indicator[1], indicator[2],
                    indicator[3], indicator[4], indicator[5], indicator[6]);

            lista.add(person);
        }
        return lista;


    }

    public List<ConstructorAthlete> getLista() {
        return lista;
    }



}
