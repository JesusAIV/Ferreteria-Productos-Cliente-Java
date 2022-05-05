# Ferreteria-Productos-Cliente-Java

## Ferretería “El Tornillo Feliz”

Debido a la Pandemia la Ferretería “El Tornillo Feliz” desea implementar un sistema de registros de pedidos por teléfono, para lo cual necesitar registrar el DNI, Nombres y Apellidos, la Dirección, Teléfono y el pedido que se realiza.

- Se deberá desarrollar utilizando la **Programación Orientada a Objetos**
- Definir las clases y sus propiedades:
  - **Cliente:** dni, nombre, apellido, dirección, telefono
  - **Articulo:** codigo, descripción, unidad, precio
  - **Venta:** codArticulo, cantidad
- El sistema debe permitir el ingreso de datos del cliente y almacenarlo en un objeto de la clase Cliente.
- El sistema debe tener precargado los siguientes artículos en 4 arreglos:

| CODIGO | DESCRIPCION         | UNIDAD | PRECIO |
| ------ | ------------------- | ------ | ------ |
| A001   | Cemento SOL         | Bolsa  | 22.00  |
| A002   | Ladrillo King Kong  | Millar | 800.00 |
| A003   | Fierro ½            | Barra  | 32.00  |
| A004   | Arena gruesa 40 Kg  | Bolsa  | 7.00   |
| A005   | Clavo 1”            | Ciento | 10.00  |

- Esto deberá estar en un método de la clase **Articulo** que busca un artículo ingresando su código.
- El sistema inicia solicitando los datos del cliente.

```
*************************
DATOS DEL CLIENTE
*************************
DIGITE EL DNI: 77886699
DIGITE LOS APELLIDOS: LOPEZ
DIGITE LOS NOMBRES: CARLOS
DIGITE LA DIRECCION: CALLE LOS JASMINEZ 222 – CALLAO
DIGITE EL TELEFONO: 999888777
```

- Luego se debe ingresar los datos del pedido:
  - Se digita el CODIGO del artículo y se muestra la descripción, unidad y precio.
  - Luego se digita la cantidad.
```
*************************
DATOS DEL PEDIDO
*************************
DIGITE EL CODIGO: A002
Ladrillo King Kong – Millar – S/. 800
DIGITE LA CANTIDAD: 2
¿Desea agregar otro artículo al pedido [s/n]?s
```

- Estos datos deben ser almacenados en colecciones **ArrayList**.
- El sistema debe permitir el ingreso de varios ítems hasta indicar lo contrario:
  - “¿Desea agregar otro artículo al pedido [s/n]:”
```
************************* 
DATOS DEL PEDIDO 
************************* 
DIGITE EL CODIGO: A002 Ladrillo King Kong – Millar – S/. 800 
DIGITE LA CANTIDAD: 2 
¿Desea agregar otro artículo al pedido [s/n]?s 
DIGITE EL CODIGO: A005 Clavo 1” – Ciento – S/. 10 
DIGITE LA CANTIDAD: 4 
¿Desea agregar otro artículo al pedido [s/n]?n 
*************************
```

- Al finalizar deberá imprimirse en pantalla los datos del cliente, los ítems, el total a pagar.
```
======================== 
DETALLE DEL PEDIDO 
======================== 
CLIENTE: CARLOS LOPEZ - 77886699 
CALLE LOS JASMINEZ 222 – CALLAO 
TELEFONO: 999888777 
================================================ 
ITEM – DESCRIPCION – CANT – UND – PRECIO - TOTAL 
================================================ 
1 - Ladrillo King Kong – 2 - Millar – S/. 800 – S/. 1600 
2 – Clavo 1” – 4 – Ciento – S/. 10 – S/. 40 
================================================ 
TOTAL A PAGAR S/. 1640
```

[Descargar Proyecto](https://github.com/JesusIV11/Ferreteria-Productos-Cliente-Java/archive/refs/heads/main.zip)

