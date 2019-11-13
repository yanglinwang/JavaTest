package test;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String e1 = "abc";
//      执行后就在常量池中创建了一个值为abc的String对象并将栈中的引用指向常量池中的对象
 
        String e2 = "abc";
//      常量池中存在值为abc的String对象了，直接将栈中的引用指向常量池中的对象
 
        String o1 = new String("abc");
//      Class被加载时就在常量池中创建了一个值为ABC的String对象，执行时会在堆里创建new String("ABC")对象并将栈中的引用指向堆中的对象
  
        String o2 = new String("abc");
//      常量池中存在值为ABC的对象，直接在堆里创建new String("ABC")对象并将栈中的引用指向堆中的对象
        
        System.out.println(e1 == e2);
        System.out.println(e1 == o1);
        System.out.println(e1 == o2);
        System.out.println(e2 == o1);
        System.out.println(e2 == o2);
        System.out.println(o1 == o2);
        System.out.println("e1.equals(e2):"+e1.equals(e2));
        System.out.println("e1.equals(o1:"+e1.equals(o1));
        System.out.println("e1.equals(o2:"+e1.equals(o2));
        System.out.println("e2.equals(o1:"+e2.equals(o1));
        System.out.println("e2.equals(o2:"+e2.equals(o2));
        System.out.println("o1.equals(o2:"+o2.equals(o2));
	}

}
