import java.util.Locale;

public class EjemploStringMetodos {
    public static void main(String[] args) {
        
        String nombre = "Diego";

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Diego\") = " + nombre.equals("Diego"));
        System.out.println("nombre.equals(\"diego\") = " + nombre.equals("diego"));
        System.out.println("nombre.equalsIgnoreCase(\"diego\") = " + nombre.equalsIgnoreCase("diego"));
        System.out.println("nombre.compareTo(\"Diego\") = " + nombre.compareTo("Diego")); // compara lexicograficamente
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3)); // devuelve el char en el índice indicado
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1)); // obtengo de forma dinamica el último char
        System.out.println("nombre.substring(1) = " + nombre.substring(1));// devuelve la string desde el indice indicado
        System.out.println("nombre.substring(1,4) = " + nombre.substring(1,4));// desde el 1 hasta el 4, el 4 no se incluye
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace('a','4') = " + trabalenguas.replace('a','4'));
        // el siguiente método busca una letra o una cadena en la String y devuelve el index de la primera ocurrencia
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));
        // el siguiente me da la última ocurrencia
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf("a"));
        // también busca coincidencias, pero devuelve truo o false
        System.out.println("trabalenguas.contains(\"z\") = " + trabalenguas.contains("z"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"guas\") = " + trabalenguas.endsWith("guas"));
        System.out.println("  trabalenguas ".trim()); // este método quita espacios en blanco
        
    }
}
