
// creamos una clase Persona, lo ideal es siempre crear clases en archivos separados, pero lo usamos asi solo para el ejemplo
class Persona {
    private String nombre;

    public void modificarNombre (String nuevoNombre) {
        this.nombre = nuevoNombre; // al poner el this estoy haciendo referencia a la variable de la clase
    }

    public String leerNombre() {
        return this.nombre;
    }
}

public class PasarPorReferenciaV2 {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.modificarNombre("Carlos");

        System.out.println("Iniciamos el main con");
        System.out.println("Nombre de la persona = " + persona.leerNombre());

        System.out.println("Antes de llamar al método test");
        test(persona); // pasamos la referencia del objeto, al cambiarlo, se modifica en el método main
        System.out.println("Después de llamar al método test");
        System.out.println("Nombre de la persona = " + persona.leerNombre());
        System.out.println("Finaliza el método main con los datos de la persona modificados");

    }

    public static void test(Persona persona) {
        System.out.println("Iniciamos el método test");
        persona.modificarNombre("Pepe");
        System.out.println("Finaliza el método test");
    }
}

