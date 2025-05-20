public class Ejemplar {
    private int cod_Ejem;
    private String idiomas;
    private String estado;
    private int cod_Prest;
    private int isbn;

    public Ejemplar(int cod_Ejem, String idiomas, String estado, int cod_Prest, int isbn) {
        this.cod_Ejem = cod_Ejem;
        this.idiomas = idiomas;
        this.estado = estado;
        this.cod_Prest = cod_Prest;
        this.isbn = isbn;
    }

    public Ejemplar(int isbn) {
        this.cod_Ejem = 0;
        String[] idiomasDisponibles = {"español", "inglés", "euskera"};
        this.idiomas = idiomasDisponibles[(int) (Math.random() * 3)];
        this.estado = "disponible";
        this.isbn = isbn;
    }

    public int getCod_Ejem() { return cod_Ejem; }
    public void setCod_Ejem(int cod_Ejem) { this.cod_Ejem = cod_Ejem; }
    public String getIdiomas() { return idiomas; }
    public void setIdiomas(String idiomas) { this.idiomas = idiomas; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public int getCod_Prest() { return cod_Prest; }
    public void setCod_Prest(int cod_Prest) { this.cod_Prest = cod_Prest; }
    public int getIsbn() { return isbn; }
    public void setIsbn(int isbn) { this.isbn = isbn; }
    
    public boolean estaDisponible() {
        return estado.equals("disponible");
    }
}