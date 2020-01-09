package section4;

public class Product1 {
    private long id;
    private String productName;
    private String supplierName;

    public Product1() {

    }

    public Product1(long id, String productName, String supplierName) {
        this.id = id;
        this.productName = productName;
        this.supplierName = supplierName;

    }

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

    public void display() {
        System.out.println("Product Id is " + getId());
        System.out.println("Product Name is " + getProductName());
        System.out.println("Supplier Name is " + getSupplierName());
    }

}
