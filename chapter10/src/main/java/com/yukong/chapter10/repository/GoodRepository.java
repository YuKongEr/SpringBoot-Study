package com.yukong.chapter10.repository;

import com.yukong.chapter10.entity.Good;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author: yukong
 * @date: 2018/9/4 14:53
 * @description:
 */
public interface GoodRepository extends ElasticsearchRepository<Good, String> {

    /**
     * 根据商品名称查询 分页
     * @param name
     * @param pageable
     * @return
     */
    Page<Good> findByName(String name, Pageable pageable);

}
