package org.Project1.Project1;

public class GeographyQuestion extends Questions{

    public GeographyQuestion(String textContent, Integer reward, String correctAnswer) {
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
