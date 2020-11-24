package ch.heig.pl.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Groupe {
    @Id
    private String name;

    private int typ;

    public Groupe() {
    }

    public Groupe(String name, int typ) {
        this.name = name;
        this.typ = typ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTyp() {
        return typ;
    }

    public void setTyp(int number) {
        this.typ = number;
    }
}
