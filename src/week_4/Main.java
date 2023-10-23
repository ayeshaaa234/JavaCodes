package week_4;

public class Main {
    public static void main(String args[])
    {

        Music m1=new Music("74:34",new Singer("atif aslam","Pakistan","male",new Date(12,12,2004)),new Date(12,3,34),"hop","suroor");
        Music m2=new Music("34:56",new Singer("hania amir","pakistan","female",new Date(13,23,12)),new Date(23,12,23),"pipop","rang");
        System.out.println(m1);
        System.out.println(m2);


        if (m1.equals(m2))
        {
            System.out.println("they are equal");

        }
        else
        {
            System.out.println("they are not equal");
        }

//         String temp=m1;
//
//        System.out.println(temp);



    }
}
