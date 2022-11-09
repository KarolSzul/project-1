package org.Project1.Project1;

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

    // Metoda wybierz pytanie
    public void chooseQuestion() {  // metoda do wybierania kategorii i wartości pytania
        System.out.println("Choose your Category: [1] Cars [2] Famous [3] Geography [4] Sports");
        Scanner scannerCategory = new Scanner(System.in);
        Integer category = scannerCategory.nextInt();
        System.out.println(" Choose value of answer : [1] for 250, [2] for 500, [3] for 1000, [4] for 2000");
        Scanner scannerScore = new Scanner(System.in);
        Integer score = scannerScore.nextInt();
        // typ zwracany do zmiany jak będzie dalej pasować
    }

} //Class end


