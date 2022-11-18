public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {

        Object texto = "Creando un objeto de la clase String... que tal!";
        Number num = Integer.valueOf(7); // Esta es la forma correcta de crear una instancia

        Boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String? " + b1);

        b1 = texto instanceof Integer;
        System.out.println("texto es del tipo Integer? " + b1);

        boolean b2 = num instanceof Integer;
        System.out.println("num es del tipo Integer? " + b2);

        boolean b3 = texto instanceof Object; // Object es la clase padre de todos los objetos, cualquier clase
        // de Java hereda de Object, todas las clases y los objetos, heredan de Object.
        System.out.println("texto es del tipo Object? " + b3);

        b2 = num instanceof Number; // Number es la clase padre de todas las clases de número (Integer, Long, Short, etc)
        System.out.println("num es del tipo Number? " + b2);

        b2 = num instanceof Long;
        System.out.println("num es del tipo Long? " + b2);

        b2 = num instanceof Double;
        System.out.println("num es del tipo Double? " + b2);

        b2 = num instanceof Object;
        System.out.println("num es del tipo Object? " + b2);

        Number decimal = Float.valueOf(45.54f);
        b3 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number? " + b3);

        b3 = decimal instanceof Double;
        System.out.println("decimal es del tipo Double? " + b3);

        b3 = decimal instanceof Float;
        System.out.println("decimal es del tipo Float? " + b3);

        b3 = decimal instanceof Integer;
        System.out.println("decimal es del tipo Integer? " + b3);

        b1 = b1 instanceof Boolean;
        System.out.println("b1 es del tipo Boolean? " + b1);
    }
}
