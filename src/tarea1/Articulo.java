package tarea1;

public class Articulo {
        private float peso;
        private String nombre;
        private String descripcion;
        private float precio;

    public Articulo(float peso, String nombre, String descripcion, float precio) {
        this.peso = peso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public float getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecio() {
        return precio;
    }
        
        @Override
    public String toString(){
       return "Peso: "+peso+",nombre: "+nombre+",String: "+descripcion+",precio: "+precio;
}    
}
