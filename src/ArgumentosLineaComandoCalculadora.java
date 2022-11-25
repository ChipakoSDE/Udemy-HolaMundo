public class ArgumentosLineaComandoCalculadora {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Por favor ingresar una operacion (suma, resta, multi o div) y 2 enteros");
            System.exit(-1); // el status -1 en System.exit significa que sale porque ocurre un error
        }
        String operacion = args[0];
        int a = 0;
        int b = 0;
        double resultado = 0.0;
        try{
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);

        } catch (NumberFormatException e) {
            System.err.println("Cuidado a y b tiene que ser nros enteros! Vuelva a intentar");
            System.exit(-1);
        }

        switch (operacion){
            case "suma":
                resultado = a + b;
                break;
            case "resta":
                resultado = a - b;
                break;
            case "multi":
                resultado = a * b;
                break;
            case "div":
                if (b == 0) {
                    System.out.println("No se puede dividir entre 0");
                    System.exit(-1);
                }
                resultado = (double) a / b;
                break;
            default:
                resultado = a + b;
        }
        System.out.println("El resultado de la operación '" + operacion + "' es " + resultado);

    }
}
