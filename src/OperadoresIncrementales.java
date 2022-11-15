public class OperadoresIncrementales {
    public static void main(String[] args) {

        // Pre-Incremento
        int i = 1;
        int j = ++i; // primero se incrementa y después se asigna a la var j
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post-Incremento
        i = 2;
        System.out.println("inicial de i = " + i);
        j = i++; // primero se asigna a la var j y después se incrementa
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Pre-Decremento
        i = 3;
        j = --i; // primero se decrementa y después se asigna a la var j
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Post-Decremento
        i = 4;
        j = i--; // primero se asigna a la var j y después se decrementa
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        System.out.println("++j = " + (++j));
        System.out.println("j++ = " + (j++));
        System.out.println("j = " + j); // el valor final es 6 porque se incrementó después de mostrarlo

    }
}
