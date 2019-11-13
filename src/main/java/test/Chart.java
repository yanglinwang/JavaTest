package test;

public abstract class Chart implements Comparable {
	private String penColor;
	private boolean fill;
	public abstract double countS();
	public abstract double countC();
	
	public int compareTo(Chart a) {
		int flag = 0;
		if(this.countS() > a.countS()) {
			flag=1;
		}
		else if(this.countS() == a.countS()) {
			flag=0;
		}
		else if(this.countS() < a.countS()) {
			flag=-1;
		}
		return flag;
	}
	
	public Chart(String penColor,boolean fill) {
		this.penColor = penColor;
		this.fill = fill;
	}
	public Chart() {
		this("red",true);
	}
	
	public void setPenColor(String penColor) {
		this.penColor = penColor;
	}
	public String getPenColor() {
		return penColor;
	}
	
	public void setFill(boolean fill) {
		this.fill = fill;
	}
	public boolean getFill() {
		return fill;
	}
}
