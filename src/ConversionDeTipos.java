public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr); //Integer.parseInt(String) nos convierte una String en un int
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        // abajo vemos otra forma de hacer lo mismo usando el método valueOf de la clase String
        otroNumeroStr = String.valueOf(otroNumeroInt+10); // hago lo mismo y le sumo 10
        String otroNumeroStr2 = String.valueOf(otroNumeroStr+10); // aquí toma el string y lo concatena con 10
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        System.out.println("otroNumeroStr = " + otroNumeroStr2);

        double otroRealDouble = 1.23456e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456e4f);
        System.out.println("otroRealStr = " + otroRealStr);

        /* En resumen se puede convertir cualquier dato primitivo a una String de las 2 maneras, utilizando el método
        toString de la clase del primitivo o utilizando el método valueOf de String.
         */

        /* Ahora vemos como convertir entre 2 tipos de primitivos */
        int i = 42000;
        short s = (short) i; // aquí fuerzo la conversion, esto se llama "cast" no conviene convertir int en short
        // porque podemos tener perdida de datos, int tiene 4 bytes y short solo 2.
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
    }
}
