package org.Project1.Project1;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class QuestionPool {

    String filePath = "Jeopardy-2.csv";
    static HashSet<Question> questions;


    public int numberOfQuestions(){
        return questions.size();
    }

    public QuestionPool(){

// przerobić na zwykłe czytanie pliku - linijka po linijce aż do końca pliku i zamknięcie.

        BufferedReader bufferedReader;
        String singleLine;
        questions = new HashSet<Question>();
        try {
            bufferedReader = new BufferedReader(new
                    FileReader(filePath));

            // CARS;500;This Japanese luxury brand debuted in the U.S. with the Legend sedan in 1986;Acura
            while ((singleLine = bufferedReader.readLine()) != null)
            {
                Question question = new Question(singleLine);
                questions.add(question);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    } // construktor end

    // metoda do usuwanie pytan z puli
    public void  removeQuestion(Question question){
        questions.remove(question);
    }

    public static Question selectQuestion(Category category, int score) {
        HashSet<Question> result = new HashSet<>();

        for ( Question question : questions) {
            if(question.category == category && question.reward == score) {
                result.add(question);
            }
        }
        Question[] resultNumbers = result.toArray(new Question[result.size()]);
        Random randomQuestion = new Random();
        int randomNumber = randomQuestion.nextInt(result.size());
        return resultNumbers[randomNumber];
    }



} // class end
