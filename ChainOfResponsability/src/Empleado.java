public class Empleado {
    private String name;
    private String lastName;
    private int edad;
    private String permissionType;

    public Empleado(String name, String lastName, int edad, String permissionType) {
        this.name = name;
        this.lastName = lastName;
        this.edad = edad;
        this.permissionType = permissionType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

}
