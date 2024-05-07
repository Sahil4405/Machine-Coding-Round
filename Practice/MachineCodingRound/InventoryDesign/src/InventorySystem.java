import java.util.Map;

public class InventorySystem {
    private Map<String, Product> productMap;
    private Map<Location, Unit> locationUnitMap;

    public InventorySystem(Map<String, Product> productMap, Map<Location, Unit> locationUnitMap) {
        this.productMap = productMap;
        this.locationUnitMap = locationUnitMap;
    }

    public void addProduct(Product product){
        productMap.put(product.getProductId(), product);
    }

    public void getProduct(String productId){
        productMap.get(productId);
    }


}
