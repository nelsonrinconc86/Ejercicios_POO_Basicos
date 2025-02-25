package cine;

public class Sala {
    private String idSala;
    private String tipoSala;
    
    public Sala(){
        this.idSala=" ";
        this.tipoSala=" ";    
}

    public String getIdSala() {
        return idSala;
    }

    public String getTipoSala() {
        return tipoSala;
    }

    public void setIdSala(String idSala) {
        this.idSala = idSala;
    }

    public void setTipoSala(String tipoSala) {
        this.tipoSala = tipoSala;
    }
    
    public void imprimirDatos(){
        System.out.println("Codigo Sala: " + this.getIdSala());
        System.out.println("Tipo Sala: " + this.getTipoSala());
    }
       
    
    
    
}
