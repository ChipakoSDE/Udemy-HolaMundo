public class EjemploStringMetodosArreglo {
    public static void main(String[] args) {

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        System.out.println("Largo de arreglo = " + arreglo.length); //arreglo.length es un atributo del arreglo
        for (int i = 0; i < arreglo.length; i++){
            System.out.print(arreglo[i] + " ");
        }

        System.out.println("\ntrabalenguas = " + trabalenguas.split("a"));

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;
        for (int i = 0; i< l; i++){
            System.out.println(arreglo2[i]);
        }
        String archivo = "alguna.imagen.json";
        String[] archivoArr = archivo.split("\\."); //con la barra doble indico que busco el char del punto, también puedo usar [.]
        for (int i = 0; i < archivoArr.length; i++){
            System.out.println(archivoArr[i]);
        }
        System.out.println("extensión = " + archivoArr[archivoArr.length-1]);
    }
}
