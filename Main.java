public class Main {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("Pedro", 73892647, "7938627-6");
        Usuario usuario2 = new Usuario("Pablo", 99672354, "11654893-K");
        Biblioteca bibliotecaUsuario1 = new Biblioteca("bibliotecaU1");
        Biblioteca bibliotecaUsuario2 = new Biblioteca("bibliotecaU2");
        
        Libro libro1 = new LibroNoFiccion("libro1", "autor1", "genero1", 200, false, null);
        Libro libro2 = new LibroNoFiccion("libro2", "autor2", "genero2", 200, false, null);
        Libro libro3 = new LibroNoFiccion("libro3", "autor3", "genero3", 200, false, null);
        Libro libro4 = new LibroNoFiccion("libro4", "autor4", "genero4", 200, false, null);
        Libro libro5 = new LibroNoFiccion("libro5", "autor5", "genero5", 200, false, null);
        Libro libro6 = new LibroNoFiccion("libro6", "autor6", "genero6", 200, false, null);

        Libro libro7 = new LibroFiccion("libro7", "autor7", "genero7", 200, "sinopsis1", 2003);
        Libro libro8 = new LibroFiccion("libro8", "autor8", "genero8", 200, "sinopsis2", 2004);
        Libro libro9 = new LibroFiccion("libro9", "autor9", "genero9", 200, "sinopsis3", 2005);
        Libro libro10 = new LibroFiccion("libro10", "autor10", "genero10", 200, "sinopsis4", 2006);
        Libro libro11 = new LibroFiccion("libro11", "autor11", "genero11", 200, "sinopsis4", 2003);
        Libro libro12 = new LibroFiccion("libro12", "autor12", "genero12", 200, "sinopsis5", 2004);
        Libro libro13 = new LibroFiccion("libro13", "autor13", "genero13", 200, "sinopsis6", 2005);
        Libro libro14 = new LibroFiccion("libro14", "autor14", "genero14", 200, "sinopsis7", 2006);
        Libro libro15 = new LibroFiccion("libro15", "autor15", "genero15", 200, "sinopsis8", 2007);
        Libro libro16 = new LibroFiccion("libro16", "autor16", "genero16", 200, "sinopsis9", 2008);

        bibliotecaUsuario1.agregarLibro(libro1);
        bibliotecaUsuario1.agregarLibro(libro2);
        bibliotecaUsuario1.agregarLibro(libro3);
        bibliotecaUsuario1.agregarLibro(libro7);
        bibliotecaUsuario1.agregarLibro(libro8);
        bibliotecaUsuario1.agregarLibro(libro9);

        bibliotecaUsuario2.agregarLibro(libro4);
        bibliotecaUsuario2.agregarLibro(libro5);
        bibliotecaUsuario2.agregarLibro(libro6);
        bibliotecaUsuario2.agregarLibro(libro10);
        bibliotecaUsuario2.agregarLibro(libro11);
        bibliotecaUsuario2.agregarLibro(libro12);
        bibliotecaUsuario2.agregarLibro(libro13);
        bibliotecaUsuario2.agregarLibro(libro14);
        bibliotecaUsuario2.agregarLibro(libro15);
        bibliotecaUsuario2.agregarLibro(libro16);

        usuario1.agregarBiblioteca(bibliotecaUsuario1);
        usuario2.agregarBiblioteca(bibliotecaUsuario2);
    }
}
