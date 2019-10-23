package org.acme.quickstart;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="GREETING")
public class Greeting {

    private Long id;

    private String name;
    private String age;

    public Greeting() {

    }

    public Greeting(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="greetingSeq")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Greeting greeting = (Greeting) o;
        return Objects.equals(name, greeting.name) &&
                Objects.equals(age, greeting.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
