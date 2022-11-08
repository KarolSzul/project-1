package org.Project1.Project1;

public class FamousQuestion extends Questions{

    public FamousQuestion(String textContent, Integer reward, String correctAnswer) {
        super(textContent, reward, correctAnswer);
    }

    @Override
    public boolean isAnswearCorrect(String answear) {
        return false;
    }

    @Override
    public Integer givePoints(Integer valueOfQuestion) {
        return null;
    }
}
