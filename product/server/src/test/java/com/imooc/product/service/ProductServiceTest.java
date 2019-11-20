package com.imooc.product.service;

import com.imooc.product.common.DecreaseStockInput;
import com.imooc.product.common.ProductInfoOutput;
import com.imooc.product.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ProductServiceTest {
    @Autowired
    private ProductService productService;
    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> list = productService.findUpAll();
        Assert.assertTrue(list.size()>0);
    }

    @Test
    public void findLIst()throws  Exception{
        List<ProductInfoOutput> list = productService.findByProductIdIn(Arrays.asList("157875196366160022","157875227953464068"));
        Assert.assertTrue(list.size()>0);
    }

    @Test
    public void decreaseStock() throws Exception{

        DecreaseStockInput decreaseStockInput = new DecreaseStockInput("164103465734242707",2);
        productService.decreaseStock(Arrays.asList(decreaseStockInput));

    }

}