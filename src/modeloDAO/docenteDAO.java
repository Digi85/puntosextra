package modeloDAO;

import config.bd.ConectaBd;
import interfaces.CRUD2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Docente;

public class docenteDAO implements CRUD2{
    ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Docente e = new Docente();
    @Override
    public List listardocentes() {
        ArrayList<Docente> docentes = new ArrayList<>();
        String consulta = " select * from docente ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {                
                Docente docente = new Docente();
                docente.setIddocente(rs.getInt("idcurso"));
                docente.setNombre(rs.getString("nombre"));
                docente.setGradoacademico(rs.getString("gradoacademico"));
                docente.setEstado(rs.getString("estado"));
                docentes.add(docente);
            }
        } catch (SQLException e) {
            System.out.println("Error: Problemas con el LISTAR");
            System.out.println(e.getMessage());
        }
        return docentes;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
