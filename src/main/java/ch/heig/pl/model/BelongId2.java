package ch.heig.pl.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class BelongId2 implements Serializable {
    private int contact;
    private String groupe;

    public BelongId2() {
    }

    public BelongId2(int contact, String groupe) {
        this.contact = contact;
        this.groupe = groupe;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String group) {
        this.groupe = group;
    }
}
