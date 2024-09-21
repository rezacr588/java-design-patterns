interface Prototype {
    Prototype clone();
}

class ConcretePrototype implements Prototype {
    private String data;

    public ConcretePrototype(String data) {
        this.data = data;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.data);
    }

    @Override
    public String toString() {
        return "ConcretePrototype [data=" + data + "]";
    }
}

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ConcretePrototype prototype = new ConcretePrototype("data");
        ConcretePrototype clonedPrototype = (ConcretePrototype) prototype.clone();
        System.out.println("Original: " + prototype);
        System.out.println("Cloned: " + clonedPrototype);
    }
}