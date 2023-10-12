public class Customer {
    private String name;
    private String contactDetails;
    private List<SalesTransaction> purchaseHistory;

    public void addPurchase(SalesTransaction transaction) {
        purchaseHistory.add(transaction);
    }

}
