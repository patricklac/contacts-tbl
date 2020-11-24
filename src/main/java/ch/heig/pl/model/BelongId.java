package ch.heig.pl.model;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class BelongId implements Serializable {
    @ManyToOne
    private Contact contact;

    @ManyToOne
    private Groupe groupe;

    public BelongId() {
    }

    public BelongId(Contact contact, Groupe groupe) {
        this.contact = contact;
        this.groupe = groupe;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }
}
