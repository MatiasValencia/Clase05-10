package ejemplo1;

public class Libro {
    private String nombre;
    private String autor;
    private String genero;
    private int numeroPaginas;

    public Libro(String nombre, String autor, String genero, int numeroPaginas) {
        this.nombre = nombre;
        this.autor = autor;
        this.genero = genero;
        this.numeroPaginas = numeroPaginas;
    }

    public String getNombre() {return nombre;}
    public String getAutor() {return autor;}
    public String getGenero() {return genero;}
    public int getNumeroPaginas() {return numeroPaginas;}
}
