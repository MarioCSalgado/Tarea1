package tarea1;

public class DetalleOrden {
    private int cantidad;
    public DetalleOrden(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    public void calcPrecio(){}
    public void calcPrecioSinIVA(){}
    public void calcIVA(){}
    public void calcPeso(){}
    
    @Override
    public String toString(){
       return "cantidad de articulos: "+cantidad;
}
}
