public class PrimitivosEnteros {
    public static void main(String[] args) {
        
        byte numeroByte = 7;
        System.out.println("numeroByte = " + numeroByte);
        // Byte iniciado con mayúsculas es una clase wrapper asociada al tipo de datos byte
        // esta clase tambien existe para los otros tipos de datos primitivos (Integer, Short, Long, etc)
        System.out.println("Tipo byte corresponde en bytes a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bits a " + Byte.SIZE);
        System.out.println("Valor máximo de un byte " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de un byte " + Byte.MIN_VALUE);

        short numeroShort = 30000;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en bytes a " + Short.BYTES);
        System.out.println("Tipo short corresponde en bits a " + Short.SIZE);
        System.out.println("Valor máximo de un short " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de un short " + Short.MIN_VALUE);

        int numeroInt = 32768;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en bytes a " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bits a " + Integer.SIZE);
        System.out.println("Valor máximo de un int " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de un int " + Integer.MIN_VALUE);

        long numeroLong = 21474836488888L;
        // al colocar la L al final le confirmamos al IDE que estamos usando un tipo de datos long,
        // si no hacemos esto, por más que lo estamos definiendo como long lo toma como int y muestra error
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en bytes a " + Long.BYTES);
        System.out.println("Tipo long corresponde en bits a " + Long.SIZE);
        System.out.println("Valor máximo de un short " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de un short " + Long.MIN_VALUE);

        // desde Java 10 en adelante si definimos una variable usando la palabra reservada var
        // se asigna de forma automática al tipo de datos correspondiente al valor que le asignamos.
        var numeroVar = 127;



    }
}
