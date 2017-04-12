package com.archer.example.web;

import com.archer.example.entity.Author;
import com.archer.example.mapper.test1.Author1Mapper;
import com.archer.example.mapper.test2.Author2Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by archerlj on 2017/4/11.
 */
@RestController
public class AuthorController {

    @Autowired
    private Author1Mapper author1Mapper;

    @Autowired
    private Author2Mapper author2Mapper;


    @RequestMapping(value = "/api/getUserByUsername", method = RequestMethod.GET)
    public Author getAuthorByUsername(@RequestParam("username") String username) {
        return author1Mapper.findAuthorByUsername(username);
    }

    @RequestMapping(value = "/api/getUserByNickname", method = RequestMethod.GET)
    public Author getAuthorByNickname(@RequestParam("nickname") String nickname) {
        System.out.println(author2Mapper.findAuthorByNickname(nickname));
        return author2Mapper.findAuthorByNickname(nickname);
    }
}
