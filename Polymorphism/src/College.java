class TeacherApp {

    public static void accept(Teacher ref) {
        ref.teach();
        ref.markAttendance();
    }
}


public class College {
    public static void main(String[] args) {
      //  TeacherApp t1 = new TeacherApp();

        TeacherApp.accept(new PhysicsTeacher("Ramya"));
        TeacherApp.accept(new MathsTeacher("Akhila"));

    }
}
