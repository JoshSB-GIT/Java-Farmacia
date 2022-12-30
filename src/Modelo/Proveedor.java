
package Modelo;

/**
 *
 * @author User
 */
public class Proveedor {
    private int idProveedor;
    private String nombre;
    private String descripcion;

    public Proveedor(int idProveedor, String nombre, String descripcion) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Proveedor() {
    }
    
    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
