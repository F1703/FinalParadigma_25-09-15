package Bar;


import java.util.ArrayList;

public class Pedido {

    private ArrayList<Producto> listaProductos=new ArrayList<>();
    private int total;
 
    public Pedido() {
    }

    

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> val) {
        this.listaProductos = val;
    }

    public int getTotal() {
        return total;
    }
    public void setTotal(int val) {
        this.total = val;
    }

    
    
    
    //metodo para agregar productos a la lista
    public void setAgregarProducto(Producto producto){
       this.listaProductos.add(producto);
    }
    
    
    //metodo para calcular el total a pagar
    public void getCalcularTotal(){
        for (Producto listaProducto : listaProductos) {
            this.total=this.total+listaProducto.getSubtotal();
        }
    }

}
