package web;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.*;

@WebServlet(name="cs", urlPatterns={"/controleur"})
public class ControleurServlet extends HttpServlet {
    private IMetierMusique metier;
    @Override
    public void init() throws ServletException { metier = new MetierImpl(); }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String mc = request.getParameter("motCle");
        MusiqueModele mod = new MusiqueModele();
        mod.setMotCle(mc);
        List<Musique> musiques = metier.getMusiquesParMotCle(mc);
        mod.setMusiques(musiques);
        request.setAttribute("modele", mod);
        request.getRequestDispatcher("MusiquesView.jsp").forward(request, response);
    }
}