package models;

public class Person implements Payable, Comparable<Person> {
    private int id;
    private static int _idCounter = 0;
    private String name;
    private String surname;
    public Person() {}
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = ++_idCounter;
    }

    public int getId() {
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return surname;
    }

    public String getPosition(){
        return "Student";
    }

    @Override
    public String toString() {
        return id + ". " + name + " "+ surname;
    }


    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public int compareTo(Person other) {
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }
}
