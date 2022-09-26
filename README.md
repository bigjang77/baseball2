# Baseball 프로그램 생성



### 테이블 생성
```sql
USE greendb;

CREATE TABLE stadium(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(20),
	createdAt TIMESTAMP
);
	
CREATE TABLE team(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(20),
	stadium_Id INT,
	createdAt Timestamp
);


CREATE TABLE player(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(20),
	position VARCHAR(20),
	team_Id INT,
	isouter BOOLEAN,
	createdAt timestamp
);

### 더미데이터 추가
```sql
INSERT INTO stadium(NAME, createdAt)
VALUES("사직야구장", NOW());
INSERT INTO stadium(NAME, createdAt)
VALUES("잠실야구장", NOW());
INSERT INTO stadium(NAME, createdAt)
VALUES("고척야구장", NOW());

INSERT into team(NAME, stadium_id, createdAt)
VALUES("롯데","1" ,now());
INSERT into team(NAME, stadium_id, createdAt)
VALUES("두산","2" ,now());
INSERT into team(NAME, stadium_id, createdAt)
VALUES("키움","3" ,NOW());

INSERT into player(NAME, POSITION,team_id,isouter,createdAt)
VALUES("이대호","1루수","1",0,now());
INSERT into player(NAME, POSITION,team_id,isouter,createdAt)
VALUES("홍길동","외야수","2",0,NOW());
INSERT into player(NAME, POSITION,team_id,isouter,createdAt)
VALUES("장보고","투수","3",0,now());
commit;
```