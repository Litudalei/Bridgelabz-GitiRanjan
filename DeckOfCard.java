package Day12last;

import java.util.Random;

public class DeckOfCard {

    private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private static final String[] RANKS = {
        "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "Jack", "Queen", "King", "Ace"
    };

    public static void main(String[] args) {
        String[] deck = initializeDeck();
        shuffleDeck(deck);

        int players = 4;
        int cardsPerPlayer = 9;
        String[][] hands = distribute(deck, players, cardsPerPlayer);

        printHands(hands);
    }

    // Create a 52-card deck as "Rank of Suit" strings
    private static String[] initializeDeck() {
        String[] deck = new String[SUITS.length * RANKS.length];
        int index = 0;
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Fisher–Yates shuffle using Random
    private static void shuffleDeck(String[] deck) {
        Random rnd = new Random();
        for (int i = deck.length - 1; i > 0; i--) {
            int j = rnd.nextInt(i + 1);
            // swap deck[i] and deck[j]
            String tmp = deck[i];
            deck[i] = deck[j];
            deck[j] = tmp;
        }
    }

    // Distribute cardsPerPlayer to 'players' players into a 2D array
    // cards are dealt in round-robin order from the top of the shuffled deck
    private static String[][] distribute(String[] deck, int players, int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) {
            throw new IllegalArgumentException("Not enough cards to distribute");
        }

        String[][] hands = new String[players][cardsPerPlayer];
        int deckIndex = 0;

        for (int card = 0; card < cardsPerPlayer; card++) {
            for (int p = 0; p < players; p++) {
                hands[p][card] = deck[deckIndex++];
            }
        }

        return hands;
    }

    // Nicely print each player's hand
    private static void printHands(String[][] hands) {
        for (int p = 0; p < hands.length; p++) {
            System.out.println("Player " + (p + 1) + " :");
            for (int c = 0; c < hands[p].length; c++) {
                System.out.printf("  %2d) %s%n", c + 1, hands[p][c]);
            }
            System.out.println();
        }
    }
}

