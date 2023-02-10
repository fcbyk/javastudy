import grammar.consoleProgram.*;
import api.struct.*;
import grammar.object.*;

public class app {
    public static void main(String[] args) {
        Person p = new Person("ÀÏÍõ",30);
        Dog d = new Dog(2,"ºÚ");
        Cat c = new Cat(3,"»Ò");
        p.keepPet(d,"¹ÇÍ·");
        p.keepPet(c,"Óã");
    }
}