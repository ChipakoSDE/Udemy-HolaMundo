public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2; //false
        Boolean objBoolean = Boolean.valueOf(primBoolean); // boxing
        Boolean objBoolean2 = Boolean.valueOf("false");
        Boolean objBoolean3 = true; // explícita

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objBoolean = " + objBoolean);
        System.out.println("objBoolean2 = " + objBoolean2);

        System.out.println("Comparando 2 objetos boolean: " + (objBoolean == objBoolean2)); // true
        // a diferencia de los numéricos, se puede comparar el valor con el ==, lo de abajo es lo mismo que lo de arriba
        System.out.println("Comparando 2 objetos boolean: " + (objBoolean.equals(objBoolean2))); // true
        System.out.println("Comparando 2 objetos boolean: " + (objBoolean2 == objBoolean3)); // true

        boolean primBoolean2 = objBoolean2.booleanValue(); // unboxing (no es necesario)
        System.out.println("primBoolean2 = " + primBoolean2);

    }
}
