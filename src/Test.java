import java.util.Arrays;

public class Test {
    public static void main (String args[]){
        Emp e = new Emp();
        e.setId(01);
        e.setName("Gabriel Muktan");
        e.setAddress("Bhaisepati");
        System.out.println("ID = " + e.getId());
        System.out.println("Employee name = " + e.getName());
        System.out.println("Employee address = " + e.getAddress());
    }
}
