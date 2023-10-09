package week_4;


public class Singer {
    private String name;
    private String nationality;
    private String gender;
    private Date debutyear;

    Singer(String name, String nationality,String gender, Date debutyear){
        this.name=name;
        this.nationality=nationality;
        this.gender=gender;
        this.debutyear=debutyear;
    }

    public String getGender() {
        return gender;
    }

    public void setDebutyear(Date debutyear) {
        this.debutyear = debutyear;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDebutyear() {
        return debutyear;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", nationality='" + nationality + '\'' +
                ", gender='" + gender + '\'' +
                ", debutyear=" + debutyear +
                '}';
    }
}


