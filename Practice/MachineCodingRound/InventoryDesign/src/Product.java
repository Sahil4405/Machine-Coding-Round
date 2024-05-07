public class Product {
    private String productId;
    private String productName;
    private String descriptipn;

    public Product(String productId, String productName, String descriptipn) {
        this.productId = productId;
        this.productName = productName;
        this.descriptipn = descriptipn;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescriptipn() {
        return descriptipn;
    }

    public void setDescriptipn(String descriptipn) {
        this.descriptipn = descriptipn;
    }
}
