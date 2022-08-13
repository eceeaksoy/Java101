package Alistirma.OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut","HIST","555" );
        Teacher t2 = new Teacher("Graham", "PHYS", "000");
        Teacher t3 = new Teacher("Kulyutmaz", "BIO","111");

        Course history = new Course("History","101","HIST");
        history.addTeacher(t1);

        Course physic = new Course("Physic","102","PHY");
        physic.addTeacher(t2);

        Course bio = new Course("Biology","103","BIO");
        bio.addTeacher(t3);

        Student s1 = new Student("Inek Saban","123","4", history, physic, bio);
        s1.addBulkExamNote(100,78,50);
        s1.isPass();

        Student s2 = new Student("Guduk Necmi","444","4", history, physic, bio);
        s2.addBulkExamNote(50,30,70);
        s2.isPass();
    }
}
