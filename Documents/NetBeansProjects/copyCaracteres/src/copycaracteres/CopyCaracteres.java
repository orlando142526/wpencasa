package copycaracteres;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyCaracteres {

    public static void main(String[] args) {

        try {
            FileWriter escribir = new FileWriter("/home/oracle/Desktop/ProbaExer4/texto11.txt");
            //Para que no sobreescriba hay que poner true aumentando asi su tamaño, con false si sobreescribe
            FileReader leer = new FileReader("/home/oracle/Desktop/ProbaExer4/texto10.txt");
            int c;
            //Mientras tenga algo que leer que escriba
            while ((c = leer.read()) != -1) {
                escribir.write(c);
            }
            escribir.close();
            leer.close();
        } catch (Exception e) {
        }
    }

}
