package ejemplo1;

public class Bibliotecario extends Usuario {
    public Bibliotecario(String nombre, int telefono, String rut) {
        super(nombre, telefono, rut);
    }

    public void eliminarLibro(String nombreBiblioteca, String nombreLibro, Usuario usuario) {
        Biblioteca [] bibliotecaUsuario = usuario.returnBibliotecas();
        for(int i = 0; i < 10; i++) {
            if(bibliotecaUsuario[i].getNombre() == nombreBiblioteca) {
                bibliotecaUsuario[i].eliminarLibro(nombreLibro);
                return;
            }
        }
    }
}
