import java.util.Date;

public class Penalizacion {
    private int cod_Pen;
    private Date fecha_Pen;
    private int dias_Pen;
    private int cod_Usuario;

    public Penalizacion(int cod_Pen, Date fecha_Pen, int dias_Pen, int cod_Usuario) {
        this.cod_Pen = cod_Pen;
        this.fecha_Pen = fecha_Pen;
        this.dias_Pen = dias_Pen;
        this.cod_Usuario = cod_Usuario;
    }

    public int getCod_Pen() { return cod_Pen; }
    public void setCod_Pen(int cod_Pen) { this.cod_Pen = cod_Pen; }
    public Date getFecha_Pen() { return fecha_Pen; }
    public void setFecha_Pen(Date fecha_Pen) { this.fecha_Pen = fecha_Pen; }
    public int getDias_Pen() { return dias_Pen; }
    public void setDias_Pen(int dias_Pen) { this.dias_Pen = dias_Pen; }
    public int getCod_Usuario() { return cod_Usuario; }
    public void setCod_Usuario(int cod_Usuario) { this.cod_Usuario = cod_Usuario; }
    
    public Date calcularFechaFin() {
        long tiempo = fecha_Pen.getTime() + (dias_Pen * 24L * 60 * 60 * 1000);
        return new Date(tiempo);
    }
}