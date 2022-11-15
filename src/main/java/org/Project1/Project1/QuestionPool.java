package org.Project1.Project1;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class QuestionPool {

    String filePath = "Jeopardy-2.csv";
    HashSet<Question> questions;


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

    } // class end
