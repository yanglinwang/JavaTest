package test;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import text.Son;

//֤��һ��Դ�ļ��п����ж��class����ֻ����һ��public class������ԭ��δ�⡣�������Է��ַ�public�಻��
//���κ�Ȩ�����η�����
public class A {
	private int int9 = 5;
	public class C{
		public int a;
		private char c = 'a';
		public int i;
		public void testC() {
			testB();
			System.out.println(c);
			System.out.println(int9);
			System.out.println(i);
		}
		public void testB() {
			System.out.println(c);
			System.out.println(int9);
			System.out.println(i);
		}
		public char getC() {
			return c;
		}
		public void setC(char c) {
			this.c = c;
		}
	}
	public void test() {
//		this.int9 = 7;
		System.out.println(int9);
//		System.out.println(i);�����ڲ���private����
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A a =new A();
////		a.test();		
//		C c = a.new C();
//		c.setC('b');
//		c.testC();
		
//		System.out.println(args.length);
//		for(String arg:args) {
//			System.out.println(arg);
//		}
		
//		Scanner sc = new Scanner(System.in);
//		while(sc.hasNext()) {
//			System.out.println(sc.next());
//		}
		
		
	}

}

class B {
	public class C{
		private char c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
