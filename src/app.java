import grammar.consoleProgram.*;
import api.struct.*;
import grammar.object.*;

public class app {
    public static void main(String[] args) {
        Person p = new Person("����",30);
        Dog d = new Dog(2,"��");
        Cat c = new Cat(3,"��");
        p.keepPet(d,"��ͷ");
        p.keepPet(c,"��");
    }
}