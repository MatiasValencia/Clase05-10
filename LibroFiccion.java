public class LibroFiccion extends Libro {
    private String sinopsis;
    private int anio;
    
    public LibroFiccion(String nombre, String autor, String genero, int numeroPaginas, String sinopsis, int anio) {
        super(nombre, autor, genero, numeroPaginas);
        this.sinopsis = sinopsis;
        this.anio = anio;
    }

    public String getSinopsis() {return sinopsis;}
    public int getAnio() {return anio;}
}
