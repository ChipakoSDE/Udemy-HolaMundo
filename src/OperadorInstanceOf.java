public class OperadorInstanceOf {
    public static void main(String[] args) {

        String texto = "Creando un objeto de la clase String... que tal!";
        Integer num = 7;  //en los 2 casos estoy instanciando un nuevo objeto de las clases wrapper.

        Boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String? " + b1);

        boolean b2 = num instanceof Integer;
        System.out.println("num es del tipo Integer? " + b2);

        boolean b3 = texto instanceof Object; // Object es la clase padre de todos los objetos, cualquier clase
        // de Java hereda de Object, todas las clases y los objetos, heredan de Object.
        System.out.println("num es del tipo Object? " + b3);

        b2 = num instanceof Number; // Number es la clase padre de todas las clases de número (Integer, Long, Short, etc)
        System.out.println("num es del tipo Number? " + b2);

        b2 = num instanceof Object;
        System.out.println("num es del tipo Object? " + b2);

        Double decimal = 45.54;
        b3 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number? " + b3);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean? " + b1);
    }
}
