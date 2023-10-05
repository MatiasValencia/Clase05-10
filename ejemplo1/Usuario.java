package ejemplo1;

public class Usuario {
    private String nombre;
    private int telefono;
    private String rut;
    private Biblioteca [] bibliotecaUsuario;

    public Usuario(String nombre, int telefono, String rut) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.rut = rut;
        this.bibliotecaUsuario = new Biblioteca[10];
    }

    // Getters
    public String getNombre() {return nombre;}
    public int getTelefono() {return telefono;}
    public String getRut() {return rut;}

    public Biblioteca [] returnBibliotecas() {return bibliotecaUsuario;}

    public void agregarBiblioteca(Biblioteca biblioteca) {
        for(int i=0;i<bibliotecaUsuario.length;i++) {
            if(bibliotecaUsuario[i] == null) {
                bibliotecaUsuario[i] = biblioteca;
                return;
            }
        }
        System.out.println("No se pueden agregar mas bibliotecas.");
    }

    public void eliminarBiblioteca(String nombreBiblioteca) {
        for(int i=0;i<bibliotecaUsuario.length;i++) {
            if(bibliotecaUsuario[i].getNombre() == nombreBiblioteca) {
                bibliotecaUsuario[i] = null;
                return;
            }
        }
        System.out.println("No se pueden agregar mas bibliotecas.");
    }
}