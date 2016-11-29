package testJava_seven;

public class TestJava7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=100,b=7;
		char oper='/';
		switch(oper){
		case'+':       //case 后面只能跟常量或者字符
			System.out.println(a+"+"+b+"="+(a+b));
			break;
		case'-':
			System.out.println(a+"-"+b+"="+(a-b));
			break;
		case'*':
			System.out.println(a+"*"+b+"="+(a*b));
			break;
		case'/':
			System.out.println(a+"/"+b+"="+(a/b));
			break;
		default:
			System.out.println("未知的操作！");	
		}
	}

}
