package section4;

public class Product {
    private long id;
    private String productName;
    private String supplierName;

    public long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

}
