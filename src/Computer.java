public class Computer implements IDoble{


    private String id;
    private String make;
    protected Memory memory;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Computer(String id,String make,String memType,int memsize){
        setId(id);
        setMake(make);
        memory = new Memory(memType,memsize);

    }

    @Override
    public String toString() {
        return String.format("ID: %15s\nMake: %15s\n %s", getId(),getMake(),memory.toString());
    }

    @Override
    public void setID(String id) {

    }
}
