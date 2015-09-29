package Bar;




public class Mozo {

    private int idMoso;
    private Turno turno;


    public Mozo () {
    }

    public Mozo(int idMoso, Turno turno) {
        this.idMoso = idMoso;
        this.turno = turno;
    }
    
    
    public int getIdMoso () {
        return idMoso;
    }

    public void setIdMoso (int val) {
        this.idMoso = val;
    }

    public Turno getTurno () {
        return turno;
    }

    public void setTurno (Turno val) {
        this.turno = val;
    }

}

