public class SentenciaIfElse {
    public static void main(String[] args) {

        float promedio = 2.3f;
        System.out.println("Tu Promedio es: " + promedio);

        if(promedio >= 6.5) {
            System.out.println("Felicitaciones, excelente promedio!");
        } else if (promedio >= 6){
            System.out.println("Muy buen promedio");
        } else if (promedio >= 5.5){
            System.out.println("Buen promedio");
        } else if (promedio >= 5) {
            System.out.println("Regular, necesitas esforzarte un poco más");
        } else if (promedio >= 4) {
            System.out.println("Insuficiente, necesitas estudiar más!");
        } else {
            System.out.println("Reprobado!");
        }

    }
}
