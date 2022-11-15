package org.Project1.Project1;

import java.util.ArrayList;
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
    public void chooseQuestion() {  // metoda do wybierania kategorii i wartości pytania

        Scanner scanner = new Scanner(System.in);
        int[] categoriesArray = {1, 2, 3, 4};
        System.out.println("Choose your Category: [1] Cars [2] Famous [3] Geography [4] Sports");
//        System.out.println("Choose your Category:"  + Category.CARS);
//        if(int i = 0; i < Category.SPORTS; i ++){
//            System.out.println("[" +i+ "] " +Category(i));
//        }
        Integer category = scanner.nextInt();
        try {
            System.out.println(categoriesArray[category]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Choose correct category; [1] Cars [2] Famous [3] Geography [4] Sports ");
        }

        System.out.println(" Choose value of answer : [1] for 250, [2] for 500, [3] for 1000, [4] for 2000");
        int[] valuesArray = {250, 500, 1000, 2000};
        Integer score = scanner.nextInt();

        try {
            System.out.println(valuesArray[score]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Choose correct value of answer : [1] for 250, [2] for 500, [3] for 1000, [4] for 2000");
            // typ zwracany do zmiany jak będzie dalej pasować
        }
    }
} //Class end


