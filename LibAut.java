public class LibAut {
    private String isbn;
    private String dni;

    public LibAut(String isbn, String dni) {
        this.isbn = isbn;
        this.dni = dni;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
