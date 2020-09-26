package model;
public class Skill {
	private Long skillId;
	private String skillName;
	
	public Skill(Long skillId,String skillName) {
		super();
		this.skillId = skillId;
		this.skillName = skillName;
	}
	public Long getSkillld() {
		return skillId;
	}
	public void setSkillld(Long skillld) {
		this.skillId = skillld;
	}
	public String getSkillName() {
		return skillName;
	}
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}
}