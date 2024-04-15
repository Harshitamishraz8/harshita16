
//Define the Person class
class Person {
 // Attributes
 private String name;
 private int age;

 // Constructor
 public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 // Getters
 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }
}

public class java1 {
 public static void main(String[] args) {
     // Create two instances of the Person class
     Person person1 = new Person("Harshita", 21);
     Person person2 = new Person("Janhavi", 20);

     // Print their name and age
     System.out.println("Person 1: Name - " + person1.getName() + ", Age - " + person1.getAge());
     System.out.println("Person 2: Name - " + person2.getName() + ", Age - " + person2.getAge());
 }
}
