package models.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
    // Atributos
    public String dni;
    public String nombre;
    public String apellido;
    public String direccion;
    public String telefono;
    
    // ArrayList que va a almacenar al cliente
    ArrayList<Cliente> cliente = new ArrayList<Cliente>();
    
    // Constructor
    public Cliente(){
    }
    public Cliente(String Dni,String Nombre,String Apellido,String Direccion,String Telefono){
        this.dni = Dni;
        this.nombre = Nombre;
        this.apellido = Apellido;
        this.direccion = Direccion;
        this.telefono = Telefono;
    }
    // Metodo Acumular
    public Cliente Acumular(String Dni, String Nombre, String Apellido, String Direccion ,String Telefono) {
        Scanner sc = new Scanner(System.in);

        // Ingresar datos
        System.out.print("*************************\n"
                       + "    DATOS DEL CLIENTE    \n"
                       + "*************************\n");
        System.out.print("DIGITE EL DNI:         ");
        Dni = sc.nextLine();
        System.out.print("DIGITE LOS APELLIDOS:  ");
        Apellido = sc.nextLine();
        System.out.print("DIGITE LOS NOMBRES:    ");
        Nombre = sc.nextLine();
        System.out.print("DIGITE LA DIRECCION:   ");
        Direccion = sc.nextLine();
        System.out.print("DIGITE EL TELEFONO:    ");
        Telefono = sc.nextLine();

        // Nueva lista que acumula los clientes
        Cliente clientex = new Cliente(Dni,Nombre,Apellido,Direccion,Telefono);
        // Agrega 
        cliente.add(clientex);

        return this;

    }

    // Metodo Mostrar
    public void Mostrar(){
        // Busca los datos del cliente
        for (Cliente imp : cliente){
            this.dni = imp.dni;
            this.nombre = imp.nombre;
            this.apellido = imp.apellido;
            this.direccion = imp.direccion;
            this.telefono = imp.telefono;
        }
        // Imprime los datos del cliente
        System.out.println("\n=====================\n"
                            +"DETALLE DEL PEDIDO \n"
                            +"=====================\n");
        System.out.println("CLIENTE : " + nombre + " " + apellido + " - " + dni);
        System.out.println(direccion);
        System.out.println("TELEFONO : " + telefono);
    }
}
