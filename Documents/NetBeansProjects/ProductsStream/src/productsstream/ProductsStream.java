package productsstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ProductsStream {

    public static void main(String[] args) {
        Product po1 = new Product("cod1", "parafusos", 3);
        Product po2 = new Product("cod2", "cravos", 4);
        Product po3 = new Product();

        try {
            DataInputStream leer = new DataInputStream(new BufferedInputStream(new FileInputStream("/home/oracle/Desktop/ProbaExer4/produtos.txt")));
            //Para que no sobreescriba hay que poner true aumentando asi su tamaño, con false si sobreescribe
            DataOutputStream escribir = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("/home/oracle/Desktop/ProbaExer4/produtos.txt")));
            //Ver si hay algo con el metodo available
            int c;
            //Hay que escribir primero para luego leer. No es como en los ficheros de los ej. anteriores
            escribir.writeUTF(po1.getCodigo());
            escribir.writeUTF(po1.getDescricion());
            escribir.writeDouble(po1.getPrezo());

            escribir.writeUTF(po2.getCodigo());
            escribir.writeUTF(po2.getDescricion());
            escribir.writeDouble(po2.getPrezo());

            escribir.close();
            //Mientras tenga algo que leer que escriba
            while (leer.available() > 0) {
                po3.setCodigo(leer.readUTF());
                po3.setDescricion(leer.readUTF());
                po3.setPrezo(leer.readDouble());

                System.out.println(po3.getCodigo() + ", " + po3.getDescricion() + ", " + po3.getPrezo());
            }
            leer.close();

        } catch (Exception e) {
        }
    }
}
