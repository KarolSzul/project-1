package org.Project1.Project1;

public class FamousQuestion extends Questions{

    public FamousQuestion(String textContent, Integer reward, String correctAnswer) {
        super(textContent, reward, correctAnswer);
    }

    @Override
    public boolean isAnswerCorrect(String answer) {
        return false;
    }

    @Override
    public Integer givePoints(Integer valueOfQuestion) {
        return null;
    }

    static FamousQuestion famousQuestion1 =
            new FamousQuestion("This billionaire fashion designer introduced Polo jeans in 1996",
            250, "Ralph Lauren");

    static FamousQuestion famousQuestion2 =
            new FamousQuestion("A 1994 book details the way he became the world's greatest investor",
            500, "Warren Buffett");

    static FamousQuestion famousQuestion3 =
            new FamousQuestion("James Gosling helped create this computer language that shares its name with a breakfast beverage",
            1000, "Java");

    static FamousQuestion famousQuestion4 =
            new FamousQuestion("The Americas bear the name of this Italian who explored the area around 1499",
            2000, "Amerigo Vespucci");



}
