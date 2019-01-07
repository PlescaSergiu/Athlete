package athlete;

import java.io.*;
import java.util.*;


public class Athlete {
    private Set<ConstructorAthlete> lista = new TreeSet<ConstructorAthlete>(new TimeComparator());

    public void readFromFile() {

        File file = new File("Athlete.csv");

        try {

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String[] date = null;
            while ((line = br.readLine()) != null) {
                date = line.split(",");
                lista.add(new ConstructorAthlete(date[0], date[1], date[2], date[3], date[4], date[5], date[6]));
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());

        }

    }

    public void printResults() {

        System.out.println("Results _-_: ");
        int i = 1;
        for (ConstructorAthlete athlete : lista) {
            System.out.println(i + " " + athlete);
            i++;
        }
    }




}
