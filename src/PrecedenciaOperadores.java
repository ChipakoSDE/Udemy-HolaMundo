public class PrecedenciaOperadores {
    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = (i + j + k) / 3d;
        System.out.println(String.format("Su promedio es = %.2f", promedio)); // limito el resultado a 2 decimales

        promedio = (i + j + k) / 3d * 10;
        System.out.println("promedio = " + promedio);

        promedio = (++i + j-- + k) / 3d * 10; // primero incrementa i, suma j (despues lo decrementa)
        System.out.println("promedio = " + promedio);
        System.out.println("i = " + i); // a promedio se le pasa el valor incrementado
        System.out.println("j = " + j); // a promedio se le pasa el valor original y después se decrementa

    }
}
