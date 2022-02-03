package Chapter4;

import java.util.ArrayList;

public class Example {

        private String name;
        private final int studentId;
        private int numberOfCredits;
        private double gpa;

        public Example(String name, int studentId,
        int numberOfCredits, double gpa){
            this.name = name;
            this.studentId = studentId;
            this.numberOfCredits = numberOfCredits;
            this.gpa = gpa;
        }

        public Example(String name, int studentId){
            this.name = name;
            this.studentId = studentId;
            this.numberOfCredits = 0;
            this.gpa = 0.0;
        }

        /* getters and setters omitted */

    }
