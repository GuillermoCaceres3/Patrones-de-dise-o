import java.util.ArrayList;
import java.util.Iterator;

public class Supermarket {
    private String name;
    private String direccion;
    private String owner;
    private String horarios;
    private ArrayList<Suscriber> suscribers;

    public Supermarket(String name, String direccion, String owner, String horarios) {
        this.name = name;
        this.direccion = direccion;
        this.owner = owner;
        this.horarios = horarios;
        suscribers = new ArrayList<Suscriber>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public void vender(){
        System.out.println("Estoy vendiendo");
    }

    public void comprar(){
        System.out.println("Estoy comprando");
    }

    public void addSuscriber(Suscriber s){
        suscribers.add(s);
    }

    public void removeSuscriber(Suscriber s){
        suscribers.remove(s);
    }

    public void notifySuscribers(String msg){
     for (Suscriber suscriber : suscribers){
         suscriber.update(msg);
     }
    }



}
