package ch.heig.pl.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import java.util.Calendar;

@Entity
@IdClass(BelongId2.class)
public class Belong2 {
    @Id
    @ManyToOne
    private Contact contact;

    @Id
    @ManyToOne
    private Groupe groupe;

    private Calendar dateJoined;

    public Belong2() {
    }

    public Belong2(Contact contact, Groupe groupe, Calendar dateJoined) {
        this.contact = contact;
        this.groupe = groupe;
        this.dateJoined = dateJoined;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Groupe getGroup() {
        return groupe;
    }

    public void setGroup(Groupe groupe) {
        this.groupe = groupe;
    }

    public Calendar getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Calendar dateJoined) {
        this.dateJoined = dateJoined;
    }
}
