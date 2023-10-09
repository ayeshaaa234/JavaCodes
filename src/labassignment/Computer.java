package labassignment;


import java.util.Objects;

public class Computer {
    private String Computernumber;
    private String lcdmodel;
    private int ramsize;
    private int hddsize;
    private  boolean hasgpu;

    Computer(String Computernumber, String lcdmodel, int ramsize, int hddsize, boolean hasgpu)
    {
        this.Computernumber=Computernumber;
        this.hasgpu=hasgpu;
        this.hddsize=hddsize;
        this.lcdmodel=lcdmodel;
        this.ramsize=ramsize;
    }

    public int getHddsize() {
        return hddsize;
    }

    public int getRamsize() {
        return ramsize;
    }

    public String getComputernumber() {
        return Computernumber;
    }

    public String getLcdmodel() {
        return lcdmodel;
    }

    public boolean getHasgpu(){
        return hasgpu;
    }
    public void setComputernumber(String computernumber) {
        Computernumber = computernumber;
    }

    public void setHasgpu(boolean hasgpu) {
        this.hasgpu = hasgpu;
    }

    public void setHddsize(int hddsize) {
        this.hddsize = hddsize;

    }

    public void setLcdmodel(String lcdmodel) {
        this.lcdmodel = lcdmodel;
    }

    public void setRamsize(int ramsize) {
        this.ramsize = ramsize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ramsize == computer.ramsize && hddsize == computer.hddsize && hasgpu == computer.hasgpu && Objects.equals(Computernumber, computer.Computernumber) && Objects.equals(lcdmodel, computer.lcdmodel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Computernumber, lcdmodel, ramsize, hddsize, hasgpu);
    }
    public Computer clone(){
        return new Computer(this.getComputernumber(),this.getLcdmodel(),this.getRamsize(),this.getHddsize(),
                this.getHasgpu());
    }

    @Override
    public String toString() {
        return "Computer{" +
                "Computernumber='" + Computernumber + '\'' +
                ", lcdmodel='" + lcdmodel + '\'' +
                ", ramsize=" + ramsize +
                ", hddsize=" + hddsize +
                ", hasgpu=" + hasgpu +
                '}';
    }
}

