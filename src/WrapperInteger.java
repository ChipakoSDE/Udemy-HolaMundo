public class WrapperInteger {
    public static void main(String[] args) {

        // Integer intObjeto = new Integer(32768); // desde JDK 7 en adelante esta deprecada esta forma
        // de crear una instancia de las wrapper

        // pasar de un primitivo a un entero por referencia (a un objeto)
        int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(intPrimitivo); // esta forma de declarar se conoce como boxing
        Integer intObjeto2 = intPrimitivo; // esta forma se conoce como auto-boxing
        System.out.println("intObjeto2 = " + intObjeto2);

        // pasar de un entero por referencia (un objeto) a un primitivo
        int num = intObjeto;
        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        // convertimos de un String a un entero
        String valorTV = "67000";
        Integer valor = Integer.valueOf(valorTV);

        Short shortObjeto = intObjeto.shortValue(); // vamos a tener perdida de info xq 32768 excede el max de short (32767)
        System.out.println("shortObjeto = " + shortObjeto); // muestra -32768, no es el valor correcto

        Byte byteObjeto = intObjeto.byteValue(); // también hay perdida de info
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);

    }
}
