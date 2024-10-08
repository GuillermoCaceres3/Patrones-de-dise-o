public class Employee {
    private String fullName;
    private int age;
    private int heightCms;
    private double weightKgs;

    public Employee(String fullName, int age, int heightCms, double weightKgs) {
        this.fullName = fullName;
        this.age = age;
        this.heightCms = heightCms;
        this.weightKgs = weightKgs;
    }

    public Employee() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeightCms() {
        return heightCms;
    }

    public void setHeightCms(int heightCms) {
        this.heightCms = heightCms;
    }

    public double getWeightKgs() {
        return weightKgs;
    }

    public void setWeightKgs(double weightKgs) {
        this.weightKgs = weightKgs;
    }
}
