import java.sql.ResultSet;
import java.sql.Statement;
import java.util.TreeMap;

import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	
	public TreeMap<Skill,lnteger> skillCount(){
		
		Skill skill =null;
		ConnectionManager con = new ConnectionManager();
		Statement st= con.getConnection().createStatement();
		String sql = "SELECT  S.NAME,COUNT(SKILL) FROM SKILL S, PLAYER Y WHERE S.ID = P.SKILLID ORDER BY NAME DESC";
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			String skillname = rs.getString("NAME");
			long count =rs.getLong("COUNt");
			skill=new Skill(count,skillname);
		}
		return skill;
	}
}
