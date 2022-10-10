package tarea1;

public class Tarea1 {
      public static void main(String[] args) {
        OrdenCompra ordenUno = new OrdenCompra();
        ordenUno.setFecha(9);
        ordenUno.setEstado("resuelta");
        
        Cliente clienteUno = new Cliente("Juan","17.726.236-5");
        Direccion direccion1 = new Direccion("Barros Arana 883");
        
        DetalleOrden DetUno=new DetalleOrden(3);
        Articulo ArtUno=new Articulo(200,"Manzana","Fruta",300);
        Articulo ArtDos=new Articulo(500,"Confort Noble","6 rollos de papel higienico",2000);
        Articulo ArtTres=new Articulo(1000,"Chocapic","Cereal de Chocolate",2150);
      
      }
    }
    
