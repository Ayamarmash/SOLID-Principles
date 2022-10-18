package edu.najah.eng.solid.lsp.assignment;

import java.util.ArrayList;

public class Customer implements ICustomer{
    protected ArrayList<Offer> offers = null;

    public Customer(){
        offers = new ArrayList<>();
    }

    public ArrayList<Offer> getOffers() {
        ArrayList<Offer> tmpOffers = new ArrayList<>();
        for (Offer offer : offers) {
            tmpOffers.add(offer);
        }
        return tmpOffers;
    }

    public Boolean addOffers(Offer offer) {
        this.offers.add(offer);
        return true;
    }
}
