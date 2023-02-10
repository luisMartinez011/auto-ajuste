package CasoDos;

import java.util.Random;

public class Percepciones {

    private int horaDelDia = 1;
    private boolean niebla = false;
    private int luzExterior = 0;
    private int luzLampara = 100;

    protected void init() {
        simulacion();
    }

    private void agregarNiebla() {
        niebla = true;
        if (luzExterior > 20 && luzExterior < 100) {
            luzExterior -= 20;
        }
    }

    private void simulacion() {

        Random random = new Random();

        while (horaDelDia > 0 && horaDelDia < 24) {         

            if (horaDelDia > 0 && horaDelDia < 6) {

                int randomInt = random.nextInt(10);
                if( randomInt%2==0 ){
                    agregarNiebla();
                }else{                    
                    luzExterior = 25;
                    luzLampara -= luzExterior;
                }
                System.out.println("Hora : " + horaDelDia + " Luz exterior : " + luzExterior + " luz de lampara " + luzLampara);

            } else if (horaDelDia >= 6 && horaDelDia < 13) {

                

            } else if (horaDelDia >= 13 && horaDelDia < 17) {

                

            } else {

                

            }

            horaDelDia++;
        }

    }

}
