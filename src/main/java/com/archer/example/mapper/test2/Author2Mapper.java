package com.archer.example.mapper.test2;

import com.archer.example.entity.Author;
import org.apache.ibatis.annotations.Param;

/**
 * Created by archerlj on 2017/4/11.
 */
public interface Author2Mapper {
    Author findAuthorByNickname(@Param("nickname") String nickname);
}
