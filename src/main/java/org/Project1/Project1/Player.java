package org.Project1.Project1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Player {
    private Integer id;
    private String name;
    private Integer numberOfPoints;

    // Konstruktor
    public Player(Integer id, String name, Integer numberOfPoints) {
        this.id = id;
        this.name = name;
        this.numberOfPoints = numberOfPoints;
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


    public static List<Player> settingPlayers() throws EmptyStringException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of first player: "); //wczytywanie nazwy 1. gracza
        String name1 = scanner.nextLine();
        if(name1 == null || name1.isEmpty()){
            throw  new EmptyStringException("Please write correct name!");
        }
        Player player1 = new Player(1, name1, 0); // tworzenie 1. gracza


        System.out.println("Name of second player: "); //wczytywanie nazwy 2. gracza
        String name2 = scanner.nextLine();
        Player player2 = new Player(2, name2, 0); // tworzenie 2. gracza


        System.out.println("Name of third player: "); //wczytywanie nazwy 3. gracza
        String name3 = scanner.nextLine();
        Player player3 = new Player(3, name3, 0); // // tworzenie 3. gracza



        System.out.println("Player " + player1.getId() + " : " + player1.getName() + " Number of points: " + player1.getNumberOfPoints());
        System.out.println("Player " + player2.getId() + " : " + player2.getName() + " Number of points: " + player2.getNumberOfPoints());
        System.out.println("Player " + player3.getId() + " : " + player3.getName() + " Number of points: " + player3.getNumberOfPoints());

        List<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);


        return players;
    }


    // Metoda wybierz pytanie
    public static void chooseQuestion() {  // metoda do wybierania kategorii i wartości pytania

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your Category: [1] Geography [2] Cars [3] Famous [4] Sports");
        Integer userInput = scanner.nextInt();
        while (userInput != 1 && userInput != 2 && userInput != 3 && userInput != 4) {
            System.out.println("Oops, your input is wrong! Please try again.");
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
            System.out.println("Oops, your input is wrong! Please try again.");
            score = scanner.nextInt();
            result = list.contains(score);
        }
            System.out.println("wybrano kategorie :" + category + " o wartosci; " + score);




        System.out.println();


    }

    public static String answerFromPlayer(){
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer;
    }



} //Class end