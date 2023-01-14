public class Fans extends Artista{
    //Atributos
    private String nomClub;
    private int cantidadClub;
    private String nomLider;
    //Constructor
    public Fans(String genero, String ritmo, String nomCancion, String nomArtista, int numExitos, String nomClub,
    int cantidadClub, String nomLider){
        super(genero, ritmo, nomCancion, nomArtista, numExitos);
        this.nomClub = nomClub;
        this.cantidadClub = cantidadClub;
        this.nomLider = nomLider;
    }
    //Metodos
    public String getNomClub(){
        return nomClub;
    }
    public int getCantidadClub(){
        return cantidadClub;
    }
    public String getNomLider(){
        return nomLider;
    }
    //Imprimir Datos
    public void imprimirDatos(){
        System.out.println("El artista " + getNomArtista() + " con la cacion " + getNomCancion() + " de genero "
        + getGenero() + "\ncon un ritmo " + getRitmo() + " tiene un numero increible de exitos con un total de "
                + getNumExitos() + " exitos" + "\ncon una cantidad de fans de " + getCantidadClub() +
                " que responden al nombre de " + getNomClub() + "\nliderados por " +  getNomLider() +
                " se presentara el día 15 de enero del 2023 en el estadio Liga de Quito");
    }
}
