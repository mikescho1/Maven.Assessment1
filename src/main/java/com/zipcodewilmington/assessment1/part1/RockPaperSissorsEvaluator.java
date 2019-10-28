package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String winner = "";

        switch (handSign) {
            case ROCK:
                winner += "paper";
                break;
            case PAPER:
                winner += "scissor";
                break;
            case SCISSOR:
                winner += "rock";
        }
        return winner;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String loser = "";

        switch (handSign) {
            case ROCK:
                loser += "scissor";
                break;
            case PAPER:
                loser += "rock";
                break;
            case SCISSOR:
                loser += "paper";
        }
        return loser;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {

        if (handSignOfPlayer1.equals(ROCK)) {
            if (handSignOfPlayer2.equals(PAPER)) {
                return PAPER;
            }
            if (handSignOfPlayer2.equals(SCISSOR)) {
                return ROCK;
            }
        }
        if (handSignOfPlayer1.equals(PAPER)) {
            if (handSignOfPlayer2.equals(SCISSOR)) {
                return SCISSOR;
            }
            if (handSignOfPlayer2.equals(ROCK)) {
                return PAPER;
            }
        }
        if (handSignOfPlayer1.equals(SCISSOR)) {
            if (handSignOfPlayer2.equals(ROCK)) {
                return ROCK;
            }
            if (handSignOfPlayer2.equals(PAPER)) {
                return SCISSOR;
            }
        }
        return null;
    }
}