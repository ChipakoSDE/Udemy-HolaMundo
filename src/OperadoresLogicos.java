public class OperadoresLogicos {
    public static void main(String[] args) {

        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;
        boolean b1 = i == j && k < l && m == true; // si la primera es false, no se evalúa el resto
        System.out.println("b1 = " + b1);

        boolean b2 = i == j || k < l || m == true; // si la primera es true, no se evalúa el resto
        System.out.println("b2 = " + b2);

        boolean b3 = i == j && k > l || m == false; // evalúa siempre de izquierda a derecha
        System.out.println("b3 = " + b3);

        boolean b4 = i == j && (k > l || m == false); // evalúa primero paréntesis y después inicia de la izq
        System.out.println("b4 = " + b4);

        boolean b5 = i != j || k < l && m == true; // aquí por prioridad se analiza primero el &&
        // y después el ||, el resultado del && es false y el del || es true, por lo que arroja true
        System.out.println("b5 = " + b5);

        boolean b6 = true || true && false;
        System.out.println("b6 = " + b6);

        boolean b7 = true || false && false || false; // el and tiene mayor prioridad y se analiza primero
        // despues se sigue analizando de izq a derecha los 2 or
        System.out.println("b7 = " + b7);


    }
}
