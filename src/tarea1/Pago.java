package tarea1;

import java.util.Date;

public class Pago {
    private float monto;
    private Date fecha;

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getMonto() {
        return monto;
    }

    public Date getFecha() {
        return fecha;
    }
    @Override
    public String toString(){
       return "Monto: "+monto+",Fecha: "+fecha;
}
}




    
