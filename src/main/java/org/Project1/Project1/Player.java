package org.Project1.Project1;

public class Player {
        private Integer id;
        private String name;
        private Integer numberOfPoints;

        // Konstruktor
        public Player(Integer id, String name, Integer numberOfPoints){
            this.id = id;
            this.name = name;
            this.numberOfPoints = numberOfPoints;
        }
        // Gettery i settery
        public Integer getId() {return id;}

        public void setId(Integer id) {this.id = id;}

        public String getName() {return name;}

        public void setName(String name) {this.name = name;}

        public Integer getNumberOfPoints() {return numberOfPoints;}

        public void setNumberOfPoints(Integer numberOfPoints) {this.numberOfPoints = numberOfPoints;}

        // Metoda wybierz pytanie
        public Integer chooseQuestion(){
            // ciało metody "wybierz pytanie"
            return null; //null do zmiany jak już będzie logika
        }

    } //Class end


