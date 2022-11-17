package org.Project1.Project1;


import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Category category = Category.CARS;
        Integer score = 250;
        QuestionPool pool = new QuestionPool();
        Question question = QuestionPool.selectQuestion(category, score);
        System.out.println(question.textContent);
        System.out.println("Your answer:");



//       var pool = new QuestionPool();
//      // System.out.println(pool.numberOfQuestions());
//     //  var players = Player.settingPlayers();
//        var player1 = new Player(1,"Konrad",0);
//        player1.chooseQuestion();
//
//        player1.answerFromPlayer();


    }
}