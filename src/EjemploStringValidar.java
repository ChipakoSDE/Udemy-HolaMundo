public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        if (esNulo) { // cuando el curso es nulo, ingresa y le asigna un valor
            curso = " ";//"Programación Java";
        }

        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco);

        /*
        if (!esVacio) { // solo imprime cuando el curso no sea vacío
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso: ".concat(curso));
        }
        Es mejor utilizar isBlank porque es mas completa, valida las 2 cosas, que no este vacio y no sea espacio en blanco
        */

        if (!esBlanco) { // solo imprime cuando curso no sea un espacio en blanco, no este vacío
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso: ".concat(curso));
        }

        //System.out.println("Bienvenido al curso: ".concat(curso)); // cuando es null da error
        //System.out.println("Bienvenido al curso: " + curso); // no da error, a pesar de que curso sea nulo


    }
}
