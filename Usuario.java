public class Usuario {
    private String nombre;
    private int telefono;
    private String rut;
    // Biblioteca bibliotecaUsuario;

    public Usuario(String nombre, int telefono, String rut) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.rut = rut;
        // this.bibliotecaUsuario = null
    }

    // Getters
    public String getNombre() {return nombre;}
    public int getTelefono() {return telefono;}
    public String getRut() {return rut;}

}