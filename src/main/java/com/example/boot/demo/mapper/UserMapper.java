package com.example.boot.demo.mapper;

import com.example.boot.demo.entity.User;
import com.example.boot.demo.vo.UserVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface  UserMapper {

   public UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    @Mappings({
    @Mapping(target = "userId", source = "id"),
    @Mapping(target = "username", source = "name")})
      UserVO map(User entity);

      List<UserVO> map(List<User> entity);
}

