import java.io.IOException;

public class EjemploEjecutarProgramaSO {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process proceso;
        String[] comandos = {"notepad"};
        try {
            if (System.getProperty("os.name").startsWith("Windows")){
                proceso = rt.exec(comandos);
            } else if (System.getProperty("os.name").startsWith("Mac")){
                comandos[0] = "textedit";
                proceso = rt.exec(comandos);
            } else {
                comandos[0] = "gedit";
                proceso = rt.exec(comandos);
            }
            proceso.waitFor(); // espera hasta que se cierre el programa

            } catch (Exception e) {
            System.err.println("El comando es desconocido - " + e.getMessage());
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(0);
    }
}
