class PhysicsTeacher extends Teacher {

    public PhysicsTeacher(String name) {
        this.name = name;
    }
    public void teach() {
        System.out.println(name + "Teacher is teaching class");
    }

    public void markAttendance() {
        System.out.println(name + "Teacher is marking attendance");
    }
}

class MathsTeacher extends Teacher {

    public MathsTeacher(String name) {
        this.name = name;
    }

    public void teach() {
        System.out.println(name + "Teacher is teaching class");
    }

    public void markAttendance() {
        System.out.println(name + "Teacher is marking attendance");
    }

}





public class Teacher {
    String name;

    public void teach() {
        System.out.println("Teacher is teaching class");
    }

    public void markAttendance() {
        System.out.println("Teacher is marking attendance");
    }
}
