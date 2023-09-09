import Common.Validation;
import Model.Element;
import Controller.Program;

public class Main {
    public static void main(String []args){
        Validation v = new Validation();
        Element e = new Element();
        e.setSize(v.getInt("Enter size of array: ", 1, 100));
        e.setArray(v.getArray(e.getSize()));
        Program p = new Program(e);
        p.run();
}
}
