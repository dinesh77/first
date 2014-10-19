package generic;

import java.util.List;

/**
 * It provides compile time safety
 * It reduces the risk of ClassCastExceptioin
 * @author Sandy
 *
 */
public class Generic {
	
	public <S> void printinfo(List<S> numList){
		for(S num:numList){
			System.out.println(num);
		}
	}
	
	public  <T extends Object> T returnSomething(Class<T> t){
		return t.cast(null);  
	}
}
