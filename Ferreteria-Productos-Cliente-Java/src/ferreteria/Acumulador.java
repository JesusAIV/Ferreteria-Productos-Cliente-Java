package ferreteria;
import java.util.Scanner;
import java.util.ArrayList;
import models.Cliente.Cliente; // Importa la clase Cliente
import models.Articulo.Articulo; // Importa la clase Articulo
import models.Articulo.Venta; // Importa la clase Venta

public class Acumulador {
    
    // Atributos
    public String Des;
    public String Uni;
    public double Pre;
    public double Tot;
    
    // Constructor
    public Acumulador(){
        
    }
    public Acumulador(String des, String uni, double pre, double tot){
        this.Des = des;
        this.Uni = uni;
        this.Pre = pre;
        this.Tot = tot;
    }

    // Metodo acumulador
    public void acumulador(){
        Scanner sc = new Scanner(System.in);
        
        // Nueva lista que acumula los articulos
        Articulo articulo = new Articulo();
        ArrayList<Acumulador> acumula = new ArrayList<Acumulador>();

        Cliente cliente = new Cliente();
        String respuesta = "si";
        double total = 0;
        double pago = 0;
        String Dni = "", Nombre = "", Apellido = "", Direccion = "",Telefono = "";
        cliente.Acumular(Dni, Nombre, Apellido, Direccion, Telefono);

        System.out.println("\n********************\n"
                            + "DATOS DEL PEDIDO\n"
                            + "********************");

        do {
            System.out.print("Ingrese codigo: ");
            String codigo = sc.next();

            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();

            articulo = articulo.BuscarArticulo(codigo);
            System.out.println(articulo.descripcion + " - " + articulo.unidad + " - S/. " + articulo.precio);
            Venta venta = new Venta(codigo, cantidad);
            pago = venta.PagoTotal();
            Acumulador acumulax = new Acumulador(articulo.descripcion, articulo.unidad, articulo.precio, pago);
            acumula.add(acumulax);

            total = total + pago;

            sc.nextLine();
            System.out.print("\nDesea continuar [SI] | [NO]");
            respuesta = sc.nextLine();

        }while(respuesta.equals("s"));
        
        // Llama al metodo Mostrar
        cliente.Mostrar();
        System.out.println("\n================================================");
        System.out.println("ITEM - DESCRIPCION - CANT - UND - PRECIO - TOTAL");
        System.out.println("================================================\n");

        // Recorre los datos almacenados para imprimirlo
        for (Acumulador imprime : acumula){
            System.out.println(imprime.Des + " - " + imprime.Uni + " - " + imprime.Pre + " - " + imprime.Tot);
        }
        
        // Imprime el total a pagar
        System.out.println("\nTOTAL A PAGAR S/." + total);
    }
}
