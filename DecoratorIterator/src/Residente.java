public class Residente {

    private String nombre;
    private String apellido;
    private int numApart;
    private double saldoDeuda;
    private String numTelefono;
    private String correo;

    public Residente(String nombre, String apellido, int numApart, double saldoDeuda, String numTelefono, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numApart = numApart;
        this.saldoDeuda = saldoDeuda;
        this.numTelefono = numTelefono;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumApart() {
        return numApart;
    }

    public void setNumApart(int numApart) {
        this.numApart = numApart;
    }

    public double getSaldoDeuda() {
        return saldoDeuda;
    }

    public void setSaldoDeuda(double saldoDeuda) {
        this.saldoDeuda = saldoDeuda;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
