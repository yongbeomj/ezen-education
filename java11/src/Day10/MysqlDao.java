package Day10;

public class MysqlDao implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("Mysql에서 DB 검색");
	}

	@Override
	public void insert() {
		System.out.println("Mysql에서 DB 삽입");		
	}

	@Override
	public void update() {
		System.out.println("Mysql에서 DB 수정");		
	}

	@Override
	public void delete() {
		System.out.println("Mysql에서 DB 삭제");		
	}
	
}
