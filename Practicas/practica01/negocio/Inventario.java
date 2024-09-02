package practica01.negocio;

import java.util.List;
import java.util.ArrayList;

import practica01.clases.Producto;

public class Inventario {
    
    private List<Producto> productos;

    
    private void agregarProducto(Producto producto) {
        if (producto != null) {
            productos.add(producto);
        }
    }
    private void eliminarProducto(Producto producto) {
        if (productos.contains(producto)){
            productos.remove(producto);
        }
    }
    public void mostrarInventario() {
        try {
            for (Producto producto : productos) {
                producto.toString();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
