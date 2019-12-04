package co.cambridgetechnology.auction.web.model.ledger;


import co.cambridgetechnology.auction.web.entity.TransactionEvent;

/**
 * Type of {@link TransactionEvent} allowed for the Ledger to process
 */
public enum Type {
    P2P("p2p"),
    CREATE_ACCOUNT("create-account"),
    TOP_UP("top-up"),
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
