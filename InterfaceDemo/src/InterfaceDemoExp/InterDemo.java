package InterfaceDemoExp;

import java.io.*;

public class InterDemo {

    // The Person class
    public static class Person implements Serializable {
        private static final long serialVersionUID = 1L;

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }

    // SerializeExample class
    public static class SerializeExample {
        public static void serializePerson(Person person, String filename) {
            try (FileOutputStream fileOut = new FileOutputStream(filename);
                 ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject(person);
                System.out.println("Serialized data is saved in " + filename);
            } catch (IOException i) {
                i.printStackTrace();
            }
        }
    }

    // DeserializeExample class
    public static class DeserializeExample {
        public static Person deserializePerson(String filename) {
            Person person = null;
            try (FileInputStream fileIn = new FileInputStream(filename);
                 ObjectInputStream in = new ObjectInputStream(fileIn)) {
                person = (Person) in.readObject();
            } catch (IOException i) {
                i.printStackTrace();
            } catch (ClassNotFoundException c) {
                System.out.println("Person class not found");
                c.printStackTrace();
            }
            return person;
        }
    }

    public static void main(String[] args) {
        String filename = "person.ser";
        Person person = new Person("John Doe", 30);

        // Serialize the person object
        SerializeExample.serializePerson(person, filename);

        // Deserialize the person object
        Person deserializedPerson = DeserializeExample.deserializePerson(filename);

        // Print deserialized person details
        if (deserializedPerson != null) {
            System.out.println("Deserialized Person...");
            System.out.println("Name: " + deserializedPerson.getName());
            System.out.println("Age: " + deserializedPerson.getAge());
        }
    }
}
