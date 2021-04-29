/* Import the java.time.LocalDate and java.time.Period classes.
You will need them later.
*/

import java.time.LocalDate;
import java.time.Period;

/* Declare the class */
public class Person {

    private String name;
    private LocalDate birthDate;
    private Position position;

    public Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate);
    }

    public int getAge() {
        return Period.between(this.birthDate, LocalDate.now()).getYears();
    }
    private class Position {
        String name;
        double salary;

        public Position(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return this.name + ":" + this.salary;
        }
    }
    public void setPosition(String name, double salary){
        this.position = new Position(name, salary);
    }

    public Position getPosition(){return this.position;}

    @Override
    public String toString() {
        return "Person{" +
                "name='" + this.name + '\'' +
                ", age=" + this.getAge() +
                ", position=" + this.position.toString() +
                '}';
    }
}
