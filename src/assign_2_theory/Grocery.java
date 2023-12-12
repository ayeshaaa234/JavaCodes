package assign_2_theory;

public class Grocery extends Product{
    String mfgDate;
    String calories;
    String expDate;

    public Grocery(int Id, String name, double price, int stQuantity, double tax,String mfgDate,String calories,String expDate) {
        super(Id, name, price, stQuantity, tax);
        this.mfgDate=mfgDate;
        this.calories=calories;
        this.expDate=expDate;
    }


    public String getMfgDate() {

        return mfgDate;
    }

    public void setMfgDate(String mfgDate) {

        this.mfgDate = mfgDate;
    }

    public String getCalories() {

        return calories;
    }

    public void setCalories(String calories) {

        this.calories = calories;
    }

    public String getExpDate() {

        return expDate;
    }

    public void setExpDate(String expDate) {

        this.expDate = expDate;
    }

    @Override
    public String toString() {
        return String.format("Grocery - %s, Mfg Date: %s, Exp Date: %s, Calories: %s",
                super.toString(), mfgDate, expDate, calories);
    }
}
