package org.Project1.Project1;

import java.util.*;

public class QuestionPool {

    public static void main(String[] args) {

        LinkedHashMap<Integer, Questions> questions = new LinkedHashMap<Integer, Questions>();

        questions.put(11, GeographyQuestion.geographyQuestion1);
        questions.put(12, GeographyQuestion.geographyQuestion2);
        questions.put(13, GeographyQuestion.geographyQuestion3);
        questions.put(14, GeographyQuestion.geographyQuestion4);
        questions.put(21, CarsQuestion.carsQuestion1);
        questions.put(22, CarsQuestion.carsQuestion2);
        questions.put(23, CarsQuestion.carsQuestion3);
        questions.put(24, CarsQuestion.carsQuestion4);
        questions.put(31, FamousQuestion.famousQuestion1);
        questions.put(32, FamousQuestion.famousQuestion2);
        questions.put(33, FamousQuestion.famousQuestion3);
        questions.put(34, FamousQuestion.famousQuestion4);
        questions.put(41, SportsQuestion.sportsQuestion1);
        questions.put(42, SportsQuestion.sportsQuestion2);
        questions.put(43, SportsQuestion.sportsQuestion3);
        questions.put(44, SportsQuestion.sportsQuestion4);

        }
    }
