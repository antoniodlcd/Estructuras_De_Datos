package practica01.negocio;

import practica01.clases.Producto;

public class Tienda {

    private Inventario inventario;

    private void comprarProducto(Integer Producto){
        inventario.agregarProducto(Producto);
    }
    private void venderProducto(Integer Producto){
        inventario.eliminarProducto(Producto);
    }
    private void mostrarInventario(){
        inventario.mostrarInventario();   
    }
    
}
