package org.Project1.Project1;

public abstract class Questions {

    public String textContent;
    public Integer reward;
    public String correctAnswer;

    //KONSTRUKTOR
    public Questions(String textContent, Integer reward, String correctAnswer) {
        this.textContent = textContent;
        this.reward = reward;
        this.correctAnswer = correctAnswer;
    }

    // METODA "czy odpowiedz jest prawidłowa"
    public abstract boolean isAnswerCorrect(String answer);

    public abstract Integer givePoints( Integer valueOfQuestion);

} // Class end
