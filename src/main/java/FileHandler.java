import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {

    public ArrayList<Covid19Data> restoreCovid19Data() throws Exception {
        ArrayList<Covid19Data> covid19DataList = new ArrayList<>();
        Covid19Data indlæstCovid19Data = null;

        File f = new File("/Users/denniscastillo/Desktop/Datamatiker/Java 1Sem/Covid19/src/main/resources/11_noegletal_pr_region_pr_aldersgruppe.csv");
        Scanner sc = new Scanner(f);

        while (sc.hasNextLine()) {
            //Læs linje
            String linje = sc.nextLine();

            //Split linje og læg tokens i attributter
            String[] attributter = linje.split(";");

            if (validateLine(attributter)) {
                // Opret Covid19Data objekt med konverterede attributter
                indlæstCovid19Data = new Covid19Data(
                        attributter[0], //Region
                        attributter[1], // aldersgruppe
                        Integer.parseInt(attributter[2]), //parse positive
                        Integer.parseInt(attributter[3]), //parse døde
                        Integer.parseInt(attributter[4]), // parse indlagte intensiv
                        Integer.parseInt(attributter[5]), // parse indlagte
                        attributter[6] //parse dato
                );
                covid19DataList.add(indlæstCovid19Data);
            }
        }
        return covid19DataList;
    }

    private boolean validateLine(String[] attributter) {
        return attributter[0].equals("Hovedstaden") ||
                attributter[0].equals ("Midtjylland") ||
                attributter[0].equals("Nordjylland") ||
                attributter[0].equals("Sjælland") ||
                attributter[0].equals("Syddanmark");
    }






}


        /*
        Midtjylland
        Nordjylland
        Sjælland
        Syddanmark*/