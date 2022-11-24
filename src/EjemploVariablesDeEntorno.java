import java.util.Map;

public class EjemploVariablesDeEntorno {
    public static void main(String[] args) {

        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de ambiente (o de entorno) del sistema = " + varEnv);

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);

        // recorro las variables de entorno y las voy listando con un for-each
        System.out.println("\n----- Listado de variables de entorno -----\n");
        for (String key: varEnv.keySet()) {
            System.out.println(key + " -> " + varEnv.get(key));
        }
    }
}
