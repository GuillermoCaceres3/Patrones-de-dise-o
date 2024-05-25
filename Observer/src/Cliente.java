public class Cliente implements Suscriber{
    private String name;
    private String ID;
    private String genero;
    private String cuentaBancaria;

    public Cliente(String name, String ID, String genero, String cuentaBancaria) {
        this.name = name;
        this.ID = ID;
        this.genero = genero;
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    @Override
    public void update(String msg) {
        System.out.println("Cliente: " + getName() + " ha recibido: " + msg);
    }
}
