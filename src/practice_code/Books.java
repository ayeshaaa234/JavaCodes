package practice_code;

public class Books extends Itemm {

    public String authorname;
    public int noofpages;

    Itemm []book=new Itemm[100];

    public Books(String name, String Id, boolean ischecked, String authorname, int noofpages) {
        super(name, Id, ischecked);
        this.authorname = authorname;
        this.noofpages = noofpages;
    }

    public String getAuthorname() {
        return authorname;
    }

    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public int getNoofpages() {
        return noofpages;
    }

    public void setNoofpages(int noofpages) {
        this.noofpages = noofpages;
    }

   public  void additem(Itemm books) {
        int counter=0;
        for(int i=0;i<book.length;i++)
        {
            if (counter < book.length) {
                book[counter++] = books;
            }
        }
    }

    public void removeitem(Itemm books) {
        for(int i=0;i<book.length;i++) {
            if (books.getName().equals(this)) {
                book[i] = null;
            }
        }

    }

    public String checkedoutitem(Itemm books) {
        for (int i = 0; i < book.length; i++) {
            if (books.getName().equals(this)) {
                System.out.println("book is present");
            } else {
                System.out.println("book is checked out ");
            }

        }
    }



      public void returnitem(Itemm books){

      }


        public void displayitem() {
            for(int i=0;i<book.length;i++){
                System.out.println("book[i]");
            }
    }

        public String toString() {
        return "Books{" +
                "authorname='" + authorname + '\'' +
                ", noofpages=" + noofpages +
                "} " + super.toString();
    }
}

