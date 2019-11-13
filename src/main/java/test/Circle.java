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
		return("是否有填充：" + getFill()+"\n" 
				+"颜色为：" + getPenColor()+"\n"
				+"半径为：" + getRadius()+"\n"
				+"周长为：" + countC()+"\n"
				+"面积为：" + countS());
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
