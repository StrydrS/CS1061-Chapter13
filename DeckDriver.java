import java.util.ArrayList;
import java.util.Random;

public class DeckDriver {
    public static void main(String[] args) {
        Deck deck = new Deck();

        // Adding cards to the deck
        deck.addCard(new Card("2", "clubs"));
        deck.addCard(new Card("3", "clubs"));
        deck.addCard(new Card("Ace", "spades"));
        deck.addCard(new Card("3", "hearts"));
        deck.addCard(new Card("5", "clubs"));
        deck.addCard(new Card("6", "clubs"));
        deck.addCard(new Card("Ace", "diamonds"));
        deck.addCard(new Card("4", "hearts"));

        // Displaying unshuffled deck
        System.out.println("Unshuffled Deck:");
        for (Card card : deck.cards) {
            System.out.println(card);
        }

        // Shuffling the deck
        deck.shuffle();

        // Displaying shuffled deck
        System.out.println("\nDeck after shuffling:");
        for (Card card : deck.cards) {
            System.out.println(card);
        }
    }
}

class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String toString() {
        return rank + " of " + suit;
    }
}

class GroupOfCards {
    protected ArrayList<Card> cards;

    public GroupOfCards() {
        cards = new ArrayList<Card>();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public Card removeCard(Card card) {
        cards.remove(card);
        return card;
    }
}

class Deck extends GroupOfCards {
    public void shuffle() {
        Random rand = new Random();
        ArrayList<Card> shuffled = new ArrayList<Card>();

        while (!cards.isEmpty()) {
            int index = rand.nextInt(cards.size());
            shuffled.add(cards.remove(index));
        }

        cards = shuffled;
    }
}


