//This is example for static

public class Records {
    static String college = "BCCI";
    String name ;
    String branch;

    public Records(String name,String branch) {
        this.name = name;
        this.branch = branch;
    }

    public void display() {
        System.out.println("Student Details: " + name + " "+branch+" " + college);
    }

    public static void main(String[] args) {
        Records r1 = new Records("Rohith","Batting");
        Records r2 = new Records("Gill","Captain");
        Records r3 = new Records("Hardik","AllRounder");

        r1.display();
        r2.display();
        r3.display();
    }
}
