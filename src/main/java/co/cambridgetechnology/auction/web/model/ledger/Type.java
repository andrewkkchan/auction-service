package co.cambridgetechnology.auction.web.model.ledger;


import co.cambridgetechnology.auction.web.entity.TransactionEvent;

/**
 * Type of {@link TransactionEvent} allowed for the Ledger to process
 */
public enum Type {
    BACK_UP("back-up"),
    OFFER("offer"),
    BID("bid"),
    ACCEPTANCE("acceptance")
    ;


    private final String text;

    Type(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
