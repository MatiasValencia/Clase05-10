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

    public void capturarPokemon(Pokemon pokemon) {
        for(int i = 0; i < 6; i++) {
            if(countPokemonActivos == i) {
                pokemonActivos[i] = pokemon;
                countPokemonActivos ++;
                return;
            }
        }
        for (int j = 0; j < 100; j++) {
            if(countPokemonGuardados == j) {
                pokemonGuardados[j] = pokemon;
                countPokemonGuardados ++;
                System.out.println("Tu pokemon se ha guardado");
            } else {
                System.out.println("No puedes guardar mas Pokemon");
            }
        }
    }

    public void guardarPokemon(Pokemon pokemon) {
        for(int i = 0; i < 100; i++) {
            if(countPokemonGuardados == i) {
                pokemonGuardados[i] = pokemon;
                countPokemonGuardados ++;
            } else {
                System.out.println("No puedes guardar mas Pokemon");
            }
        }
    }

    public void soltarPokemon(Pokemon pokemon) {
        for(int i = 0; i < 6; i++) {
            if(countPokemonActivos == i) {
                pokemonActivos[i] = null;
                countPokemonActivos --;
            }
        }
    }

    public void verPokemonActivos() {
        System.out.print(pokemonActivos);
    }
}
