public class Main {
    public static void main(String[] arg){

        //coche
        Coche miCoche = new Coche();
        //incrementador de puertas
        miCoche.incrementarPuertas(5);
        System.out.println(miCoche.puertas);
    }

    //Clase Coche
    public static class Coche{
        int puertas ;

        //Metodo incrementarPuerta
        int incrementarPuertas(int incrementar){
            return puertas = incrementar;
        }
    }
}