public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle1:
        // etiqueto el primer bucle, el primer for
        for (int i = 0; i < 5; i++) {
            System.out.println(); // salto de linea
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1; // salgo del 2do bucle y vuelvo al bucle inicial
                }
                System.out.print("[i = " + i + ", j = " + j + "], "); // cuando i == 2 no entra en esta parte de código
                // porque vuelvo a la etiqueta bucle1
            }
        }

        System.out.println("\n\n========================================================================");
        etiqueta:
        for (int i = 0; i < 5; i++) {
            System.out.println(); // salto de linea
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break etiqueta; // salgo del bucle, no se reinicia
                }
                System.out.print("[i = " + i + ", j = " + j + "], "); // cuando i == 2 no entra en esta parte de código
                // porque hago un break y vuelvo a etiqueta, no se sigue ejecutando a partir de i == 2
            }
        }

        // también se puede hacer con un while dentro del for, por ejemplo vemos el caso de continue
        System.out.println("\n========================================================================");
        bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            int j = 0;
            while (j < 5) {
                if (i == 2) {
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
                j++;
            }
        }
        // ejemplo con dias laborales
        System.out.println("\n========================================================================");
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        int[] horas = {9, 10, 11, 12, 13, 14, 15, 16, 17};
        bucle:
        for (int i = 0; i < 7; i++) {
            int j = 0;
            bucle2:
            while (j < 9) {
                if ( i == 5 || i == 6) {
                    System.out.println(dias[i] + ": descanso de fin de semana!");
                    continue bucle;
                }
                if (j == 4 ){
                    System.out.println(dias[i] + " " + horas[j] + " horas: almuerzo");
                    j++;
                    continue bucle2;

                }
                System.out.println(dias[i] + " " + horas[j] + " horas: trabajando");
                j++;
            }
        }

    }
}
