public class EjemploStringInmutable {
    public static void main(String[] args) {

        /* Una de las caracteristicas del String es que es inmutable, una vez que cambiamos su valor se crea
        un nuevo objeto y se guarda en esa variable, se genera una nueva instancia. Si modificamos un String
        con concat, no se modifica el objeto original, esto retorna una nueva instancia con esa modificación
        */

        String curso = "Programación Java";
        String profesor = "Chespi Rito";

        String resultado = curso.concat(profesor); // el cambio se asocia a una nueva instancia, resultado
        System.out.println("curso = " + curso); // no cambia curso
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        String resultado2 = curso.transform(c -> {
            return c + " con " + profesor;
        }); // el cambio se asocia a la nueva instancia resultado2
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);
        String resultado3 = resultado.replace("a", "A"); // lo mismo asociamos a resultado3
        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);

    }
}
