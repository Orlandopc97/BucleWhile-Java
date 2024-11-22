public class Main {
    public static void main(String[] args) {

        int contador = 1;


        //mientras que
        //mientras que se siga cumpliendo la condicion se seguira ejecutando el ciclo

        /*
        while (contador <= 10){
            System.out.println(contador);

            //Actualizacion de la variable, siempre
            contador++;
        }
        */

        //Al ya no entrar en la condicion del bucle queda afuera contador  = 6
        //System.out.println(contador);


        ////////////////////////////////////////////////
        //Do while
        //lo que sucede pasa antes del while

        do {
            System.out.println("Esto sucede antes de la condicion: " + contador);

            // Actualizacion de la variable
            contador++;

        }while(contador <= 5);
            System.out.println(contador);
    }
}