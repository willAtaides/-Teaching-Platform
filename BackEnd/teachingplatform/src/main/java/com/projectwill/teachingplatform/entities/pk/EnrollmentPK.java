package com.projectwill.teachingplatform.entities.pk;

import com.projectwill.teachingplatform.entities.Enrollment;
import com.projectwill.teachingplatform.entities.Offer;
import com.projectwill.teachingplatform.entities.User;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class EnrollmentPK {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;

    public EnrollmentPK(){

    }

    public EnrollmentPK(User user, Offer offer) {
        this.user = user;
        this.offer = offer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Offer getOffer() {
        return offer;
    }

    public void setOffer(Offer offer) {
        this.offer = offer;
    }

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnrollmentPK that)) return false;

        return user.equals(that.user) && offer.equals(that.offer);
    }

    @Override
    public int hashCode() {
        int result = user.hashCode();
        result = 31 * result + offer.hashCode();
        return result;
    }
}
