package modeloDAO;

import config.bd.ConectaBd;
import interfaces.CRUD1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Carrera;


public class carreraDAO implements CRUD1{
ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Carrera e = new Carrera();
    @Override
    public List listarcarreras() {
        ArrayList<Carrera> carreras = new ArrayList<>();
        String consulta = " select * from carrera "  ;
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {                
                Carrera carrera = new Carrera();
                carrera.setIdep(rs.getInt("idcurso"));
                carrera.setNombre(rs.getString("nombre"));
                carrera.setEstado(rs.getString("estado"));
                carreras.add(carrera);
            }
        } catch (SQLException e) {
            System.out.println("Error: Problemas con el LISTAR");
            System.out.println(e.getMessage());
        }
        return carreras;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
