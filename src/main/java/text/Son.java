package text;

public class Son extends Father {
	private int a = 2;
	private String s = "ÎÒÊÇ¶ù×Ó";
	public void Baba() {
		System.out.println("woshi baba de erzi");
	}
	public void erzi() {
		System.out.println("erzi");
	}
//	public static int bama() {
//		return 5;
//	}
	public static void Bab() {
		System.out.println("sos");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Son();
		Son s = (Son)f;
		System.out.println(f.a);
		System.out.println(f.s);
		f.Baba();
		((Son) f).erzi();
		f.Bab();
		Son.Bab();
		System.out.println(s.a);
		System.out.println(s.s);
		s.Baba();
		s.erzi();
	}

}
