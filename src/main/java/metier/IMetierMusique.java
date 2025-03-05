package metier;
import java.util.List;
public interface IMetierMusique {
    List<Musique> getMusiquesParMotCle(String mc);
    void addMusique(Musique m);
}

