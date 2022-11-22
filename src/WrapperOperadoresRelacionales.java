public class WrapperOperadoresRelacionales {
    public static void main(String[] args) {

        Integer num1 = Integer.valueOf(1000);
        Integer num2 = num1;
        Integer num3 = 127;
        Integer num4 = 127;

        System.out.println("num1 = " + num1 + " ; num 2 = " + num2);
        System.out.println("Son el mismo objeto? " + (num1 == num2));

        num2 = 1000;
        System.out.println("num1 = " + num1 + " ; num 2 = " + num2);
        System.out.println("Son el mismo objeto? " + (num1 == num2));
        // tienen el mismo valor pero es otra instancia, es otro objeto, por lo que no son iguales
        // cuando usamos el == en numéricos compara por el valor, cuando usamos en objetos (numéricos), compara por la instancia

        // esto tiene una excepción en Java, hasta 127 compara por valor a pesar de que sean instancias.
        System.out.println("Son el mismo objeto (127)? " + (num3 == num4)); // el resultado debería ser false,
        // pero muestra true por la excepción de números hasta 127

        // aquí comparamos el valor contenido en el objeto, utilizando el método equals
        System.out.println("Tienen el mismo valor? " + (num1.equals(num2)));
        // otra forma de hacer lo mismo
        System.out.println("Tienen el mismo valor? " + (num1.intValue() == num2.intValue()));

        // para el resto de los relacionales >, >=, < o <=, también puedo usar los tipos de referencia, como en las
        // operaciones aritméticas (+,-,*,/, %). Por debajo se convierten usando el auto-unboxing y se pasan a primitivos
        // cosa que no pasa con el ==
        num2 = 2000;
        boolean condicion = num1 > num2;
        System.out.println("Condición = " + condicion);

        // lo de arriba es lo mismo que:
        boolean condicion2 = num1.intValue() > num2.intValue();
        System.out.println("Condición2 = " + condicion2);


    }
}
