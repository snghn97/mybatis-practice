package com.example.mybatistest.controller;

import com.example.mybatistest.domain.Member;
import com.example.mybatistest.mapper.MemberMapper;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberRestController {

	private final MemberMapper memberMapper;

	@PostMapping("/add")
	public void save(@RequestBody Member member) {
		memberMapper.save(member);
	}

	@GetMapping("/{id}")
	public Member findById(@PathVariable("id") Long id) {
		log.info("member id={}", id);
		return memberMapper.findById(id).get();
	}

	@GetMapping
	public List<Member> findAll() {
		return memberMapper.findAll();
	}

}
