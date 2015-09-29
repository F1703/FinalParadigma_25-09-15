package Bar;


import java.util.ArrayList;


public class Zona {

    private int id_zona;
    private ArrayList<Mozo> listaMozo=new ArrayList<>();

    private ArrayList<Mesa> listaMesa=new ArrayList<>();

    public Zona () {
    }

    public Zona(int id_zona) {
        this.id_zona = id_zona;
    }

    public int getId_zona() {
        return id_zona;
    }

    public void setId_zona(int id_zona) {
        this.id_zona = id_zona;
    }

    
    public ArrayList<Mesa> getListaMesa () {
        return listaMesa;
    }

    public void setListaMesa (ArrayList<Mesa> val) {
        this.listaMesa = val;
    }

    public ArrayList<Mozo> getListaMozo () {
        return listaMozo;
    }

    public void setListaMozo (ArrayList<Mozo> val) {
        this.listaMozo = val;
    }

    
    //metodo para agregar mozo a la variable listaMozo
    public void getAgregarMozo(Mozo moso){
        this.listaMozo.add(moso);
    }
    
    //metodo para agregar mesa a la variable listaMesa
    public void getAgregarMesa(Mesa mesa){
        this.listaMesa.add(mesa);
    }
    
    
}

