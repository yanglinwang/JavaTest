package test;

import java.util.ArrayList;
import java.util.List;

/*
 * Java¶ÑÒç³ö
 */
public class HeapOOM {
	static class OOMObject{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<OOMObject> list = new ArrayList<OOMObject>();
		while(true) {
			list.add(new OOMObject());
		}
	}

}
