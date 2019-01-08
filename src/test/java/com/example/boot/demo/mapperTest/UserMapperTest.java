package com.example.boot.demo.mapperTest;

import com.example.boot.demo.entity.User;
import com.example.boot.demo.mapper.UserMapper;
import com.example.boot.demo.vo.UserVO;
import org.junit.Assert;
import org.junit.Test;

public class UserMapperTest {

    @Test
    public void singleTest(){
        User user=new User();
        user.setId(999l);
        user.setName("test");

        UserVO userVO=UserMapper.INSTANCE.map(user);
      //  PersonVo personVo = Persion2PersonVoMapper.MAPPER.PersonToPersonVo(person);
        Assert.assertTrue(userVO.getUsername().equals(user.getName()));
        Assert.assertTrue(userVO.getUserId()==(user.getId()));
    }
//    //对象集合映射
//    @Test
//    public void listTest(){
//        Person person=new Person("wayne",12,new Date(),12f);
//        Person person2=new Person("wayne2",13,new Date(new Date().getTime()+3600000),13f);
//        Person person3=new Person("wayne3",14,new Date(new Date().getTime()+7200000),14f);
//        Person person4=new Person("wayne4",15,new Date(new Date().getTime()+9800000),15f);
//        List<Person> list=new ArrayList();
//        list.add(person);
//        list.add(person2);
//        list.add(person3);
//        list.add(person4);
//        List<PersonVo> personVos = Persion2PersonVoMapper.MAPPER.PersonToPersonVos(list);
//        Assert.assertTrue(list.size()==personVos.size());
//    }
}
