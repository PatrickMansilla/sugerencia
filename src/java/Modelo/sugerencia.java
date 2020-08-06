
package Modelo;
public class sugerencia {
    private int id_sugerencia;
    private String descripcion;
    private String fecha;
    private String persona;
    private String rol;
    private String estado;

    public sugerencia() {
    }

    public sugerencia(int id_sugerencia, String descripcion, String fecha, String persona, String rol, String estado) {
        this.id_sugerencia = id_sugerencia;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.persona = persona;
        this.rol = rol;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getId_sugerencia() {
        return id_sugerencia;
    }

    public void setId_sugerencia(int id_sugerencia) {
        this.id_sugerencia = id_sugerencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
}
