package com.cos.jwt.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.jwt.domain.team.Team;
import com.cos.jwt.domain.team.TeamRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class TeamController {

	private final TeamRepository teamRepository;
	
	@PostMapping("/joinProc2")
	public String 회원가입(@RequestBody Team team) {
		teamRepository.save(team);
		return "ok";
	}
}
