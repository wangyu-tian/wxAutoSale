package com.wx_auto_sale.wx.repository;

import com.wx_auto_sale.wx.model.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @Author wangyu
 * @Create: 2020/4/10 11:17 下午
 * @Description:
 */
@Repository
public interface OrderRepository extends JpaRepository<OrderEntity,String>, JpaSpecificationExecutor {
}
