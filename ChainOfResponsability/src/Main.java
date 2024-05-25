public class Main {
    public static void main(String[] args) {

        Handler Supervisor = new Supervisor();
        Handler Manager = new Manager();
        Handler Director = new Director();

        Supervisor.setNextApprover(Manager);
        Manager.setNextApprover(Director);

        Empleado vacationRequest = new Empleado("Alice","Montoya",23,"Vacation");
        Empleado purchaseRequest = new Empleado("Bob","Lopez",44,"Purchase");
        Empleado accessRequest = new Empleado("Charlie","Castro",32,"Access");
        Empleado conferenceRequest = new Empleado("David","Perez",22,"Conference");

        Supervisor.approveRequest(purchaseRequest);
        Supervisor.approveRequest(accessRequest);
        Supervisor.approveRequest(conferenceRequest);
        Manager.approveRequest(vacationRequest);

    }
}