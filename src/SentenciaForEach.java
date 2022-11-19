public class SentenciaForEach {
    public static void main(String[] args) {

        // recorre por cada elemento de un arreglo
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 15};
        for (int num : numeros){
            System.out.println("num = " + num);
        }

        String[] nombres = {"Carlos", "Pepa", "Miguel", "Paco", "Maria", "Alberto", "Beatriz", "Lalo"};
        for ( String n : nombres) {
            System.out.println("n = " + n);
        }
    }
}
