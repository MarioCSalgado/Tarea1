
package tarea1;

import java.util.Date;

class OrdenCompra {
    private Date fecha;
    private String estado;

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }
    
    public void calcPrecioSinIVA(){
        
    }
    public void calcIVA(){
    }
    public void calcPrecio(){
    }
    public void calcPeso(){
        
    }
    @Override
    public String toString(){
       return "Fecha: "+fecha+", Estado: "+estado;
}
}

