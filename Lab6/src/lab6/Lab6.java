package lab6;

enum Suit {
    DIAMOND,
    CLUB,
    HEART,
    SPADE

}

enum Rank {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING
}

class Card {

    Suit suit;
    Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public int getValue() {
        return rank.ordinal() + 1;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

}

class Deck {

    private Card[] cards;

    public Deck() {
        initializeDeck();
    }

    private void initializeDeck() {
        Suit[] suits = Suit.values();
        Rank[] ranks = Rank.values();

        cards = new Card[52];

        int i = 0;
        for (Suit suit : suits) {
            for (Rank rank : ranks) {
                cards[i] = new Card(suit, rank);
                i++;
            }
        }
    }

 public void print() {
 
     

    for (Card card : cards) {
        System.out.printf("%-"+ (20) + "s\u001B[31m**\u001B[0m\n", card); // \u001B[31m your string \u001B[0m MAKES RED *
        // %   formatting
        // -   left
        //(20) at least place that card takes 
        if (card.getRank() == Rank.KING) {
            System.out.println("\u001B[31m**********************\u001B[0m");
            System.out.println("\u001B[31m**********************\u001B[0m");
        }
    }
}


}

public class Lab6{

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.print();
        
    }

}
