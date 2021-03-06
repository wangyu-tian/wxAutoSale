package com.wx_auto_sale.wx.model.entity;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * @Author wangyu
 * @Create: 2020/4/10 12:25 下午
 * @Description:
 */

@Table(name = "discount")
@Entity
@Data
public class DiscountEntity {

    @Id
    @GeneratedValue(generator = "idGenerator")
    @GenericGenerator(name="idGenerator", strategy="uuid")
    private String id;
    //折扣类型1：满m元减n元；2：满m个送n个；3：折扣m折限购n个；4：满m元送n元优惠券;5:满m元送n折优惠券
    private String type;
    //未知变量m
    private String m;
    //未知变量n
    private String n;
    private String valid;
    //优惠券使用变量c_m
    private String cm;
    //优惠券使用折扣比例p
    private String cp;
    //优惠券类型1:满c_m可减c_n;2:无门槛减c_n;3:无门槛c_p折优惠券
    private String cType;

    //1显示折扣价。0为不显示折扣价
    private String showDiscount;

    private String memo;
    @CreatedDate
    private Date createDate;

}