public class LibAut {
    private int isbn;
    private String dni;

    public LibAut(int isbn, String dni) {
        this.isbn = isbn;
        this.dni = dni;
    }

    public int getIsbn() { return isbn; }
    public void setIsbn(int isbn) { this.isbn = isbn; }
    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }
    
    public void añadirRelacionAutorLibro(int isbn, String dni) {
        this.isbn = isbn;
        this.dni = dni;
    }
}