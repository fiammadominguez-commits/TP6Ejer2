/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.TreeSet;

/**
 *
 * @author domin
 */
public class DeTodoSA {
    public static TreeSet<Producto> listaProductos = new TreeSet<>();
    // Agregar producto
    public static boolean agregarProducto(Producto p) {
    return listaProductos.add(p);   
}

// Buscar por código
    public static Producto buscarPorCodigo(int codigo) {
    for (Producto p : listaProductos) {
        if (p.getCodigo() == codigo) {
            return p;
        }
    }
    return null;
}

// Eliminar producto
    public static boolean eliminarProducto(int codigo) {
    Producto p = buscarPorCodigo(codigo);
    if (p != null) {
        listaProductos.remove(p);
        return true;
    }
    return false;
}

// Buscar por rubro
    public static TreeSet<Producto> buscarPorRubro(String rubro) {
    TreeSet<Producto> resultado = new TreeSet<>();
    for (Producto p : listaProductos) {
        if (p.getRubro().equalsIgnoreCase(rubro)) {
            resultado.add(p);
        }
    }
    return resultado;
}

// Buscar por nombre (descripcion)
    public static TreeSet<Producto> buscarPorNombre(String nombre) {
    TreeSet<Producto> resultado = new TreeSet<>();
    for (Producto p : listaProductos) {
        if (p.getDescripcion().toLowerCase().contains(nombre.toLowerCase())) {
            resultado.add(p);
        }
    }
    return resultado;
}

// Buscar por precio menor o igual
    public static TreeSet<Producto> buscarPorPrecio(double precioMax) {
    TreeSet<Producto> resultado = new TreeSet<>();
    for (Producto p : listaProductos) {
        if (p.getPrecio() <= precioMax) {
            resultado.add(p);
        }
    }
        return resultado;
}

    
}
