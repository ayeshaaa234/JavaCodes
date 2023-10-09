package week_2;

public class Rectangle {
    private int x1,x2,y2,y1;
    public Rectangle(int x1, int x2 , int y1, int y2){
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }

    public boolean Isoverlapping(Rectangle other){

        if(x1> other.x2 || x2<other.x1 || y1> other.y2 || y2< other.y1)
            return false;
        else
            return true;

    }
}

