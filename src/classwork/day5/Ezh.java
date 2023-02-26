package day5;

import java.util.Objects;

public class Ezh {

      String name ;
       int id;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ezh ezh = (Ezh) o;
        return id == ezh.id && Objects.equals(name, ezh.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "My age is " + this.id + " My name is " + this.name;

    }
}
