package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.io.FileNotFoundException;
import java.util.*;

public class reader
{
    public static <advertising> void main(String fileName; List<Advertising> advertising) {
        FileWriter writeFile = null;
        try {
            Iterator a = advertising.iterator();
            writeFile = new FileWriter(fileName);
            Advertising ad = (Advertising)a.nextLine();
            float tv = ad.getTV();
            float radio = ad.getRadio();
            float newspaper = ad.getNewspaper();
            float totalSale = ad.getTotalSale();
            writeFile.write(tv + " " + radio + " " + newspaper + " "+ totalSale);


        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        writeFile.close();
        System.out.println("File successfully written");
    } catch (FileNotFoundException e) {
            System.out.println("There is something wrong");
            e.printStackTrace();
        }
    }

    public static List<Advertising> readInfo(String fileName) {
        ArrayList advertising = new ArrayList();

        try {
            File file = new File(fileName);

                Scanner readFile = new Scanner(file);
            while (readFile.hasNextLine()) {
                String info = reader.nextLine();
                StringTokenizer stringTokenizer = new StringTokenizer(info);
                float tv = Float.parseFloat(stringTokenizer.nextToken());
                float radio = Float.parseFloat(stringTokenizer.nextToken());
                float newspaper = Float.parseFloat(stringTokenizer.nextToken());
                float totalSale = Float.parseFloat(stringTokenizer.nextToken());

                advertising.add(new Advertising(tv,radio,newspaper,totalSale));
            }

            readFile.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }

        return advertising;
    }

    private static String nextLine() {
    }

    private static boolean hasNextLine() {
        return true;
    }

}
