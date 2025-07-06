package com.example.mybatistest.mapper;

import com.example.mybatistest.domain.Member;
import java.util.List;
import java.util.Optional;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberMapper {

	void save(Member member);

	Optional<Member> findById(@Param("id") Long id);

	List<Member> findAll();

}
