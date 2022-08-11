package Odev.OgrenciNotSistemi;

public class Course {
    Teacher t;
    String name;
    String code;
    String prefix;
    int noteExam;
    int notePart;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.noteExam = 0;
        this.notePart = 0;
    }

    void addTeacher(Teacher t){
        if (this.prefix.equals(t.branch))
        {
            this.t = t;
        }
        else {
            System.out.println("Error! The teacher and course branches do not match.");
        }
    }

    void printTeacher(){
        if (this.t != null)
        {
            System.out.println(this.name + " Professor: " + t.name);
        }
        else {
            System.out.println(this.name + " has no professor!");
        }
    }
}
