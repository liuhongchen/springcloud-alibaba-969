package entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * ClassName:Product
 * Package:entity
 * Description:
 *
 * @date: 2021-04-02 09:45
 * @author:Hansing liuhongchengege123@gmail.com
 */

//商品
@Entity(name = "shop_product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pid;//主键

    private String pname;//商品名称 private Double pprice;//商品价格 private Integer stock;//库存

    private Double pprice;//商品价格
    private Integer stock;//库存


}