package labassignment;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Computer c1 = new Computer("234", "hd45", 23, 43, true);
        Computer c2 = new Computer("264", "hd45", 23, 43, true);
        Computer temp = c1.clone();
        if (c1.equals(c2)) {
            System.out.println("they are equal");
        } else {
            System.out.println("they are not equal");
        }
        System.out.println(temp);
    }

}


