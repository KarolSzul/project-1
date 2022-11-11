package org.Project1.Project1;

public class CarsQuestion extends Questions {
    public CarsQuestion(String textContent, Integer reward, String correctAnswer) {
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

    static CarsQuestion carsQuestion1 = new CarsQuestion("For some FCX Clarity, hop in this company's Civic hybrid",
            250, "Honda");

    static CarsQuestion carsQuestion2 = new CarsQuestion("In 1949 this company produced its one millionth car, a Coupe DeVille",
            500, "Cadillac");

    static CarsQuestion carsQuestion3 = new CarsQuestion("This company has excelled in automaking ever since it produced Korea's first car, the Pony",
            1000, "Hyundai");

    static CarsQuestion carsQuestion4 = new CarsQuestion("In 1987 this Italian company's Quntas sold for about $125,000",
            2000, "Lamborghini");




}
