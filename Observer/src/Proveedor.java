public class Proveedor implements Suscriber{
    private String name;
    private String owner;
    private String rubro;

    public Proveedor(String name, String owner, String rubro) {
        this.name = name;
        this.owner = owner;
        this.rubro = rubro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    @Override
    public void update(String msg) {
        System.out.println("Proveedor: " + getName() + " ha recibido: " + msg);
    }
}
