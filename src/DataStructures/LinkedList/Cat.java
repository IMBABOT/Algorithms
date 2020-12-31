package DataStructures.LinkedList;

public class Cat {
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age;
    public String name;

    public Cat(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
       return String.format("age: %d, name: %s", age, name);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cat)) return false;
        Cat c = (Cat)obj;
        return (this.name.equals(c.getName()) && this.age == c.getAge());
    }
}
