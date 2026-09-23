/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Objects;

/**
 *
 * @author domin
 */
public class Producto implements Comparable<Producto> {
    private int codigo;
    private String descripcion;
    private double precio;
    private int stock;
    private String rubro;
    public Producto(int codigo, String descripcion, double precio, int stock, String rubro) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.rubro = rubro;
    }
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
    public String getRubro() { return rubro; }
    public void setRubro(String rubro) { this.rubro = rubro; }

    @Override
    public int compareTo(Producto o) {
        return Integer.compare(this.codigo, o.getCodigo());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return codigo == producto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}