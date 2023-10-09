package week_3;

import java.util.Random;

public class Deck {
    Deck() {
        int counter=0;
        for(int i=0;i<4;i++)
            for(int j=0;j<13;j++)
            {
                card[counter++]= new Card(this.suit[i],this.rank[j]);

            }

    }

    @Override
    public String toString() {
        StringBuilder str=new StringBuilder();
        for(int i=0;i<52;i++)
            str.append(card[i]+"\n");
        return str.toString();
    }

    Card card[] = new Card[52];
    String suit[] = new String[4];

    {
        suit[0] = "Clubs";
        suit[1] = "Spade";
        suit[2] = "Hearts";
        suit[3] = "Diamonds";
    }

    String rank[] = {"ace", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

    public String shuffle()
    {
        Random random=new Random();
        for(int i=0;i<6000;i++)
        {
            int randomIndex= random.nextInt(52);
            Card temp=card[randomIndex];
            card[randomIndex]=card[0];
            card[0]=temp;
        }
        return toString();
    }
    public String dealingPlayer() {

        String players[] = new String[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Player " + (i + 1) + "'s hand:");
            for (int j = i; j < 52; j += 4)
                System.out.println(card[j]);
        }
        System.out.println();
        return toString();
    }
}
