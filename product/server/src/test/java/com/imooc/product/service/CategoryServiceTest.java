package com.imooc.product.service;

import com.imooc.product.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CategoryServiceTest {
    @Autowired
    CategoryService categoryService;
    @Test
    public void findByCategoryTypeIn() throws Exception {
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(11,22));
        Assert.assertTrue(list.size()>0);
    }

}