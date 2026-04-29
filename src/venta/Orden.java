package venta;

public class Orden {
    private final static int MAX_PRODUCTOS = 10;
    private static int contadorOrden = 0;
    private final int idOrden;
    private int contadorProducto;
    private Producto[] productosOrden;

    public Orden() {
        this.idOrden = ++Orden.contadorOrden;
        this.productosOrden = new Producto[MAX_PRODUCTOS];
    }

    public static int getContadorOrden() {
        return contadorOrden;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public Producto[] getProductosOrden() {
        return productosOrden;
    }

    public void agregarProducto(Producto producto){
        if (this.contadorProducto < Orden.MAX_PRODUCTOS) this.productosOrden[this.contadorProducto++] = producto;
        else System.out.println("Se ha superado el maximo de productos: " + Orden.MAX_PRODUCTOS);
    }

    public double calcularTotal(){
        var total = 0.0;
        for (int i = 0; i < this.contadorProducto; i++){
            total += this.productosOrden[i].getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.printf("""
                %nId orden: %d
                    Total de la orden: %.2f
                """, this.idOrden, this.calcularTotal());
        for (int i = 0; i < this.contadorProducto; i++){
            System.out.println("\t\t" + this.productosOrden[i]);
        }
    }
}
