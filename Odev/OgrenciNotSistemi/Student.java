package Odev.OgrenciNotSistemi;

public class Student {
    String name, stuNo;
    int classes;
    Course c1, c2, c3;
    double average;

    Student(String name, String stuNo, int classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    void addExamNotes(int c1Exam, int c2Exam, int c3Exam){
        if ((c1Exam >= 0) && (c1Exam <= 100))
        {
            this.c1.noteExam = c1Exam;
        }
        if ((c2Exam >= 0) && (c2Exam <= 100))
        {
            this.c2.noteExam = c2Exam;
        }
        if ((c3Exam >= 0) && (c3Exam <= 100))
        {
            this.c3.noteExam = c3Exam;
        }
    }

    void addParticipation(int c1Part, int c2Part, int c3Part)
    {
        if ((c1Part >= 0) && (c1Part <= 100))
        {
            this.c1.notePart = c1Part;
        }
        if ((c2Part >= 0) && (c2Part <= 100))
        {
            this.c2.notePart = c2Part;
        }
        if ((c3Part >= 0) && (c3Part <= 100))
        {
            this.c3.notePart = c3Part;
        }
    }

    void calcAverage(){
        System.out.println("=======================");
        double c1Av = (this.c1.noteExam*0.8) + (this.c1.notePart*0.2);
        double c2Av = (this.c2.noteExam*0.8) + (this.c2.notePart*0.2);
        double c3Av = (this.c3.noteExam*0.8) + (this.c3.notePart*0.2);
        System.out.println(this.c1.name + " Average: " + c1Av);
        System.out.println(this.c2.name + " Average: " + c2Av);
        System.out.println(this.c3.name + " Average: " + c3Av);
        this.average = (c1Av + c2Av + c3Av)/3.0;
        System.out.println("Overall: " + this.average);
    }

    void isPass(){
        if (this.average > 55)
        {
            System.out.println("You passed the class!");
        }
        else {
            System.out.println("You did not pass the class!");
        }
    }

    void printNoteInfo(){
        calcAverage();
        isPass();
    }
}
