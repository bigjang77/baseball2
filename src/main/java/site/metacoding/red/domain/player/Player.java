package site.metacoding.red.domain.player;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Player {
	private Integer id;
	private String name;
	private Integer teamId;
	private String position;
	private boolean isOuter;
	private Timestamp createdAt;
	
	//엔티티가 아닌 필드(Transient)메모리에서만 노는값
	private Integer no;
	private String teamName;
}
