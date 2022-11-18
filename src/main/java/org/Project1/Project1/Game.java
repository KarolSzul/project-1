package org.Project1.Project1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Game {
    QuestionPool pool;
    List<Player> players;
    public static Map<Category, Integer> askedQuestions = new HashMap<>(); // ta mapa nie ma już sensu
    TableBuilder tableBuilder = new TableBuilder();

    public Game(QuestionPool pool, List<Player> players) {
        this.pool = pool;
        this.players = players;
    }

    public static void main(String[] args) throws EmptyStringException {

        Player[] playerList = Player.settingPlayers();
        QuestionPool questionPool = new QuestionPool();
        Question[] askedQuestions = new Question[16];

        int turn =0;
        int numberOfQuestionsAsked=0;

        while (numberOfQuestionsAsked < 16) { // ta pętla jest od grania do końca pytań
//        for (int i=1; i<=16; i++) {
            System.out.println();
            int whichPlayer = Player.whosPlaying(turn);
            System.out.printf("Player %d is now playing.\n", whichPlayer);
            boolean correctAnswer = true;
            while (correctAnswer) { // ta pętla jest od zmiany zawodników
                Integer width = 4;
                Integer height = 4;
                String[][] board = TableBuilder.getCleanBoard(width, height);
                TableBuilder.displayBoard(board);
                Question thisTurnQuestion = Player.chooseQuestion(questionPool);
                while (!Player.canYouAskThatQuestion(thisTurnQuestion, askedQuestions)) {
                    System.out.println("This question has been used, please try another");
                    thisTurnQuestion = Player.chooseQuestion(questionPool);
                } // tu musi byc inny warunek
                askedQuestions[numberOfQuestionsAsked]=thisTurnQuestion;
                numberOfQuestionsAsked++;
                Player.displayQuestionText(thisTurnQuestion);
                String playerAnswer = Player.insertAnswer();
                correctAnswer = Player.isAnswerCorrect(playerAnswer, thisTurnQuestion.correctAnswer);
                Player.addPoints(correctAnswer, thisTurnQuestion.reward, playerList[whichPlayer-1], thisTurnQuestion);
                QuestionPool.removeQuestion(thisTurnQuestion);
                System.out.println();
            }
            turn++;

        }

        Player.yourWinnerIs(playerList);


        // wpisanie odpowiedz przez gracz ->  Metoda Player.answerFromPlayer(++) -> jest już w klasie Player.105-108 // zrobione

        // porówanie odpowiedzi z Player.answerFromPlayer z prawidlową odpowiedzia  correctAnswer // zrobione
        // i dodanie/odejmowanie punktow dla gracza // zrobione

        // uzycie metody QuestionPoll.remone(questions) -> metoda jest już napisana QuestionPoll 46-47 // nie dziala

        // metoda do usuwania nie działa // do zrobienia

        // Jeżeli odpowiedz jest prawidłowa, to gracz gra dalej. Jeżeli nie to przeskakujemy na następnego. // zrobione

        // Po puli 16 pytań gra powinna się zakończyć. // poprawić żeby mogło wyświetlac wiecej niz 1 gracza


    }
}

