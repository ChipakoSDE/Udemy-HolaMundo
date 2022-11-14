public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación Java"; // defino la variable desde la literal.
        String curso2 = new String("Programación Java"); // defino la variable con el constructor.
        boolean esIgual = curso == curso2; // nos da falso porque son 2 instancias distintas, a pesar de tener el mismo valor
        System.out.println("curso == curso2 = " + esIgual);
        // si quiero comparar por el valor tengo que usar el método equals
        esIgual = curso.equals(curso2); // aquí nos compara los valores de los objetos
        // también existe el método equalsIgnoreCase que compara sin tener en cuenta mayúsculas.
        System.out.println("curso.equals(curso2) = " + esIgual);
        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 " + esIgual);
        /* En este caso nos da como resultado true porque al crear 2 objetos String con los mismos valores
        en la literal, no nos asigna un nuevo espacio en memoria, lo que hace es asignar la referencia del
        objeto que ya existe. Esto se hace para optimizar.
         */

    }
}
