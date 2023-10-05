package ejemplo2;

public class Entrenador {
    private String nombre;
    private int dinero;
    private Pokemon [] pokemonActivos;
    private Pokemon [] pokemonGuardados;
    private int countPokemonActivos;
    private int countPokemonGuardados;
    
    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.dinero = 0;
        this.pokemonActivos = new Pokemon[6];
        this.pokemonGuardados = new Pokemon[100];
        this.countPokemonActivos = 0;
        this.countPokemonGuardados = 0;
    }

    public String getNombre() {return nombre;}
    public int getDinero() {return dinero;}
    public Pokemon [] getPokemonActivos() {return pokemonActivos;}
    public Pokemon [] getPokemonGuardados() {return pokemonGuardados;}
    public int getCountPokemonActivos() {return countPokemonActivos;}
    public int getCountPokemonGuardados() {return countPokemonGuardados;}

    public void sumarDinero(int dinero) {this.dinero = this.dinero + dinero;}
    public void restarDinero(int dinero) {this.dinero = this.dinero - dinero;}

    public void capturarPokemon(int countPokemonActivos) {
        for(int i = 0; i < 6; i++) {
            if(countPokemonActivos == i) {
                this.pokemonActivos[i] = null;
            } else {
                System.out.println("No puedes capturar mas Pokemon");
            }
        }
    }

    public void guardarPokemon(int countPokemonGuardados) {
        for(int i = 0; i < 100; i++) {
            if(countPokemonGuardados == i) {
                this.pokemonGuardados[i] = null;
            } else {
                System.out.println("No puedes guardar mas Pokemon");
            }
        }
    }

    public void soltarPokemon(int countPokemonGuardados, int countPokemonActivos) {
        for(int i = 0; i < 100; i++) {
            if(countPokemonGuardados == i && countPokemonActivos < 6) {
                this.pokemonGuardados[i] = this.pokemonActivos[countPokemonActivos];
                this.pokemonActivos[countPokemonActivos] = null;
                countPokemonActivos++;
            } else {
                System.out.println("No puedes soltar mas Pokemon");
            }
        }
    }
    public void verPokemonActivos() {
        System.out.print(pokemonActivos);
    }
}
