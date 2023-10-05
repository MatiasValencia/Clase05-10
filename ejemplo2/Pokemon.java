package ejemplo2;

public class Pokemon {
    // Atributos
    private String nombre;
    private int nivel;
    private String tipo1;
    private String tipo2;
    private int exp;
    private int hp;

    // Constructor
    public Pokemon(String nombre, String tipo1, String tipo2) {
        this.nombre = nombre;
        this.nivel = 1;
        this.tipo1 = tipo1;
        this.tipo2 = tipo2;
        this.exp = 0;
        this.hp = 100;
    }
    // Metodos
    // Getters
    public String getNombre() {return nombre;}
    public int getNivel() {return nivel;}
    public String getTipo1() {return tipo1;}
    public String getTipo2() {return tipo2;}
    public int getEXP() {return exp;}
    public int getHP() {return hp;}

    // Setter
    public void setNombre(String nombre) {this.nombre = nombre;}

    // Customers o Reglas de Negocio
    public void subirNivel() {this.nivel++;}
    public void aniadirEXP(int exp) {
        while (exp >= 100) {
            subirNivel();
            exp = exp - 100;
        }
    }
    public void carameloRaro() {
        subirNivel();
        exp = 0;
    }

    public void estadoActual() {
        if(hp <= 0) {
            System.out.println("El Pokemon esta debilitado");
        }
    }
}
