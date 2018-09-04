package com.yukong.chapter10.repository;

import com.yukong.chapter10.Chapter10ApplicationTests;
import com.yukong.chapter10.entity.Good;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;


import static org.junit.Assert.*;



/**
 * @author: yukong
 * @date: 2018/9/4 14:56
 * @description:
 */
@Component
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GoodRepositoryTest extends Chapter10ApplicationTests {

    @Autowired
    private GoodRepository goodRepository;

    @Test
    public void save(){
        Good good = new Good();
        good.setId("100")
                .setName("联想e541")
                .setDesc("联想e系列")
                .setNumber(10);
        Good result = goodRepository.save(good);
        Assert.assertNotNull(result);
    }

    @Test
    public void select(){
        // 需要注意find方法返回的死Optional对象 需要调用get方法返回具体的实体类对象
        Good result = goodRepository.findById("100").get();
        Assert.assertNotNull(result);

    }

    @Test
    public void update(){
        Good result = goodRepository.findById("100").get();
        result.setNumber(300);
        // 更新也是调用save方法
        Good good = goodRepository.save(result);
        Assert.assertNotNull(good);

    }



    @Test
    public void delete(){
        goodRepository.deleteById("100");
    }

    @Test
    public void findByName() {
        String name = "macbook";
        Pageable pageable = new PageRequest(1,1);
        Page<Good> goods = goodRepository.findByName(name, pageable);
        System.out.println(goods.getContent());
        Assert.assertEquals(1, goods.getSize());

    }
}