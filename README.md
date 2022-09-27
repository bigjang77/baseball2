# Baseball 프로그램 생성



### 테이블 생성
```sql
USE greendb;

CREATE TABLE stadium(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(20),
	created_at TIMESTAMP
);
	
CREATE TABLE team(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(20),
	stadium_Id INT,
	created_at Timestamp
);


CREATE TABLE player(
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(20),
	position VARCHAR(20),
	team_Id INT,
	is_outer BOOLEAN,
	created_at timestamp
);

### 더미데이터 추가
```sql
INSERT INTO stadium(NAME, created_at)
VALUES("사직야구장", NOW());
INSERT INTO stadium(NAME, created_at)
VALUES("잠실야구장", NOW());
INSERT INTO stadium(NAME, created_at)
VALUES("고척야구장", NOW());


INSERT into team(NAME, stadium_id, created_at)
VALUES("롯데","1" ,now());
INSERT into team(NAME, stadium_id, created_at)
VALUES("두산","2" ,now());
INSERT into team(NAME, stadium_id, created_at)
VALUES("키움","3" ,NOW());

INSERT into player(NAME, POSITION,team_id,is_outer,created_at)
VALUES("이대호","1루수","1",0,now());
INSERT into player(NAME, POSITION,team_id,is_outer,created_at)
VALUES("홍길동","외야수","2",0,NOW());
INSERT into player(NAME, POSITION,team_id,is_outer,created_at)
VALUES("장보고","투수","3",0,NOW());
COMMIT;
commit;
```

###TIP

####마이바티스 카멜세팅
```
        org.apache.ibatis.session.Configuration config = new org.apache.ibatis.session.Configuration();
        config.setMapUnderscoreToCamelCase(true);
        sessionFactory.setConfiguration(config);
```
#### 마리아DB 오토커밋 설정해제
