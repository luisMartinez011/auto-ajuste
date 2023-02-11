package CasoDos;

import java.util.Scanner;

// Expresiones matematicas
public class Autoajuste {

    private int luzExterior = 100;
    private int luzLampara = 0;
    
    protected static void init() throws InterruptedException{
        Percepciones percepciones = new Percepciones();
        percepciones.init();
        Autoajuste autoajuste = new Autoajuste();
        autoajuste.simulacion();;
    }

    private void simulacion(){

        Scanner sc = new Scanner(System.in);
        int decicion;
        do {
            
            
            System.out.println("Que porcentaje de luz solar hay ? ");
            luzExterior = sc.nextInt();
            luzLampara = (int) (100 - (100 / (1 + Math.exp(0.1 * (luzExterior - 50)))));

            System.out.println("El porcentaje de luz de la lámpara es: " + luzLampara + "%");

            System.out.println("Digitar un porcentaje diferente ? 1 = Si , 2 = No");
            decicion = sc.nextInt();

        } while ( decicion == 1 );

        sc.close();

    }

}
