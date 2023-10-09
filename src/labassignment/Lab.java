package labassignment;


public class Lab {
    private String labid;
    Computer computer[]=new Computer[10];
    private Labstatus status;
    private Employee labAttendant;

    Lab(String labid, Computer computer[],Labstatus status, Employee labAttendant){
        this.labid=labid;
        this.computer=computer;
        this.status=status;
        this.labAttendant=labAttendant;
    }

    public Employee getLabAttendant() {
        return labAttendant;
    }

    public void setLabAttendant(Employee labAttendant) {
        this.labAttendant = labAttendant;
    }

    public void setComputer(Computer[] computer) {
        this.computer = computer;
    }

    public Computer[] getComputer() {
        return computer;
    }

    public void setLabid(String labid) {
        this.labid = labid;
    }

    public String getLabid() {
        return labid;
    }

    public Labstatus getStatus() {
        return status;
    }

    public void setStatus(Labstatus status) {
        this.status = status;
    }


}
