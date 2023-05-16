public class Emp implements java.io.Serializable{
    private int id;
    private  String name, address;
    public Emp(){}
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return  id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}
