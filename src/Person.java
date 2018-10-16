public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person()
    {
        this.setName("No owner specified");
    }
    public Person(String name)
    {
        this.setName(name);
    }

    @Override
    public String toString() {
        return "Owner: " + name;
    }
}
