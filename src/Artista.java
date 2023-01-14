public class Artista extends Musica{
    //Atributos
    private String nomArtista;
    private int numExitos;

    //Constructor
    public Artista(String genero, String ritmo, String nomCancion, String nomArtista, int numExitos){
        super(genero, ritmo, nomCancion);
        this.nomArtista = nomArtista;
        this.numExitos = numExitos;
    }
    //Metodos
    public String getNomArtista(){
        return nomArtista;
    }
    public int getNumExitos(){
        return numExitos;
    }
}
