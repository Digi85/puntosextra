package modeloDAO;

import config.bd.ConectaBd;
import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Curso;


public class cursoDAO implements CRUD {
    ConectaBd cn = new ConectaBd();
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Curso e = new Curso();
    @Override
    public List listarcursos() {
        ArrayList<Curso> cursos = new ArrayList<>();
        String consulta = " SELECT E.NOMBRE 'escuela', D.NOMBRE 'docente', D.GRADOACADEMICO 'gradoacademico', C.NOMBRE 'curso', C.CICLO 'ciclo' " +
" FROM CURSO C, DOCENTE D, CARRERA E " +
" WHERE E.IDEP = C.IDEP " +
" AND D.IDDOCENTE = C.IDDOCENTE " +
" ORDER BY E.NOMBRE, D.NOMBRE, C.NOMBRE ";
        try {
            con = cn.getConnection();
            pst = con.prepareStatement(consulta);
            rs = pst.executeQuery();
            while (rs.next()) {                
                Curso curso = new Curso();
                curso.setNombre_carrera(rs.getString("escuela"));
                curso.setNombre_docente(rs.getString("docente"));
                curso.setGradoacademico_docente(rs.getString("gradoacademico"));
                curso.setNombre_curso(rs.getString("curso"));
                curso.setCiclo_curso(rs.getInt("ciclo"));
                cursos.add(curso);
            }
        } catch (SQLException e) {
            System.out.println("Error: Problemas con el LISTAR");
            System.out.println(e.getMessage());
        }
        return cursos;
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
