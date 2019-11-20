package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by sun
 * 2018-12-10 16:12
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
    List<OrderDetail> findByOrderId(String orderId);
}
