# Study Mysql Shard

## 샤딩 이론
https://medium.com/nerd-for-tech/all-about-database-sharding-scaling-up-the-database-3b6172491cd
- 알고리즘/키 기반 샤딩
- 동적 샤딩
- 범위 기반 샤딩
- 엔터티 그룹 기반 샤딩
- 리전별 샤딩 등.. 

## JPA 샤딩 구현
결국에 데이터를 분산해서 저장을 해야함.
Master / Slave 이런 데이터 복사 개념이 아니라 
정말 다른 DB에 같은 스키마로 다른 데이터를 넣어야하는 작업임.

그래서 샤딩을 설계할때, 다른 DB의 데이터가 필요한 일은 가급적 없도록 설계해야함.

A,B 다른 두 DB가 있다할때, 
일단 커넥션 걸어야겠고,
어떤 샤딩을 걸지 코드든 야물이던 설정해야겠고

이것저거 고려할게 많아보인다.

그래서 JPA에 Sharding 섹션이 있나 찾아보면 단 하나도 없다.

알다시피, JPA는 JDBD위에 구현이 되어있고, 연결이나 이런건 다 JDBC가 관리한다.

그래서 JPA에서 샤딩을 구현하려면, JDBC에서 샤딩을 구현해야한다.

와 생각만해도 머리가 아프다.

그래서, ShardingSphere 라는 JDBC 대체 라이브러리가 존재한다.

### ShardingSphere
