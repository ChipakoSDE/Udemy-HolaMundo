public class SistemasNumericos {
    public static void main(String[] args) {
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);
        System.out.println(numeroDecimal + " convertido a binario es = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b1010111000; // al colocar "0b" delante del nro JAVA asume que estoy ingresando un nro binario.
        System.out.println(Integer.toBinaryString(numeroBinario) + " es el numeroBinario de " + numeroBinario);
        System.out.println(Integer.toBinaryString(numeroBinario) + " binario convertido a octal es = " + Integer.toOctalString(numeroBinario));

        int numeroOctal = 01762; // al colocar el 0 delante del nro JAVA asume que estoy ingresando un nro octal.
        System.out.println("numeroOctal = " + numeroOctal);
        System.out.println(numeroOctal + " convertido a hexadecimal es = " + Integer.toHexString(numeroOctal));

        int numeroHexa = 0x8fa; // al colocar "0x" delante del nro JAVA asume que estoy ingresando un nro hexadecimal.
        System.out.println("numeroHexa = " + numeroHexa);
        System.out.println(numeroHexa + " es el decimal de " + Integer.toHexString(numeroHexa));

    }
}
