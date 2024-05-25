public class EmpleadoUCA {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private double alturaMs;
    private double pesoLbs;

    public EmpleadoUCA(String nombre, String apellido, String fechaNacimiento, double alturaMs, double pesoLbs) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.alturaMs = alturaMs;
        this.pesoLbs = pesoLbs;
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getAlturaMs() {
        return alturaMs;
    }

    public void setAlturaMs(double alturaMs) {
        this.alturaMs = alturaMs;
    }

    public double getPesoLbs() {
        return pesoLbs;
    }

    public void setPesoLbs(double pesoLbs) {
        this.pesoLbs = pesoLbs;
    }
}
