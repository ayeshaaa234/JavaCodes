package week_1;

public class Driver {
    public static void main(String args[]) {
        Rectangle r1 = new Rectangle(2, 2);
        Rectangle r2 = new Rectangle(4,8 );
        Rectangle smallerrec=r1.getMinRec(r1,r2);

        System.out.println("area is:"+r1.calarea());
        System.out.println("perimeter is:"+r1.calperimeter());
        System.out.println("the smaller rectangle is "+r1.getMinRec(r1,r2).getLength());
        r1.setLength(7);
        r1.setWidth(2);

        System.out.println("area is now :"+r1.calarea());
        System.out.println("perimeter is now :"+r1.calperimeter());

    }

}

