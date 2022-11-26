import java.util.Random;

public class EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores = {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
        double random = Math.random(); // el método random genera un número aleatorio entre 0 y 1 (no incluye el 1)
        System.out.println("random = " + random);
        random *= colores.length;
        random = Math.floor(random);
        System.out.println("colores = " + colores[(int)random]);

        /*
        * vemos la clase Random, que no es lo mismo que el método random de la clase Math, es más flexible y da más
        * variedad para generar nros enteros, decimales y aleatorios
        */
        Random randomObj = new Random();
        int randomInt = randomObj.nextInt(); // si pongo parámetros genera nros aleatorios entre 0 y ese nro, sin incluirlo
        // randomInt = 15 + randomObj.nextInt(25-15); // genera un nro entre 15 y 25
        System.out.println("randomInt = " + randomInt);

        // para el ejemplo del array deberia armarlo asi:
        randomInt = randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores[randomInt] = " + colores[randomInt]);

    }
}
