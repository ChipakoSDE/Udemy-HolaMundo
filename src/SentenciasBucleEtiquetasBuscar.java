public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "tres tristes tigrestigres comen trigo en un trigal lleno de tigres";
        String palabra = "tigres";
        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra; // limito el max de la frase porque si encuentra la palabra
        // al final de la frase no tiene sentido que la siga recorriendo una vez que la encuentra.

        int cantidad = 0;
        char letra = 'i';
        buscar:
        // primero comienzo a recorrer la frase
        for (int i = 0; i <= maxFrase;) {
            int k = i; // creo una variable nueva para poder recorrer la frase, buscando la palabra, sin alterar el lugar
            // en el que estoy en el for de frase.
            /* busco si el caracter de la palabra coincide con el de la frase, si coincide lo sigo evaluando hasta que
            encuentro toda la palabra en la frase (y salgo del for) o hasta que una letra no coincide y vuelvo al
            for inicial, el de frase, en la posición siguiente */
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    i++; // solo incremento el i cada vez que el caracter de palabra es != al de la frase
                         // hago esto para que cuando encuentre la palabra en la frase no vuelva a iterar en el 2do
                         // caracter de esa palabra
                    continue buscar;
                }
            }
            cantidad++;
            i = i + maxPalabra;

        }
        System.out.println("La palabra '" + palabra + "' fue encontrada " + cantidad + " veces en la frase");
    }
}
