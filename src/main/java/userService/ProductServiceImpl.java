package userService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {


    List<Product> products;

    public ProductServiceImpl(){
        products = new ArrayList<Product>();
    }

    public ProductServiceImpl(List<Product> products){
        this.products = products;
    }

    public List<Product> getAllProducts() {
        return products;
    }


    public Integer getProductCount() {
        return products.size();
    }


    public String getProductName(String productName) {
        for (Product product : products) {
            if (product.getProductName().equals(productName)) {
                return productName;
            }
        }
        return null;
    }


    public boolean isProductBiggerThanZero(String productName) {
        for (Product product : products){
            if(isProductExist(productName) && product.getProductCount() > 0){
                return true;
            }
        }
    return false;
    }

    public boolean isProductExist(String productName) {
        for (Product product : products) {
            if (product.getProductName().equals(productName)) {
                return true;
            }
        }
        return false;
    }

    public boolean isProductIdExist(Long productId) {
        for(Product product : products){
            if(product.getId().equals(productId)){
                return true;
            }
        }
        return false;
    }
}
