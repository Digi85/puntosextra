package modelo;

public class Curso {
    private int idcurso;
    private int ciclo;
    private String nombre;
    private int horas;
    private int creditos;
    private String estado;
    private int iddocente;
    private int idep;
    
    
   private String nombre_carrera;
   private String nombre_docente;
   private String gradoacademico_docente;
   private String nombre_curso;
   private int ciclo_curso; 

    public Curso(int idcurso, int ciclo, String nombre, int horas, int creditos, String estado, int iddocente, int idep, String nombre_carrera, String nombre_docente, String gradoacademico_docente, String nombre_curso, int ciclo_curso) {
        this.idcurso = idcurso;
        this.ciclo = ciclo;
        this.nombre = nombre;
        this.horas = horas;
        this.creditos = creditos;
        this.estado = estado;
        this.iddocente = iddocente;
        this.idep = idep;
        this.nombre_carrera = nombre_carrera;
        this.nombre_docente = nombre_docente;
        this.gradoacademico_docente = gradoacademico_docente;
        this.nombre_curso = nombre_curso;
        this.ciclo_curso = ciclo_curso;
    }

    public Curso() {
    }

    public Curso(int idcurso, int ciclo, String nombre, int horas, int creditos, String estado, int iddocente, int idep) {
        this.idcurso = idcurso;
        this.ciclo = ciclo;
        this.nombre = nombre;
        this.horas = horas;
        this.creditos = creditos;
        this.estado = estado;
        this.iddocente = iddocente;
        this.idep = idep;
    }

    public int getIdep() {
        return idep;
    }

    public void setIdep(int idep) {
        this.idep = idep;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getIddocente() {
        return iddocente;
    }

    public void setIddocente(int iddocente) {
        this.iddocente = iddocente;
    }

    public String getNombre_carrera() {
        return nombre_carrera;
    }

    public void setNombre_carrera(String nombre_carrera) {
        this.nombre_carrera = nombre_carrera;
    }

    public String getNombre_docente() {
        return nombre_docente;
    }

    public void setNombre_docente(String nombre_docente) {
        this.nombre_docente = nombre_docente;
    }

    public String getGradoacademico_docente() {
        return gradoacademico_docente;
    }

    public void setGradoacademico_docente(String gradoacademico_docente) {
        this.gradoacademico_docente = gradoacademico_docente;
    }

    public String getNombre_curso() {
        return nombre_curso;
    }

    public void setNombre_curso(String nombre_curso) {
        this.nombre_curso = nombre_curso;
    }

    public int getCiclo_curso() {
        return ciclo_curso;
    }

    public void setCiclo_curso(int ciclo_curso) {
        this.ciclo_curso = ciclo_curso;
    }
    
    
}
