public class Musica {
    //Atributos
    private String genero;
    private String ritmo;
    private String nomCancion;
    //Constructor
    public Musica(String genero, String ritmo, String nomCancion){
        this.genero = genero;
        this.ritmo = ritmo;
        this.nomCancion = nomCancion;
    }
    //Metodos
    public String getGenero() {
        return genero;
    }

    public String getRitmo() {
        return ritmo;
    }

    public String getNomCancion() {
        return nomCancion;
    }

}
