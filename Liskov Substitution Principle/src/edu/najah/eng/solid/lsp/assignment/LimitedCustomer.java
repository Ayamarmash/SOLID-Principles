package edu.najah.eng.solid.lsp.assignment;

public class LimitedCustomer extends Customer{

    private static final int MAX_ALLOWED_OFFER = 3;

    public Boolean addOffers(Offer offer) {
        if (isReachedMaxAllowedOffers()){
            return false;
        }
        return super.addOffers(offer);
    }

    private boolean isReachedMaxAllowedOffers() {
        return this.offers.size() >= MAX_ALLOWED_OFFER;
    }

}
