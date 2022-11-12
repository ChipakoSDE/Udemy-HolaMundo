public class PrimitivosFloat {
    public static void main(String[] args) {
        
        float realFloat = 2.12e3f; // esto es lo mismo que 2120f
        float realFloat2 = 0.00000000015f; // esto es lo mismo que 1.5e-10f
        System.out.println("realFloat = " + realFloat);
        System.out.println("realFloat2 = " + realFloat2);
        System.out.println("Tipo float corresponde en bytes a " + Float.BYTES);
        System.out.println("Tipo float corresponde en bits a " + Float.SIZE);
        System.out.println("Valor máximo de un float " + Float.MAX_VALUE);
        System.out.println("Valor mínimo de un float " + Float.MIN_VALUE);

        double realDouble = 3.4028235E38; // cuando ponemos el punto automaticamente toma el valor como double
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo double corresponde en bytes a " + Double.BYTES);
        System.out.println("Tipo double corresponde en bits a " + Double.SIZE);
        System.out.println("Valor máximo de un double " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de un double " + Double.MIN_VALUE);

        var varFlotante = 3.1416f;
        System.out.println("varFlotante = " + varFlotante);
    }
}
