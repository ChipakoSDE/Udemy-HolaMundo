public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;
        /*
        Aquí queremos probar cuanto tiempo demoran las diferentes variantes de concatenación
         */

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 10; i++){
            c = c.concat(a).concat(b).concat("\n"); // 500 => 2mseg, 1000 => 6mseg, 10000 => 105mseg, 100000 => 5804mseg
            // c += a + b + "\n"; // 500 => 19mseg, 1000 => 26mseg, 10000 => 72mseg, 100000 => 2311mseg
            // sb.append(a).append(b).append("\n"); // 500 => 0mseg, 1000 => 0mseg, 10000 => 2mseg, 100000 => 9mseg
            /* arriba estamos invocando los métodos en forma encadenada, es lo mismo que escribir
            sb.append(a);
            sb.append(b);
            sb.append("\n");
             */

        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
