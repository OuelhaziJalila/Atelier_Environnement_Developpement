package web;
import java.util.ArrayList;
import java.util.List;
import metier.Musique;

public class MusiqueModele {
    private String motCle;
    private List<Musique> musiques = new ArrayList<>();
    
    public String getMotCle() { return motCle; }
    public void setMotCle(String motCle) { this.motCle = motCle; }
    public List<Musique> getMusiques() { return musiques; }
    public void setMusiques(List<Musique> musiques) { this.musiques = musiques; }
}