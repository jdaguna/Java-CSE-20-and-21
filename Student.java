public class Student {
	String name;
	char gender;
	Date birthDay;
	Preference pref;
	Boolean matched;

	public Student(String n, char g, Date bd, Preference p, Boolean m){
		name = n;
		gender = g;
		birthDay = bd;
		pref = p;
		matched = m;
	}

	public void setMatched(Boolean m){
		matched = m;
	}
	public String getName(){
		return name;
	}
	public char getGender(){
		return gender;
	}
	public Date getBirthDay(){
		return birthDay;
	}
	public Preference getPref(){
		return pref;
	}
	public Boolean getMatched(){
		return matched;
	}

	public int compare(Student st){
		int score = 0;

		if(this.getGender() != st.getGender())
			return 0;
		int Preferences = pref.compare(st.getPref());
		int AgeDifference = birthDay.compare(st.getBirthDay());
		
		score = (40 - Preferences) + (60 - AgeDifference);
		return score;
	}	
}
