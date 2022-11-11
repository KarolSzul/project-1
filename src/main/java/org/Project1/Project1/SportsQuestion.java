package org.Project1.Project1;

public class SportsQuestion extends Questions{
    public SportsQuestion(String textContent, Integer reward, String correctAnswer) {
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

    static SportsQuestion sportsQuestion1 =
            new SportsQuestion("Nike's stock fell when this basketball player announced his retirement in January 1999",
                    250, "Michael Jordan");

    static Questions sportsQuestion2 =
             new SportsQuestion("Ben Crenshaw & Phil Mickelson are the only 3-time winners of this college sport's championship tournament",
                    500, "Golf");

    static SportsQuestion sportsQuestion3 =
            new SportsQuestion("In 1989 this Canadian team won its 1st Stanley Cup",
                    1000, "Calgary Flames");

    static SportsQuestion sportsQuestion4 =
            new SportsQuestion("In 1895 at a YMCA, this indoor sport was developed for businessmen who found basketball too vigorous",
                    2000, "Volleyball");


}
