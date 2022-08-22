package service;

import jdk.internal.access.JavaIOFileDescriptorAccess;
import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements  ProductService{
    private static Map<Integer,Product>product;

    static{
        product=new HashMap<>();
        product.put(1,new Product(1,"Bánh Hạt Dẻ",10000,"Bánh nhân hạt dẻ","Ngô Trọng Hiếu"));
        product.put(2,new Product(2,"Bánh Táo đỏ",12000,"Bánh Nhân Táo Đỏ","Ngô Trọng Hiếu"));
        product.put(3,new Product(3,"Bánh Pía",8000,"bánh mía","Ngô Trọng Hiếu"));
        product.put(4,new Product(4,"Bánh Chuối",5000,"chuối tự nhiên","Ngô Trọng Hiếu"));
        product.put(5,new Product(5,"Bánh Kem",150000,"kem tươi","Ngô Trọng Hiếu"));
    };
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(product.values());
    }

    @Override
    public void save(Product product) {
     
    }

    @Override
    public Product findByid(int id) {
        return product.get(id);
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {

    }

    @Override
    public Product findById(int id) {
        return null;
    }
}
