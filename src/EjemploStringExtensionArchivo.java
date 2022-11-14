public class EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna.imagen.jpg";
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.indexOf('.')+1) = " + archivo.substring(archivo.indexOf('.')+1));
        // el caso de arriba no seria útil en el caso de que el nombre de archivo contenga un punto.
        System.out.println("archivo.substring(archivo.lastIndexOf('.')) = " + archivo.substring(archivo.lastIndexOf('.')+1));
    }
}
