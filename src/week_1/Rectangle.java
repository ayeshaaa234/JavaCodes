package week_1;

public class Rectangle {

        private double length;
        private double width;



        public Rectangle(double length , double width
        ) {
            this.length = length;
            this.width = width;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getLength() {
            return length;
        }

        public double getWidth() {
            return width;
        }

        public double calarea(){

            return length*width;

        }
        public double calperimeter()
        {
            return (2*(length+width));
        }
        public Rectangle getMinRec (Rectangle r1, Rectangle r2){

            if(r1.calarea()<r2.calarea())
                return r1;
            else
                return r2;
        }




}
