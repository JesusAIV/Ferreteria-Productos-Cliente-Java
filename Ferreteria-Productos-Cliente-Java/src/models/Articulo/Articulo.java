package models.Articulo;
import java.util.Scanner;

public class Articulo {
    // Atributos
    public String codigo;
    public String descripcion;
    public String unidad;
    public double precio;
    
    // Constructor
    public Articulo(){
    }
    public Articulo(String Cod, String Descr, String Uni, double Pre){
        this.codigo = Cod;
        this.descripcion = Descr;
        this.unidad = Uni;
        this.precio = Pre;
    }

    // Metodo BuscarArticulo
    public Articulo BuscarArticulo(String codigoBuscar) {
        Scanner datoAr = new Scanner(System.in);

        // Array con los datos del producto
        String[] codigoS = {"A001", "A002", "A003", "A004", "A005"};
        String[] descripcionS = {"Cemento SOL", "Ladrillo King Kong", "Fierro ½", "Arena gruesa 40Kg", "Clavo 1\""};
        String[] unidadS = {"Bolsa", "Millar", "Barra", "Bolsa", "Ciento"};
        Double[] precioS = {22.00, 800.00, 32.00, 7.00, 10.00};

        int ArEncontrado = -1;
        // Busca el producto por el codigo
        for (int i = 0; i < codigoS.length; i++) {
            if (codigoS[i].equals(codigoBuscar)) {
                ArEncontrado = i;
            }
        }
        // Reemplaza los atributos por el producto encontrado
        if (ArEncontrado >= 0) {
            this.codigo = codigoS[ArEncontrado];
            this.descripcion = descripcionS[ArEncontrado];
            this.unidad = unidadS[ArEncontrado];
            this.precio = precioS[ArEncontrado];
        }
        return this;
    }
}