package org.Project1.Project1;

import java.util.*;

public class Player {
    private Integer id;
    private String name;
    private Integer numberOfPoints;
    private boolean isRight;

    // Konstruktor
    public Player(Integer id, String name, Integer numberOfPoints, boolean isRight) {
        this.id = id;
        this.name = name;
        this.numberOfPoints = numberOfPoints;
        this.isRight = isRight;
    }

    // Gettery i settery
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumberOfPoints() {
        return numberOfPoints;
    }

    public void setNumberOfPoints(Integer numberOfPoints) {
        this.numberOfPoints = numberOfPoints;
    }

    public boolean isRight() {
        return isRight;
    }

    public void setRight(boolean right) {
        isRight = right;
    }

    public static Player[] settingPlayers() throws EmptyStringException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the first player: "); //wczytywanie nazwy 1. gracza
        String name1 = scanner.nextLine();
        if (name1 == null || name1.isEmpty()) {
            throw new EmptyStringException("Please write a correct name!");
        }
        Player player1 = new Player(1, name1, 0, true); // tworzenie 1. gracza


        System.out.println("Name of the second player: "); //wczytywanie nazwy 2. gracza
        String name2 = scanner.nextLine();
        Player player2 = new Player(2, name2, 0, true); // tworzenie 2. gracza


        System.out.println("Name of the third player: "); //wczytywanie nazwy 3. gracza
        String name3 = scanner.nextLine();
        Player player3 = new Player(3, name3, 0, true); // // tworzenie 3. gracza


        System.out.println("Player " + player1.getId() + " : " + player1.getName() + " Number of points: " + player1.getNumberOfPoints());
        System.out.println("Player " + player2.getId() + " : " + player2.getName() + " Number of points: " + player2.getNumberOfPoints());
        System.out.println("Player " + player3.getId() + " : " + player3.getName() + " Number of points: " + player3.getNumberOfPoints());

//        List<Player> players = new ArrayList<>();
//        players.add(player1);
//        players.add(player2);
//        players.add(player3);

        Player[] players = new Player[] {player1, player2, player3};


        return players;
    }


    // Metoda wybierz pytanie
    public static Question chooseQuestion(QuestionPool questionPool) {  // metoda do wybierania kategorii i wartości pytania

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your Category: [1] Geography [2] Cars [3] Famous [4] Sports");
        Integer userInput = scanner.nextInt();
        while (userInput != 1 && userInput != 2 && userInput != 3 && userInput != 4) {
            System.out.println("Oops, your input is incorrect! Please try again.");
            System.out.println("Choose your Category: [1] Geography [2] Cars [3] Famous [4] Sports");
            userInput = scanner.nextInt();
        }
        // mozna tu wylapac blad podania stringa zamiast inta
        Category category = Category.values()[userInput - 1];


        System.out.println(" Choose value of answer : 250, 500, 1000, 2000");
        int score = scanner.nextInt();
        var list = List.of(250, 500, 1000, 2000);
        var result = list.contains(score);


        while (!result) {
            System.out.println("Oops, your input is incorrect! Please try again.");
            score = scanner.nextInt();
            result = list.contains(score);
        }


        System.out.println("Chosen a question from category :" + category + " worth " + score + " points.");


        System.out.println();
        System.out.println();

        Question question = QuestionPool.selectQuestion(category, score); // wyswietlanie pytania
        return question;
//

//        System.out.println("Prawidłowa odpowiedź to: " + question.correctAnswer); // wyswietlanie prawidłowej odpowiedzi



        // boolean zmienia wartość na false i przechodzi do następnego playera

    }




    public static void displayQuestionText(Question question) {
        System.out.println(question.textContent);
    }

    public static boolean canYouAskThatQuestion (Question  question, Question[] askedQuestions) {
        for (Question allAskedQueestions : askedQuestions) {
            if (allAskedQueestions == null) {
                return true;
            }
            else if (question.reward == allAskedQueestions.reward && question.category == allAskedQueestions.category) {
                return false;
            }
        }
        return true;

    }

    public static String insertAnswer() {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next(); // wpisywanie odpowiedzi
        return answer;
    }

    public static boolean isAnswerCorrect(String playerAnswer, String correctAnswer) {
        if (playerAnswer.equalsIgnoreCase(correctAnswer)) // porównywanie odpowiedzi
        {

            return true;
        }
        // boolean dalej jest true i następuje następna iteracja

        else{
            return false;
        }
    }

    public static void addPoints(boolean isTrue, int points, Player currentplayer, Question question) {
        if (isTrue) {
            System.out.println("Good answer! " + points + " points have been added to your account. ");
            currentplayer.setNumberOfPoints(currentplayer.numberOfPoints + points);
        }
        else {
            System.out.println("Your answer was incorrect. " + points + " points have been taken from your account \n" +
                    "Correct answer is: " + question.correctAnswer + ".");
            currentplayer.setNumberOfPoints(currentplayer.numberOfPoints - points);
        }

    }


    public static String answerFromPlayer() {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer;


    }

    public static Integer whosPlaying(int turn) {
    return turn%3+1;
    }

    public static void yourWinnerIs (Player[] players) {
        Player champion = players[0];
        for (Player highestPoints : players){
            if (highestPoints.getNumberOfPoints() > champion.getNumberOfPoints()) {
                champion = highestPoints;
            }
        }
        System.out.printf("The game is over!\nYour winner is: %s with %d points! " +
                "Congratulations!", champion.getName(), champion.getNumberOfPoints());
    }


} //Class end