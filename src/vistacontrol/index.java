package vistacontrol;

import java.util.List;
import modeloDAO.cursoDAO;
import modelo.Curso;

public class index {
     public static String darFormato(String cadena, int v){
        if (cadena.length()>v) {
        cadena = cadena.substring(0,v-3) + "...";
        }
        if (cadena.length()<v) {
            while(cadena.length()!=v){
        cadena = cadena + " ";
        }}
        
        return cadena;
    }
       
    public static void listarCursos()
    {
        cursoDAO cursoDAO = new cursoDAO();
        List<Curso>cursos = cursoDAO.listarcursos();
        System.out.println("Listado de personas");
        for (Curso curso : cursos) {
            System.out.println(darFormato(curso.getNombre_carrera(),20)+ "\t"+
                               darFormato(curso.getNombre_docente(),20)+ "\t"+
                               darFormato(curso.getGradoacademico_docente(),11)+"\t"+
                               darFormato(curso.getNombre_curso(),11)+"\t"+
                               curso.getCiclo_curso()
                    );
        }
    }
    public static void main(String[] args) {
        listarCursos();
    }
}
