package Bar;



public class Mesa {

    private int idMesa;
    private EstadoDeMesa estado;
    private Pedido pedido;

    public Mesa() {
    }

    //este metodo para las mesas desocupadas, al estar desocupada es xq no realizo pedido
    public Mesa(int idMesa, EstadoDeMesa estado) {
        this.idMesa = idMesa;
        this.estado = estado;
    }

    //metodo para las mesas que estan ocupadas x lo tanto realizaron un pedido
    public Mesa(int idMesa, EstadoDeMesa estado, Pedido pedido) {
        this.idMesa = idMesa;
        this.estado = estado;
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public EstadoDeMesa getEstado() {
        return estado;
    }

    public void setEstado(EstadoDeMesa estado) {
        this.estado = estado;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int val) {
        this.idMesa = val;
    }

}
