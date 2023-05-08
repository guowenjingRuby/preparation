package ten.treeset;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id+":"+name;
    }


    @Override
    public int compareTo(Student o) {
        return this.getId().charAt(0)-o.getId().charAt(0);
    }
}
