package Practice;

public class add {

	public static void main(String[] args) {
		add  ab=new add();
	System.out.println(ab.a());
	ab.ac(10,20);
	ab.ad("abhbcdbj","cdcnnjjfrhjfhrh");
	System.out.println(ab.c());
	System.out.println(ab.m());
		
	}
	int a () {
		int a=10;
		int b = 0;
		int c=a+b;
		return c;
		
	}
	void ac (int a,int b) {
		int c =a+b;
		System.out.println(c);
		
	}
	void ad (String a ,String b) {
	System.out.println(a);
		
		
	}
double c() {
	double a =23.3;
	double b =25.5;
	double c=a+b;
	
	return c;
	
	
}
int m() {
	int a =0;
	int b =2;
	int c =b-a;
	return(c);
}

}
