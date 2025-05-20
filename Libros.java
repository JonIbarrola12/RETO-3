public class Libros {
    private String isbn;
    private String titulo;
    private String editorial;
    private int anio_Publicacion;
    private String idioma;
    private int num_Ejemplares;

    public Libros(String isbn, String titulo, String editorial, int anio_Publicacion, String idioma, int num_Ejemplares) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.editorial = editorial;
        this.anio_Publicacion = anio_Publicacion;
        this.idioma = idioma;
        this.num_Ejemplares = num_Ejemplares;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnio_Publicacion() {
        return anio_Publicacion;
    }

    public void setAnio_Publicacion(int anio_Publicacion) {
        this.anio_Publicacion = anio_Publicacion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public int getNum_Ejemplares() {
        return num_Ejemplares;
    }

    public void setNum_Ejemplares(int num_Ejemplares) {
        this.num_Ejemplares = num_Ejemplares;
    }
    public void añadirEjemplar() {
        Ejemplar ejem = new Ejemplar(this.isbn);
        this.num_Ejemplares++;
    }
    public boolean esLargo() {
        return this.titulo.length() > 300;
    }
    
}
