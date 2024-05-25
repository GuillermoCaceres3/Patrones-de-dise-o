import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IterableCollection residentes = new ResidentCollection(loadResidents());
        ResidentIterator iterator;

        iterator = residentes.createDebtorsIterator();
        while(iterator.hasMore()){
            Residente residente = iterator.getNext();
            System.out.println("Nombre: " + residente.getNombre());
            System.out.println("Apellido:" + residente.getApellido());
            System.out.println("Deuda total: " + residente.getSaldoDeuda());
        }




    }

    public static List<Residente> loadResidents() {
        List<Residente> residents = new ArrayList<>(10);

        // Creando los primeros cinco residentes con saldo deudor 0
        residents.add(new Residente("Juan", "Gonzalez", 101, 0, "555-1234", "juan@example.com"));
        residents.add(new Residente("Maria", "Lopez", 102, 0, "555-5678", "maria@example.com"));
        residents.add(new Residente("Carlos", "Martinez", 103, 0, "555-9012", "carlos@example.com"));
        residents.add(new Residente("Ana", "Rodriguez", 104, 0, "555-3456", "ana@example.com"));
        residents.add(new Residente("Pedro", "Sanchez", 105, 0, "555-7890", "pedro@example.com"));

        // Creando los últimos cinco residentes con saldo deudor diferente de 0
        residents.add(new Residente("Luis", "Perez", 201, 50.0, "555-1111", "luis@example.com"));
        residents.add(new Residente("Laura", "Gomez", 202, 75.0, "555-2222", "laura@example.com"));
        residents.add(new Residente("Javier", "Diaz", 203, 100.0, "555-3333", "javier@example.com"));
        residents.add(new Residente("Sofia", "Hernandez", 204, 125.0, "555-4444", "sofia@example.com"));
        residents.add(new Residente("Miguel", "Torres", 205, 150.0, "555-5555", "miguel@example.com"));

        return residents;
    }
}