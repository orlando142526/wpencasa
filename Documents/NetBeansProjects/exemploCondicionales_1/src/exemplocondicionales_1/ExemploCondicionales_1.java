package exemplocondicionales_1;

import java.util.Scanner;

public class ExemploCondicionales_1 {

    public static void main(String[] args) {
        Condicional obx1 = new Condicional();
        int ed;
        ed = obx1.pedirInt();
        obx1.entrar(ed);
        obx1.permiso(ed);
        String resposta = obx1.permiso(ed);
        System.out.println(resposta);
        System.out.println(obx1.permiso(ed));

    }

}
