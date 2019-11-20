package com.imooc.product.client;

import com.imooc.product.common.DecreaseStockInput;
import com.imooc.product.common.ProductInfoOutput;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

//@FeignClient(value = "product",fallback = ProductClient.ProductClientFallback.class)
@FeignClient(value = "product")

public interface ProductClient {

    @PostMapping("/product/listForOrder")
    public List<ProductInfoOutput> listForOrder(@RequestBody List<String> productIdList);
    @PostMapping("/product/decreaseStock")
    public void decreaseStock (@RequestBody List<DecreaseStockInput> decreaseStockInputList);
//
//    @Component
//    static class ProductClientFallback implements ProductClient{
//
//        @Override
//        public List<ProductInfoOutput> listForOrder(List<String> productIdList) {
//            return null;
//        }
//
//        @Override
//        public void decreaseStock(List<DecreaseStockInput> decreaseStockInputList) {
//
//        }
//    }
}
