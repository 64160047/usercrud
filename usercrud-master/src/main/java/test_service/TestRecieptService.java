/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_service;

import com.werapan.databaseproject.dao.ProductDao;
import com.werapan.databaseproject.dao.RecieptDao;
import com.werapan.databaseproject.model.Product;
import com.werapan.databaseproject.model.Reciept;
import com.werapan.databaseproject.model.RecieptDetail;
import com.werapan.databaseproject.service.RecieptService;
import java.util.List;

/**
 *
 * @author minnie
 */
public class TestRecieptService {
   public static void main(String[] args) {
//        RecieptService rs = new RecieptService();
//        for (Reciept test : rs.getReciepts()) {
//            System.out.println(test);
//        }
//        System.out.println(rs.getById(1));
//        Reciept r1 = new Reciept( 1000, 10, 1);
//        ProductDao pd = new ProductDao();
//        List<Product> products = pd.getAll();
//        Product product0 = products.get(0);
//        Product product1 = products.get(1);
//        
//        RecieptDetail newRecieptDetail = new RecieptDetail(product0.getId(), product0.getName(), product0.getPrice(), 1, product0.getPrice() * 1, -1);
//        r1.addRecieptDetail(newRecieptDetail);
//
//        RecieptDetail newRecieptDetail1 = new RecieptDetail(product1.getId(), product1.getName(), product1.getPrice(), 2, product1.getPrice() * 2, -1);
//        r1.addRecieptDetail(newRecieptDetail1);
//        System.out.println(r1);
//        
//        
//        
//        rs.addNew(r1);
//        for (Reciept test : rs.getReciepts()) {
//            System.out.println(test);
//        }
          RecieptDao rd = new RecieptDao();
          System.out.println(rd.get(1));
    }


}



    

