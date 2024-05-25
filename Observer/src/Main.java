public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Sofi","1232","F","2222");
        Cliente cliente2 = new Cliente("Fati","1111","F","44444");
        Cliente cliente3 = new Cliente("Neto","5555","M","99999");
        Proveedor p = new Proveedor("Quesos de metapan","Saca","Lacteos");

        Supermarket sp = new Supermarket("Selectos","Sta Tecla","Callejas","7:00 AM - 9:00 PM");

        sp.addSuscriber(cliente1);
        sp.addSuscriber(cliente2);
        sp.addSuscriber(p);
        sp.addSuscriber(cliente3);

        sp.notifySuscribers("Hoy tenemos las regias a 2 por $5");
        System.out.println("-----------");
        sp.removeSuscriber(cliente1);
        sp.notifySuscribers("Bacacho a $10");


    }
}