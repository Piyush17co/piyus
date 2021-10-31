abstract class Marks{
	abstract void getpercentage();
}
class StudentA extends Marks{
	int s1,s2,s3;
	public StudentA(int a,int b,int c) {
		// TODO Auto-generated constructor stub
		s1=a; s2=b; s3=c;	
	}
	@Override
	void getpercentage() {
		// TODO Auto-generated method stub
		int sum;
		sum=s1+s2+s3;
		double per_tage;
		per_tage=sum/3.0;
		System.out.println("The percentage of student A is:"+per_tage+"%");	
	}
}
class StudentB extends Marks{
	int s1,s2,s3,s4;
	public StudentB(int a,int b,int c,int d) {
		// TODO Auto-generated constructor stub
		s1=a; s2=b; s3=c; s4=d;
	}
	@Override
	void getpercentage() {
		// TODO Auto-generated method stub
		int sum;
		double per_tage;
		sum=s1+s2+s3+s4;
		per_tage=sum/4.0;
		System.out.println("The percentage of student b is:"+per_tage+"%");	
	}
}
public class AbstractClassMarksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentA a=new StudentA(80,98,95);
		StudentB b=new StudentB(90,97,90,85);
		a.getpercentage();
		b.getpercentage();

	}

}
