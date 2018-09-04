package com.yukong.chapter10.entity;

import lombok.*;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * @author: yukong
 * @date: 2018/9/4 14:48
 * @description:
 */
@Data
@ToString
@Accessors(chain = true)
@EqualsAndHashCode
@Document(indexName = "goods", type = "computer")
public class Good {

    /**
     * 主键,注意这个搜索是id类型是string，与我们常用的不同
     * Id注解加上后，在Elasticsearch里相应于该列就是主键了，在查询时就可以直接用主键查询
     */
    @Id
    private String id;

    private String name;

    private String desc;

    private Integer number;

}
