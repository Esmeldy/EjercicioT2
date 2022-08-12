public class Main {
    public static void main(String[] args) {
        System.out.println("Precio con IVA incluido: "+PrecioConIva(107));
    }

    /**
    *Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
    */
    public static double PrecioConIva(double precio) {
        double iva = 0.21;
        double resultado = iva * precio;
        return resultado + precio;
    }
}