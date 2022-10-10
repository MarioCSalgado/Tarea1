package tarea1;

import java.util.Date;

public class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNumero() {
        return numero;
    }

    public String getRut() {
        return rut;
    }

    public Date getFecha() {
        return fecha;
    }
    @Override
    public String toString(){
       return """
              Documento Tributario
              :numero: """+numero+", rut: "+rut+",fecha: "+fecha;
}
}



