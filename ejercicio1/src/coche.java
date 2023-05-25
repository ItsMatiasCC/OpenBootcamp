public class coche {
    private int numeroPuertas;


    public int obtNumeroPuertas(){
        return numeroPuertas;
    }

    public void agregarPuertas() {
        numeroPuertas++;
    }
    public static class Main {
        public static void main(String[] args){
            coche miCoche = new coche();
            miCoche.agregarPuertas();

            System.out.println(miCoche.obtNumeroPuertas());
        }
    }
}


