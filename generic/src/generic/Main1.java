package generic;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

	public static void main(String[] args) {
		Generic first = new Generic();
		List<Integer> numList=new ArrayList<Integer>();
		numList.add(1);
		numList.add(2);
		first.printinfo(numList);
		
		List<String> strList=new ArrayList<String>();
		strList.add("Praveen");
		strList.add("Sandeep");
		
		first.printinfo(strList);
		
		List<Boolean> boolList=new ArrayList<Boolean>();
		boolList.add(true);
		boolList.add(false);
		first.printinfo(boolList);

	}

}
