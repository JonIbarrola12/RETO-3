import java.util.Date;

public class Prestamo {
    private int cod_Prest;
    private Date fecha_Prestamo;
    private Date fecha_Entrega;
    private Date fecha_Devolucion;
    private int cod_Usuario;

    public Prestamo(int cod_Prest, Date fecha_Prestamo, Date fecha_Entrega, Date fecha_Devolucion, int cod_Usuario) {
        this.cod_Prest = cod_Prest;
        this.fecha_Prestamo = fecha_Prestamo;
        this.fecha_Entrega = fecha_Entrega;
        this.fecha_Devolucion = fecha_Devolucion;
        this.cod_Usuario = cod_Usuario;
    }
    public Prestamo(int cod_Usuario){
        this.cod_Prest = (int) Math.random()*1000;
        this.fecha_Prestamo = new Date();
        this.fecha_Entrega = new Date(this.fecha_Prestamo.getTime() + 30L * 24 * 60 * 60 * 1000);
        this.fecha_Devolucion = null;
        this.cod_Usuario = cod_Usuario;

    }

    public int getCod_Prest() {
        return cod_Prest;
    }

    public void setCod_Prest(int cod_Prest) {
        this.cod_Prest = cod_Prest;
    }

    public Date getFecha_Prestamo() {
        return fecha_Prestamo;
    }

    public void setFecha_Prestamo(Date fecha_Prestamo) {
        this.fecha_Prestamo = fecha_Prestamo;
    }

    public Date getFecha_Entrega() {
        return fecha_Entrega;
    }

    public void setFecha_Entrega(Date fecha_Entrega) {
        this.fecha_Entrega = fecha_Entrega;
    }

    public Date getFecha_Devolucion() {
        return fecha_Devolucion;
    }

    public void setFecha_Devolucion(Date fecha_Devolucion) {
        this.fecha_Devolucion = fecha_Devolucion;
    }

    public int getCod_Usuario() {
        return cod_Usuario;
    }

    public void setCod_Usuario(int cod_Usuario) {
        this.cod_Usuario = cod_Usuario;
    }

    public boolean estaRetrasado() {
        if (fecha_Devolucion != null && fecha_Entrega != null) {
            return fecha_Devolucion.after(fecha_Entrega);
        }
        return false;
    }
}
