package src;

public class Main {
    public static void main(String[] args) throws Exception {
        StoreOneA store = new StoreOneA(true, 100000, 12, true);
        store.enterStoreDetails();
        store.showStoreInfo();
    }
}
