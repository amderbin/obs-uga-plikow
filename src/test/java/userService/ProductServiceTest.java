package userService;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceTest {
    @Test

    public void testGetAllProduct(){

        // is
        List<Product> products = new ArrayList<Product>();
        products.add(new Cloth(1L,"Bluzka", 34.5, "Biały", 0.9, 4,"XS","Bawełna"));
        products.add(new Cloth(5L, "Stanik", 67.5, "Czarny", 0.2, 2, "75B", "Satyna"));

        // then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        List<Product> productsFromTestClass = productService.getAllProducts();

        // expect
        Assert.assertEquals(products,productsFromTestClass);
    }

    @Test

    public void testGetProductCount(){

        // is
        List<Product> products = new ArrayList<Product>();
        products.add(new Cloth(1L,"Bluzka", 34.5, "Biały", 0.9, 4,"XS","Bawełna"));

        // then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        int result = productService.getProductCount();

        // expect
        Assert.assertEquals(1,result);
    }

    @Test

    public void testGetProductName(){

        // is
        List<Product> products = new ArrayList<Product>();
        Product cloth = new Cloth(1L,"Bluzka", 34.5, "Biały", 0.9, 4,"XS","Bawełna");
        products.add(cloth);

        // then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        String result = productService.getProductName("Bluzka");

        // expect
        Assert.assertEquals("Bluzka", result);
    }

    @Test

    public void testIsProductBiggerThanZero(){

        // is
        List<Product> products = new ArrayList<Product>();
        products.add(new Cloth(1L,"Bluzka", 34.5, "Biały", 0.9, 4,"XS","Bawełna"));

        // then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        boolean isProductbigger = productService.isProductBiggerThanZero("Bluzka");

        // expect
        Assert.assertTrue(isProductbigger);
    }
    @Test

    public void testIsProductExist(){

        // is
        List<Product> products = new ArrayList<Product>();
        products.add(new Cloth(1L,"Bluzka", 34.5, "Biały", 0.9, 4,"XS","Bawełna"));

        // then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        boolean isProductExist = productService.isProductExist("Bluzka");

        // expect
        Assert.assertTrue(isProductExist);
    }

    @Test

    public void testIsProductIdExist(){

        // is
        List<Product> products = new ArrayList<Product>();
        products.add(new Cloth(1L,"Bluzka", 34.5, "Biały", 0.9, 4,"XS","Bawełna"));

        // then
        ProductServiceImpl productService = new ProductServiceImpl(products);
        boolean isProductIdExist = productService.isProductIdExist(1l);

        //expect
        Assert.assertTrue(isProductIdExist);
    }

}

