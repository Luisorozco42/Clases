package venta;

public class Producto {

    private static int contadorProducto = 0;
    private final int idProducto;
    private String nombreProducto;
    private double precio;

    public Producto(){this.idProducto = ++Producto.contadorProducto;}

    public Producto(String nombreProducto, double precio) {
        this.idProducto = ++Producto.contadorProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public static int getContadorProducto() {
        return contadorProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString(){
        return "Producto{" +
                "IdProducto: " + this.idProducto +
                ", nombre: " + this.nombreProducto +
                ", precio: " + this.precio + "}";
    }

}
