package site.metacoding.red.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.player.Player;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.domain.team.Team;
import site.metacoding.red.service.PlayerService;
import site.metacoding.red.service.TeamService;
import site.metacoding.red.web.dto.CMRespDto;
import site.metacoding.red.web.dto.player.PlayerInsertReqDto;

@RequiredArgsConstructor
@Controller
public class PlayerController {

	private final PlayerService playerService;
	private final TeamService teamService;
	
	@DeleteMapping("/player/{id}")
	public @ResponseBody CMRespDto<?>delete(@PathVariable Integer id){
		playerService.선수삭제(id);
		return new CMRespDto<>(1, "선수삭제완료", null);
	}
	
	
	
	@GetMapping("/player")
	public String list(Model model) {
		List<Player> playerList = playerService.목록보기();
		model.addAttribute("playerList", playerList);
		return "/player/list";
	}

	@GetMapping("/playerForm")
	public String playerForm(Model model) {
		List<Team> teamList = teamService.목록보기();
		model.addAttribute("teamList", teamList);
		return "/player/saveForm";
	}
	
	@PostMapping("/player")
	public @ResponseBody CMRespDto<?>insert(@RequestBody PlayerInsertReqDto playerInsertReqDto){
		playerService.선수등록(playerInsertReqDto);
		return new CMRespDto<>(1,"선수등록완료",null);
	}
}
