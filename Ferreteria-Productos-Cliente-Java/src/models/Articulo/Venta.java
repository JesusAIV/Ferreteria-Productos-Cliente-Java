package models.Articulo;

public class Venta {
    // Atributos
    public String codProducto;
    public int cantidad;

    // Constructor
    public Venta(){

    }
    public Venta(String CodProducto, int Cantidad){
        this.codProducto = CodProducto;
        this.cantidad = Cantidad;
    }
    
    // Metodo PagoTotal
    public double PagoTotal(){
        
        // Llama a la clase Articulo
        Articulo articulo = new Articulo();
        
        // Llama al metodo BuscarArticulo
        articulo = articulo.BuscarArticulo(this.codProducto);
        
        // Calcula el pago
        double pago = articulo.precio * this.cantidad;
        
        // Retorna el pago
        return pago;
    }
}
