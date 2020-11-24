package ch.heig.pl.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import java.util.Calendar;

@Entity
public class Belong {
    @Id
    private BelongId belongId;

    private Calendar dateJoined;


    public Belong() {
    }

    public Belong(BelongId belongId, Calendar dateJoined) {
        this.belongId = belongId;
        this.dateJoined = dateJoined;
    }

    public BelongId getBelongId() {
        return belongId;
    }

    public void setBelongId(BelongId belongId) {
        this.belongId = belongId;
    }

    public Contact getContact() {
        return belongId.getContact();
    }

    public void setContact(Contact contact) {
        belongId.setContact(contact);
    }

    public Groupe getGroupe() {
        return belongId.getGroupe();
    }

    public void setGroupe(Groupe groupe) {
        belongId.setGroupe(groupe);
    }

    public Calendar getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(Calendar dateJoined) {
        this.dateJoined = dateJoined;
    }
}
