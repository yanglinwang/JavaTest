package test;

public class Circle extends Chart {
	private double radius;

	public Circle() {
		
	}
	
	public double countS() {
		return (3.14 * radius *radius);
	}
	public double countC() {
		return (2 * 3.14 * radius);
	}
	
	public String toString() {
		return("�Ƿ�����䣺" + getFill()+"\n" 
				+"��ɫΪ��" + getPenColor()+"\n"
				+"�뾶Ϊ��" + getRadius()+"\n"
				+"�ܳ�Ϊ��" + countC()+"\n"
				+"���Ϊ��" + countS());
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getRadius() {
		return radius;
	}

//	public int compareTo(Chart a) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
