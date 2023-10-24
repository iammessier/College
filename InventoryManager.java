public class InventoryManager {
    private List<ElectronicItem> inventory;

    public void addItem(ElectronicItem item) {
        inventory.add(item);
    }

    public void updateItem(ElectronicItem item) {
        //
    }

    public void removeItem(ElectronicItem item) {
        inventory.remove(item);
    }

    public void setLowStockAlert(ElectronicItem item, int threshold) {
        //
    }
}
