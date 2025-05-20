public class Usuario {
    private int cod_Usuario;
    private String nombre_Usuario;
    private String contrasena;
    private int telefono;
    private String direccion;
    private String correo_Electronico;
    private String n_Seguridad_Social;

    public Usuario(int cod_Usuario, String nombre_Usuario, String contrasena, int telefono, String direccion, String correo_Electronico, String n_Seguridad_Social) {
        this.cod_Usuario = cod_Usuario;
        this.nombre_Usuario = nombre_Usuario;
        this.contrasena = contrasena;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo_Electronico = correo_Electronico;
        this.n_Seguridad_Social = n_Seguridad_Social;
    }

    public int getCod_Usuario() {
        return cod_Usuario;
    }

    public void setCod_Usuario(int cod_Usuario) {
        this.cod_Usuario = cod_Usuario;
    }

    public String getNombre_Usuario() {
        return nombre_Usuario;
    }

    public void setNombre_Usuario(String nombre_Usuario) {
        this.nombre_Usuario = nombre_Usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo_Electronico() {
        return correo_Electronico;
    }

    public void setCorreo_Electronico(String correo_Electronico) {
        this.correo_Electronico = correo_Electronico;
    }

    public String getN_Seguridad_Social() {
        return n_Seguridad_Social;
    }

    public void setN_Seguridad_Social(String n_Seguridad_Social) {
        this.n_Seguridad_Social = n_Seguridad_Social;
    }
    public Prestamo registrarPrestamo(Ejemplar ejemplar ){
        Prestamo prestamo = new Prestamo(this.cod_Usuario);
        ejemplar.setEstado("prestado"); 
        return prestamo;
    }
}
