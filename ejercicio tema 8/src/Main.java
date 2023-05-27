//Crear clase Persona.
//Crear variables las privadas edad, nombre y telefono de la clase Persona.
//Crear gets y sets de cada propiedad.
//Crear un objeto persona en el main.
//Utiliza los gets y sets para darle valores
//a las propiedades edad, nombre y telefono, por último muéstralas por consola.

public class Main {

    public static void main(String[] args) {

        Persona nombre = new Persona();
        nombre.setNombre("Elias");
        System.out.println("nombre: " + nombre.getNombre());

        Persona edad = new Persona();
        edad.setEdad(20);
        System.out.println("edad: " + edad.getEdad());

        Persona telefono = new Persona();
        telefono.setTelefono(350124727);
        System.out.println("Telefono: " + telefono.getTelefono());
    }

    static class Persona {
        private int edad;
        private String nombre;
        private int telefono;
        //edad a publico
        public void setEdad(int edad){
            this.edad = edad;
        }
        public int getEdad(){
            return edad;
        }

        //nombre a publico
        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public String getNombre(){
            return nombre;
        }

        //telefono a publico
        public void setTelefono(int telefono){
            this.telefono = telefono;
        }
        public int getTelefono(){
            return telefono;
        }

    }
}