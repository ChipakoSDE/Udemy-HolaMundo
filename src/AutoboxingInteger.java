public class AutoboxingInteger {
    public static void main(String[] args) {

        Integer[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int suma = 0;

        /*
        Autoboxing es convertir un primitivo en referencia, auto-unboxing es convertir referencia en primitivo
         */

        // aqui lo hago de forma explícita, también se puede hacer de forma implícita
        for (Integer i : enteros) { // recorro el array de enteros y sumo el valor solo si es par
            if (i.intValue() % 2 == 0) {
                suma += i.intValue();
            }
        }
        System.out.println("suma = " + suma);

        // implícita
        int suma2 = 0;
        for (Integer i : enteros) { // recorro el array de enteros y sumo el valor solo si es par
            // al poner solo i % 2, se está corriendo por abajo el método intValue() de la clase wrapper Integer
            if (i % 2 == 0) {
                suma2 += i;
            }
        }
        System.out.println("suma2 = " + suma2);
        /*
        Cuando usamos la clase wrapper de cualquier primitivo y queremos utilizar operaciones aritméticas
        no es necesario invocar antes a los métodos de la clase para convertir a un primitivo
         */
    }
}
