package test;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String e1 = "abc";
//      ִ�к���ڳ������д�����һ��ֵΪabc��String���󲢽�ջ�е�����ָ�������еĶ���
 
        String e2 = "abc";
//      �������д���ֵΪabc��String�����ˣ�ֱ�ӽ�ջ�е�����ָ�������еĶ���
 
        String o1 = new String("abc");
//      Class������ʱ���ڳ������д�����һ��ֵΪABC��String����ִ��ʱ���ڶ��ﴴ��new String("ABC")���󲢽�ջ�е�����ָ����еĶ���
  
        String o2 = new String("abc");
//      �������д���ֵΪABC�Ķ���ֱ���ڶ��ﴴ��new String("ABC")���󲢽�ջ�е�����ָ����еĶ���
        
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
