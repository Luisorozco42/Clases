package persona;

public class Persona {
    // originalmente, era práctica hora se volvió el reto #22
    //bueno luego tocaba hacer otra clase dentro del mismo paquete, pero es lo mismo a que lo haga en main
    private static int contadorPersonas = 0; //recordemos que los static no funcionan como los demás atributos
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String celular;

    public Persona() {this.idPersona = ++Persona.contadorPersonas;}

    public Persona(String nombre, String apellido, String email, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.celular = celular;
        this.idPersona = ++Persona.contadorPersonas;//asignamos el idUnico con la variable estatica
    }

    public int getIdPersona() {return idPersona;}

    public String getNombre() {return this.nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public static int getContadorPersona(){return Persona.contadorPersonas;}

    //demostrando por qué todas las clases son objetos
    @Override
    public String toString(){return "Id: " + this.idPersona + ", Nombre: " + this.nombre + ", Apellido: " + this.apellido;}
}
