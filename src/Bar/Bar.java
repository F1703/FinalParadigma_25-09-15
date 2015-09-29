package Bar;


import java.util.ArrayList;


public class Bar {

    public static void main(String args[]){
        //creo los mosos
        Mozo mozo01=new Mozo(001, Turno.NOCHE);
        Mozo mozo02=new Mozo(002, Turno.TARDE);
        Mozo mozo03=new Mozo(003, Turno.MAÑANA);
        
        //creo los productos que se agregaran a la lista de pedido, 
        /* solo ingreso la cantidad de productos que se pedira xq los 
           precios son fijos, ejem: el primer producto solo constara 
            de 2 bebidas y dos 3 platos de comida, y por cada pedido 
            realizado se calcula un subtotal
        */
        Producto producto01=new Producto(1, 1);
            producto01.getCalcularSubtotal();
        Producto producto02=new Producto(1, 2);
            producto02.getCalcularSubtotal();
        Producto producto03=new Producto(1, 3);
            producto03.getCalcularSubtotal();
        Producto producto04=new Producto(2, 1);
            producto04.getCalcularSubtotal();
        Producto producto05=new Producto(2, 2);
            producto05.getCalcularSubtotal();
        Producto producto06=new Producto(2, 3);
            producto06.getCalcularSubtotal();
        Producto producto07=new Producto(3, 1);
            producto07.getCalcularSubtotal();
        Producto producto08=new Producto(3, 2);
            producto08.getCalcularSubtotal();
        Producto producto09=new Producto(3, 3);
            producto09.getCalcularSubtotal();
        
        //creamos el pedido  y agregamos los productos a la lista y calculamos el total
        Pedido pedido01=new Pedido();
        pedido01.getListaProductos().add(producto01);
        pedido01.getListaProductos().add(producto02);
        pedido01.getListaProductos().add(producto03);
        pedido01.getCalcularTotal();
        
        Pedido pedido02=new Pedido();
        pedido02.setAgregarProducto(producto04);
        pedido02.setAgregarProducto(producto05);
        pedido02.setAgregarProducto(producto06);
        pedido02.getCalcularTotal();
        
        Pedido pedido03=new Pedido();
        pedido03.setAgregarProducto(producto07);
        pedido03.setAgregarProducto(producto08);
        pedido03.setAgregarProducto(producto09);
        pedido03.getCalcularTotal();    
        
        /*creamos las mesas, las mesas que stan desocupadas no realizaron pedidos
           y las que estan ocupadas le agregamos un pedido
        */
        Mesa mesa01=new Mesa(01, EstadoDeMesa.OCUPADO,pedido01);
        Mesa mesa02=new Mesa(02, EstadoDeMesa.OCUPADO,pedido02);
        Mesa mesa03=new Mesa(03, EstadoDeMesa.OCUPADO,pedido03);
        Mesa mesa04=new Mesa(04, EstadoDeMesa.DESOCUPADO);
        Mesa mesa05=new Mesa(05, EstadoDeMesa.DESOCUPADO);
        Mesa mesa06=new Mesa(06, EstadoDeMesa.DESOCUPADO);
        
        //creamos las zonas, y le agregamos los mozos y las mesas
        Zona zona01=new Zona(001);
        zona01.getAgregarMozo(mozo01);
        zona01.getAgregarMesa(mesa01);
        zona01.getAgregarMesa(mesa02);
        zona01.getAgregarMesa(mesa04);
        
        //creo un array de zonas, un bar tiene varias zonas
        ArrayList<Zona> listaZonas=new ArrayList<>();
        listaZonas.add(zona01);
                
        
        /* ahora hay q recorrer las zonas para averiguar que moso esta en dicha
         zona y seleccionar una mesa para saver el pedido y la cantidad a pagar
        */
        int contadorMesas=0;
        for (Zona listaZona : listaZonas) {
            System.out.println("idZona: "+listaZona.getId_zona());
            //recorremos el array de mozos
            for (Mozo mozo1 : listaZona.getListaMozo()) {
                System.out.println(" -Moso:"+mozo1.getIdMoso()+", Turno:"+mozo1.getTurno());
            }
            //recorremos el array de mesas
            for (Mesa mesa1: listaZona.getListaMesa()) {
                contadorMesas=contadorMesas+1;
                //consultar si la mesa esta ocupada luego calcular el total a pagar
                if(mesa1.getEstado().equals(mesa1.getEstado().OCUPADO)){
                    System.out.println(" -Mesa:"+mesa1.getIdMesa());
                    System.out.println("  -Pedido:");
                    for (Producto producto1: mesa1.getPedido().getListaProductos()) {
                        System.out.println("   -CantBebidas:"+producto1.getCantBebida()+", CantPlatos:"+producto1.getCantaComida());
                        System.out.println("   -Subtotal:"+producto1.getSubtotal());
                    }//end forech
                    System.out.println("    -Total a pagar:"+mesa1.getPedido().getTotal());
                }//end if
            }
            System.out.println("cantMesas de Zona("+listaZona.getId_zona()+"):"+contadorMesas);
        }
        
        
    }
}

