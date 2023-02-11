package CasoDos;

import java.util.Random;

public class Percepciones {

    private int horaDelDia = 1;
    public boolean niebla = false;
    private int luzExterior = 0;
    private int luzLampara = 100;

    protected void init() throws InterruptedException {
        simulacion();
    }

    private void agregarNiebla() {
        niebla = true;
        if (luzExterior > 20 && luzExterior < 100) {
            luzExterior -= 20;
        }
    }

    private void estadoDelDia(int cantidadLuz) {
        Random random = new Random();
        int randomInt = random.nextInt(10);
        if (randomInt % 2 == 0) {
            agregarNiebla();
        } else {
            luzExterior = cantidadLuz;
            luzLampara -= luzExterior;
        }
    }

    private void simulacion() throws InterruptedException {

        while (horaDelDia > 0 && horaDelDia < 24) {

            Thread.sleep(2000);

            if (horaDelDia > 0 && horaDelDia < 6) {
                estadoDelDia(25);
            } else if (horaDelDia >= 6 && horaDelDia < 13) {
                estadoDelDia(40);
            } else if (horaDelDia >= 13 && horaDelDia < 17) {
                estadoDelDia(90);
            } else if (horaDelDia >= 17 && horaDelDia < 20) {
                estadoDelDia(50);
            } else {
                estadoDelDia(25);
            }

            if (niebla) {
                System.out.println("Hora : " + horaDelDia + " Luz exterior : " + luzExterior + " luz de lampara "
                        + luzLampara + " con niebla");
            } else {
                System.out.println("Hora : " + horaDelDia + " Luz exterior : " + luzExterior + " luz de lampara "
                        + luzLampara + " sin niebla");
            }
            niebla = false;
            horaDelDia++;
        }

    }

}
