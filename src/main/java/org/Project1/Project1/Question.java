package org.Project1.Project1;


public class Question {

    public String textContent;
    public int reward;
    public String correctAnswer;
    public Category category;

    //KONSTRUKTOR

    public Question(String textContent, int reward, String correctAnswer, Category category) {
        this.textContent = textContent;
        this.reward = reward;
        this.correctAnswer = correctAnswer;
        this.category = category;
    }

    public Question(String lineFromCSV) {
        // Z jednej linijki chcemy wyciągnać od razu wszystkie informacje (kategoria, punkty, pytanie, odpowiedz)

        // CARS;500;This Japanese luxury brand debuted in the U.S. with the Legend sedan in 1986;Acura
        String[] separatedLine = lineFromCSV.split(";");

        this.category = Category.valueOf(separatedLine[0]); //Caterofy jest Enumem
        this.reward = Integer.parseInt(separatedLine[1]);  // reward jest Integerem
        this.textContent = separatedLine[2];  // String
        this.correctAnswer = separatedLine[3]; // String

    }




} // Class end
