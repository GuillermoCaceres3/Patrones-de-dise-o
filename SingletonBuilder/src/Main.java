public class Main {
    public static void main(String[] args) {

        Cocina cocina = Cocina.getInstance();
        Director director = new Director(cocina);
        Hamburguesa hamburguesa = director.construirHamburguesa("Pollo",false,true,true,false);
        System.out.println(hamburguesa.verHamburguesa());

    }
}