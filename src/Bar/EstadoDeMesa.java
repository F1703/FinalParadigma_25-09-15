package Bar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Franco
 */
public enum EstadoDeMesa {
    OCUPADO("OCUPADO"),DESOCUPADO("DESOCUPADO");
    
    private String estado;

    private EstadoDeMesa(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
