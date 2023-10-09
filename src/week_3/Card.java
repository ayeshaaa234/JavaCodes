package week_3;


public class Card {

    String suit;
    String rank;

    Card(String suit, String rank){
        this.suit=suit;
        this.rank=rank;
    }
    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        Card temp=(Card)obj;
        return rank.equals(temp.rank)&&
                suit.equals(temp.suit);

    }
}
