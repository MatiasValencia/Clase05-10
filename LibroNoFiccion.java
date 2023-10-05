public class LibroNoFiccion extends Libro{
    private boolean biografico;
    private String nombreBiografiado;

    public LibroNoFiccion(String nombre, String autor, String genero, int numeroPaginas, boolean biografico, String nombreBiografiado) {
        super(nombre, autor, genero, numeroPaginas);
        this.biografico = biografico;
        if (biografico) {
            this.nombreBiografiado = nombreBiografiado;
        }
    }
    public boolean getBiografico() {return biografico;}
    public String getNombreBiografiado() {return nombreBiografiado;}
}
