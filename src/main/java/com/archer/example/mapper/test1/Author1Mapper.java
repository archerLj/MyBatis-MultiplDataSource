package com.archer.example.mapper.test1;

import com.archer.example.entity.Author;
import org.apache.ibatis.annotations.Param;

/**
 * Created by archerlj on 2017/4/11.
 */
public interface Author1Mapper {
    Author findAuthorByUsername(@Param("username") String username);
}
