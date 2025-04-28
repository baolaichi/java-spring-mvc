package vn.hoidanit.laptopshop.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private String image;
    private String detaildesc;
    private String shortDesc;
    private long quantity;
    private long soid;
    private String factory;
    private String target;
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getDetaildesc() {
        return detaildesc;
    }
    public void setDetaildesc(String detaildesc) {
        this.detaildesc = detaildesc;
    }
    public String getShortDesc() {
        return shortDesc;
    }
    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }
    public long getQuantity() {
        return quantity;
    }
    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }
    public long getSoid() {
        return soid;
    }
    public void setSoid(long soid) {
        this.soid = soid;
    }
    public String getFactory() {
        return factory;
    }
    public void setFactory(String factory) {
        this.factory = factory;
    }
    public String getTarget() {
        return target;
    }
    public void setTarget(String target) {
        this.target = target;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", image=" + image + ", detaildesc="
                + detaildesc + ", shortDesc=" + shortDesc + ", quantity=" + quantity + ", soid=" + soid + ", factory="
                + factory + ", target=" + target + ", getId()=" + getId() + ", getName()=" + getName() + ", getPrice()="
                + getPrice() + ", getImage()=" + getImage() + ", getDetaildesc()=" + getDetaildesc()
                + ", getShortDesc()=" + getShortDesc() + ", getClass()=" + getClass() + ", getQuantity()="
                + getQuantity() + ", getSoid()=" + getSoid() + ", getFactory()=" + getFactory() + ", getTarget()="
                + getTarget() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

    
    
}
