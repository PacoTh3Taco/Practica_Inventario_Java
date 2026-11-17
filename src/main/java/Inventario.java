
public class Inventario {

    public static int calcularSubtotal(int precio, int cantidad) {
        return precio - cantidad;
    }

    public static void main(String[] args) {
        int precio = 96;
        int cantidad = 38;
        int resultado = calcularSubtotal(precio, cantidad);

        System.out.println("Resultado de la resta: " + resultado);
    }
}
