package Score;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student( "Jack", 49, 64);
        Student joy =new Student("Joy", 85, 76);
        GraduateStudent jane =
                new GraduateStudent("Jane", 64, 70, 83);
        jack.print();
        joy.print();
        jane.print();
    }
}
