public class Caracteres {
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

        System.out.println("Tipo char corresponde en bytes a " + Character.BYTES);
        System.out.println("Tipo char corresponde en bits a " + Character.SIZE);
        System.out.println("Valor máximo de un char " + Character.MAX_VALUE);
        System.out.println("Valor mínimo de un char " + Character.MIN_VALUE);
    }
}
