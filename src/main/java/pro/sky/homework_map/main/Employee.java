package pro.sky.homework_map.main;

import java.util.Objects;

public record Employee(String firstName, String lastName) {

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName(), employee.firstName()) && Objects.equals(lastName(), employee.lastName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName(), lastName());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name ='" + firstName() + '\'' +
                ", Surname ='" + lastName() + '\'' +
                '}';
    }
}
