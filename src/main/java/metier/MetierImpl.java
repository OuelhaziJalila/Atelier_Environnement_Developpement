package metier;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements IMetierMusique {
    @Override
    public List<Musique> getMusiquesParMotCle(String mc) {
        List<Musique> musiques = new ArrayList<>();
        Connection conn = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM musiques WHERE TITRE LIKE ?");
            ps.setString(1, "%" + mc + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Musique m = new Musique();
                m.setIdMusique(rs.getLong("ID_MUSIQUE"));
                m.setTitre(rs.getString("TITRE"));
                m.setDuree(rs.getDouble("DUREE"));
                musiques.add(m);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return musiques;
    }
    @Override
    public void addMusique(Musique m) {}
}