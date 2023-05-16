import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

    public static void main (String[] args){
        Employee e = new Employee();
        e.name = "Hari Naryan";
        e.address = "Bhaisepati";
        e.SSN =11224123;
        e.number =1;

        try {
            FileOutputStream fileout = new FileOutputStream("/home/mossy/dfile/employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileout);
            out.writeObject(e);
            out.close();
            fileout.close();
            System.out.println("Serialized data is saved in /home/mossy/dfile/ ");
        } catch (IOException i){
            i.printStackTrace();
        }
    }
}
