package Odev.OgrenciNotSistemi;

public class Main {
    public static void main(String[] args) {
        Course math = new Course("Mathematic", "MATH101", "MATH");
        Course phys = new Course("Physic","PHYS101","PHYS");
        Course chem = new Course("Chemistry","CHEM101","CHEM");

        Teacher t1 = new Teacher("Prof. John","510","MATH");
        Teacher t2 = new Teacher("Prof. Emily", "342","PHYS");
        Teacher t3 = new Teacher("Prof. Arnold","298","CHEM");

        math.addTeacher(t1);
        phys.addTeacher(t2);
        chem.addTeacher(t3);

        Student s1 = new Student("Aisha","23",4,math, phys, chem);
        s1.addExamNotes(90,43,65);
        s1.addParticipation(100,73,90);
        s1.printNoteInfo();

        Student s2 = new Student("Keeho","15",4,math, phys, chem);
        s2.addExamNotes(32,56,48);
        s2.addParticipation(50,65,60);
        s2.printNoteInfo();

        Student s3 = new Student("Felix","8",4,math, phys, chem);
        s3.addExamNotes(78,86,65);
        s3.addParticipation(85,85,75);
        s3.printNoteInfo();

    }
}

