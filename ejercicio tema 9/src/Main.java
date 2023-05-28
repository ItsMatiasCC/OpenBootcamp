//Crea una clase Persona con las siguientes variables:
//La edad
//El nombre
//El teléfono
//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona,
//esta nueva clase tendrá la variable credito solo para esa clase.
//Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre
//y el credito, tienes que darles valor y mostrarlas por pantalla.
//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable
//salario que solo tenga la clase Trabajador.


public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.edad = 19;
        cliente.nombre = "German";
        cliente.telefono = 350727124;
        cliente.credito = 200;
        cliente.datos();

        Trabajador trabajador = new Trabajador();
        trabajador.salario = 1200;
        trabajador.setSalario();
    }

     static class Persona{
        int edad;
        String nombre;
        int telefono;
    }

    static class Cliente extends Persona{
        private int credito;

        public void datos(){
            System.out.println("Nombre:"+ nombre);
            System.out.println("Edad: "+ edad);
            System.out.println("Telefono: " + telefono);
            System.out.println("Credito: " + credito);
        }
    }

    static class Trabajador extends Persona{
        private int salario;

        public void setSalario(){
            System.out.println("Salario: $" + salario);
        }
    }
}