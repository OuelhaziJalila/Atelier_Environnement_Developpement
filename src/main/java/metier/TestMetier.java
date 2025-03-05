package metier;
import java.util.List;

public class TestMetier {
    public static void main(String[] args) {
        MetierImpl metier = new MetierImpl();
        List<Musique> musiques = metier.getMusiquesParMotCle("a");
        for (Musique m : musiques) {
            System.out.println(m);
        }
    }
}