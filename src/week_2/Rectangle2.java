package week_2;

public class Rectangle2 {
    // Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
        public static void main(String[] args) {
            Rectangle r1=new Rectangle(0,0,0,0);
            Rectangle r2=new Rectangle(0,0,0,0);
            if(r1.Isoverlapping(r2)) {
                System.out.println("rectangles are overlapping");
            }
            else {
                System.out.println("rectangles are not overlapping");
            }
        }

}
