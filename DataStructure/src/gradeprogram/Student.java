package gradeprogram;

public class Student {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public boolean overAvg() {
		int avg = (kor + eng + math) / 3;
		
		if (avg > 50)
			return true;
		else
			return false;
	}
	
	public int Avg() {
		int avg = (kor + eng + math ) / 3;
		
		return avg;
	}
	
	public void printAll() {
		System.out.printf("이름 = %s, 국어 = %d, 영어 = %d, 수학 = %d, 평균 점수 = %d%n"
				,name
				,kor
				,eng
				,math
				,this.Avg());
	}
}
