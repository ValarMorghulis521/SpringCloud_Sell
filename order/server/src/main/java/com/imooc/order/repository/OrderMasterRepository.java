package com.imooc.order.repository;

import com.imooc.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by sun
 * 2018-12-10 16:11
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}
