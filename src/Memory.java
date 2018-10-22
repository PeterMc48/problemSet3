public class Memory {
    private String type;
    private int size;

    public Memory(){
        this("unknow",0);
    }
    public Memory(String type,int size)
    {
        setType(type);
        setSize(size);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return String.format("memory type: %15s\n Size: %d Gigabytes \n",getType(),getSize());
    }
}
