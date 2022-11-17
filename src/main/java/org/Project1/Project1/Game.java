package org.Project1.Project1;

import java.util.List;

public class Game {
    QuestionPool pool;
    List<Player> players;

    TableBuilder tableBuilder = new TableBuilder();

    public Game(QuestionPool pool, List<Player> players) {
        this.pool = pool;
        this.players = players;
    }

    public static void main(String[] args) throws EmptyStringException {

        Player.settingPlayers();
        QuestionPool questionPool = new QuestionPool();
        System.out.println();
        System.out.println();

        do {
            do {
                Player player1 = null;
                player1.setRight(true);
                Integer width = 4;
                Integer height = 4;
                String[][] board = TableBuilder.getCleanBoard(width, height);
                TableBuilder.displayBoard(board);
                System.out.println();
                Player.chooseQuestion(questionPool);
                System.out.println();
            }
                while ();


            }
         while ();
    }
        // wpisanie odpowiedz przez gracz ->  Metoda Player.answerFromPlayer(++) -> jest już w klasie Player.105-108

        // porówanie odpowiedzi z Player.answerFromPlayer z prawidlową odpowiedzia  correctAnswer
        // i dodanie/odejmowanie punktow dla gracza

        // uzycie metody QuestionPoll.remone(questions) -> metoda jest już napisana QuestionPoll 46-47

        // Jeżeli odpowiedz jest prawidłowa, to gracz gra dalej. Jeżeli nie to przeskakujemy na następnego.

        // Po puli 16 pytań gra powinna się zakończyć.


    }
}
