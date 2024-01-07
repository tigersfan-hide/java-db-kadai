package kadai_007;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Posts_Chapter07 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Connection con = null;
		PreparedStatement statement = null;
		
		String[][] postList= {
				{"1003", "2023-02-08", "昨日の夜は徹夜でした・・","13"},
				{"1002", "2023-02-08", "お疲れ様です！"	,"12"},
				{"1003", "2023-02-09", "今日も頑張ります！", "18"},
				{"1001", "2023-02-09", "無理は禁物ですよ！", "17"},
				{"1002", "2023-02-10", "明日から連休ですね！", "20"}
		};
		try {
			con =DriverManager.getConnection(
					"jdbc:mysql://localhost/challenge_java",
					"root",
					"qL2&R6#PVN"
					);
			System.out.println("データベース接続成功:jdbc:mysql://localhost/challenge_java");
			//レコードの追加
			String sql1 ="INSERT INTO posts (user_id, posted_at, post_content, likes) VALUES ( ?, ?, ?, ?);";
			statement = con.prepareStatement(sql1);
			int rowCnt =0;
			System.out.println("レコード追加を実行します");
			for(int i=0; i<postList.length; i++) {
				statement.setString(1, postList[i][0]);
				statement.setString(2, postList[i][1]);
				statement.setString(3, postList[i][2]);
				statement.setString(4, postList[i][3]);
				rowCnt =statement.executeUpdate();
			}
			System.out.println( postList.length + "件のレコードが追加されました");
			//レコードを検索
			System.out.println("ユーザーIDが1002のレコードを検索しました");
			String sql2 ="SELECT * FROM posts WHERE user_id=1002;";
			ResultSet result = statement.executeQuery(sql2);
			while(result.next()) {
				Date postedAt = result.getDate("posted_at");
				String post_content = result.getString("post_content");
				int likes = result.getInt("likes");
				System.out.println(result.getRow()+"件目：投稿日時="+postedAt+"／投稿内容="+post_content+"／いいね数＝"+likes);
			}
		} catch(SQLException e) {
			System.out.println("エラー発生:"+e.getMessage());
		} finally {
			if(statement != null) {
				try {statement.close();} catch(SQLException ignore) {}
			} 
			if(con != null) {
				try {statement.close();} catch(SQLException ignore) {}
			}
		}
	}

}