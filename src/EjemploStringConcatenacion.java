public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Chespi Rito";

        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle + numeroA + numeroB);
        /* En este caso concatena el detalle con el número 10 y el número 5, no suma los números esto se debe a la
        precedencia de los operadores, como encuentra un String a la izquierda, supone que todos los datos son
        String y los concatena. Siempre se analiza de izquierda a derecha, salvo que ponga la suma entre
        paréntesis primero analiza los paréntesis, por lo tanto me daria como resultado la suma.
         */
        System.out.println(detalle + (numeroA + numeroB)); // el paréntesis se analiza primero

        String detalle2 = curso.concat(" con ").concat(profesor); // anidamos la concatenación.
        System.out.println(detalle2);

    }
}
