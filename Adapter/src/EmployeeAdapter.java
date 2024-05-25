public class EmployeeAdapter {
    public static void displayInfo(EmpleadoUCA e){
        Employee employee = new Employee();

        employee.setFullName(e.getNombre() + e.getApellido());
        String [] dateParts = e.getFechaNacimiento().split("-");
        employee.setAge(2024-Integer.valueOf(dateParts[2]));

        employee.setHeightCms((int) (e.getAlturaMs()*100));
        employee.setWeightKgs((e.getPesoLbs()/2.2));

        EmployeeManager.displayInfo(employee);

    }
}
