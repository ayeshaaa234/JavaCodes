package labassignment;

public class Employee {
    private String employeeid;
    private String name;
    private final static String designation="labattendant";
    Employee(String employeeid, String name, String designation){
        this.employeeid=employeeid;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public static String getDesignation() {
        return designation;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeid='" + employeeid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
