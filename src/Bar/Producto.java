package Bar;


public class Producto {

    private final int  precioBebida=15;
    private final int precioComida=23;
    private int cantBebida;
    private int cantaComida;
    private int subtotal;

    public Producto () {
    }

    //metodo para agregar los dos precios
    public Producto(int cantBebida, int cantaComida) {
        this.cantBebida = cantBebida;
        this.cantaComida = cantaComida;
    }

    public int getCantBebida() {
        return cantBebida;
    }

    public void setCantBebida(int cantBebida) {
        this.cantBebida = cantBebida;
    }

    public int getCantaComida() {
        return cantaComida;
    }

    public void setCantaComida(int cantaComida) {
        this.cantaComida = cantaComida;
    }

    
    
    
    
    public int getPrecioBebida () {
        return precioBebida;
    }
    

    public int getPrecioComida () {
        return precioComida;
    }

    
    public int getSubtotal () {
        return subtotal;
    }

    public void setSubtotal (int val) {
        this.subtotal = val;
    }

    
    
    //metod para calcular subtotal
    public void getCalcularSubtotal(){
        subtotal=(precioBebida*cantBebida)+(precioComida*cantaComida);
    }
}

