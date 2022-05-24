//Part 2

public class Student extends Person{

    private int credits;

    public Student(String name, String address) {
        super(name, address);
        this.credits = 0;
    }

    public int study(){
        this.credits += 1;
        return credits;
    }

    public int credits(){
        return credits;
    }

    @Override
    public String toString(){
        return super.toString() +"\nStudy credits " + credits();

    }

}
