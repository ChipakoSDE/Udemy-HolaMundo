public class PrimitivosCaracteres {
    public static void main(String[] args) {
        char simbolo = '@';
        char unicode = '\u0040'; // acepta el caracter con codigo unicode
        char decimal = 64; // acepta el caracter con el codigo HTML
        System.out.println("simbolo = " + simbolo);
        System.out.println("unicode = " + unicode);
        System.out.println("decimal = " + decimal);
        // lo que pongo entre parentesis es lo primero que se ejecuta, esto se conoce como
        // precedencia de los operadores, primero ejecuta la comparacion y despues lee el String
        System.out.println("unicode = decimal? -> " + (unicode == decimal));
        System.out.println("simbolo = decimal? -> " + (simbolo == decimal));

        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n'; // tambien se puede usar System.lineSeparator()
        //el primer ejemplo elimina la a e incorpora un salto de linea
        System.out.println("Tipo char corresponde en bytes a" + retroceso + nuevaLinea + Character.BYTES);
        System.out.println("Tipo char corresponde en bits a" + tabulador + tabulador + Character.SIZE);
        // estos caracteres especiales se pueden usar tambien en un string
        System.out.println("Valor máximo de \t un char " + System.lineSeparator() + Character.MAX_VALUE);
        System.out.println("Valor mínimo de \bun char \n" + Character.MIN_VALUE); //escribe "deun char" y salta linea
    }
}
