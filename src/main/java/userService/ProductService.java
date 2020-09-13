package userService;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();
    Integer getProductCount();
    String getProductName(String productName);
    boolean isProductBiggerThanZero(String productName);
    boolean isProductExist(String productName);
    boolean isProductIdExist(Long productId);
}
