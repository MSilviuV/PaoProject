
public class Student {
	private String name = "";
	private String email = "";
	private String pass = "";
	int mathGrade;
	int englishGrade;
	int computerScienceGrade;
	int chemestryGrade;
	int historyGrade;
	float average;

	public Student(String name, String email, String pass, int mathGrade, int englishGrade, int computerScienceGrade,
			int chemestryGrade, int historyGrade) {
		super();
		this.name = name;
		this.email = email;
		this.pass = pass;
		this.mathGrade = mathGrade;
		this.englishGrade = englishGrade;
		this.computerScienceGrade = computerScienceGrade;
		this.chemestryGrade = chemestryGrade;
		this.historyGrade = historyGrade;
		this.average = (float) (mathGrade + englishGrade + computerScienceGrade + chemestryGrade + historyGrade) / 5;
	}

	public String getEmail() {
		return email;
	}

	public String getPass() {
		return pass;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Welcome <b>" + name + "</b>!<br>Your grades:<br>Mathematics: " + mathGrade + "<br>English: " + englishGrade
				+ "<br>Computer science: " + computerScienceGrade + "<br>Chemestry: " + chemestryGrade + "<br>History: "
				+ historyGrade + "<br>Average: " + average;
	}

}
