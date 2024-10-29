package testpm.test_20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Member_DAO {
	private String username = "system"; // 오라클 사용자 이름
	private String password = "11111111"; // 오라클 사용자 비밀번호
	private String url = "jdbc:oracle:thin:@localhost:1521:orcl"; // 오라클 접속을 위한 주소(포트번호)
	private String driverName = "oracle.jdbc.driver.OracleDriver"; // 오라클 접속을 위한 드라이버
	private Connection conn = null; // 오라클과 연결을 위한 자원(CRUD를 위해 획득/반환 한다.)
	public static Member_DAO mDAO = null;
	private Member_DAO() {
		init();
	}
	public static Member_DAO getInstance() {
		if(mDAO == null) {
			mDAO = new Member_DAO();
		}
		return mDAO;
	}
	private void init() {
		try {
			Class.forName(driverName);
			System.out.println("오라클 드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private boolean conn() {
		try {
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("커넥션 자원을 흭득하였습니다.");
			return true;	// 커넥션 자원을 정상적으로 획득 할 시
		} catch (SQLException e) {
			e.printStackTrace();
		} return false;
	}
	public void insert(Member_DTO mDTO) {
		if(conn()) {
			try {
				String sql = "insert into member values (?, ?, ?, ?, ?)";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, mDTO.getId());
				pstmt.setString(2, mDTO.getName());
				pstmt.setString(3, mDTO.getAddr());
				pstmt.setInt(4, mDTO.getAge());
				pstmt.setInt(5, mDTO.getPoint());
				int resultInt = pstmt.executeUpdate();
				if(resultInt > 0) {
					System.out.println("쿼리문이 정상적으로 입력되었습니다.");
					conn.commit();
				} else {
					conn.rollback();
				}
			} catch (Exception e) {
			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		} else {
			System.out.println("데이터 커넥션 실패");
		}
	}
}
