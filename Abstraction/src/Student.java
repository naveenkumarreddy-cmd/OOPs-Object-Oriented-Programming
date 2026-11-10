 class Details {
     private int id;
     private String name;

     public void setId(int id) {
         this.id = id;
     }

     public int getId() {
         return id;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getName() {
         return name;
     }
 }


public class Student {

    public static void main(String[] args) {

        Details d1 = new Details();

        //accessing the private fields using setter
        d1.setId(1);
        d1.setName("James");

        //accessing the private fields using getter
        System.out.println("The student with id " + d1.getId() + " is: " + d1.getName());
    }

}
