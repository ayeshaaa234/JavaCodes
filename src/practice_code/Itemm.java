package practice_code;

public abstract class Itemm {
     String name;
     String Id;
    boolean ischecked;

    public Itemm(String name, String Id, boolean ischecked) {
        this.name = name;
        this.Id=Id;
        this.ischecked=ischecked;

    }

    abstract void additem();
     abstract void removeitem();
     abstract boolean checkedoutitem();
     abstract void returnitem();
     abstract void displayitem();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public boolean isIschecked() {
        return ischecked;
    }

    public void setIschecked(boolean ischecked) {
        this.ischecked = ischecked;
    }

    @Override
    public String toString() {
        return "Itemm{" +
                "name='" + name + '\'' +
                ", Id='" + Id + '\'' +
                ", ischecked=" + ischecked +
                '}';
    }
}
