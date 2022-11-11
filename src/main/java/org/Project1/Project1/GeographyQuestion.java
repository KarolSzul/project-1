package org.Project1.Project1;

public class GeographyQuestion extends Questions{

    public GeographyQuestion(String textContent, Integer reward, String correctAnswer) {
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

    static GeographyQuestion geographyQuestion1 =
            new GeographyQuestion("Large aboriginal populations live in this country's states of Queensland & New South Wales",
                    250, "Australia");

    static GeographyQuestion geographyQuestion2 =
            new GeographyQuestion("A narrow passage separates Canada's Ellesmere Island from this large Danish island",
                    500, "Greenland");

    static GeographyQuestion geographyQuestion3 =
            new GeographyQuestion("Of the top 5 Canadian cities in population, it's the one closest to the Pacific Ocean",
                    1000, "Vancouver");

    static GeographyQuestion geographyQuestion4 =
            new GeographyQuestion("This city located on the Rhine River became West Germany's capital in 1949",
                    2000, "Bonn");



}
