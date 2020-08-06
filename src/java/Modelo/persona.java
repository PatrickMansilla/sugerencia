
package Modelo;
public class persona {
    private int id_persona;
    private String nombres;
    private String ocupacion;
    private int edad;
    private String pais;
    private int dni;

    public persona() {
    }

    public persona(int id_persona, String nombres, String ocupacion, int edad, String pais, int dni) {
        this.id_persona = id_persona;
        this.nombres = nombres;
        this.ocupacion = ocupacion;
        this.edad = edad;
        this.pais = pais;
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getId_persona() {
        return id_persona;
    }

    public void setId_persona(int id_persona) {
        this.id_persona = id_persona;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
}
