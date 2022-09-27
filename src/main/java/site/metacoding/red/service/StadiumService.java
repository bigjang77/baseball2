package site.metacoding.red.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.red.domain.stadium.Stadium;
import site.metacoding.red.domain.stadium.StadiumDao;
import site.metacoding.red.web.dto.stadium.StadiumInsertReqDto;

//서비스는 Dao를 조합하고, 트렌젝션을 관리한다

@RequiredArgsConstructor
@Service // IoC 등록
public class StadiumService {

	// DI
	private final StadiumDao stadiumDao;

	public void 경기장삭제(Integer id) {
		stadiumDao.deleteById(id);
	}

	public List<Stadium> 목록보기() {
		return stadiumDao.findAll();
	}

	// Controller는 DTO로 받고, DAO는 Entity로 남기자.(Insert, Update)
	public void 경기장등록(StadiumInsertReqDto stadiumInsertReqDto) {
		stadiumDao.insert(stadiumInsertReqDto.toEntity());
	}
}
