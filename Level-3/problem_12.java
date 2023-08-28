public class problem_12 {
    public static void main(String[] args) {
        int tStudents = 90;
        int tBoys = 45;
        int tGradeA = tStudents / 2;
        int gradeABoys = 20;

        int gradeAGirls = tGradeA - gradeABoys;
        System.out.println(gradeAGirls);
    }
}
