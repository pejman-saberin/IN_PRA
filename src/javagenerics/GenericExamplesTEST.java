package javagenerics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Box;

import  org.junit.Test;



public class GenericExamplesTEST {
	
	 
	@Test
	public  void   betterForCasting(){
		ArrayList <String> list=new ArrayList <String>();
		Map<Integer,ArrayList <String>> aMap=new HashMap<>();
		
		list.add("a string");
		list.add("another string");
		
		String s=(String) list.get(0);	
	}
	
	@Test
	public void boxtestWithoutGeneric()
	{
		ArrayList<BOXwithoutGenericType> boxes=new ArrayList<>();
		BOXwithoutGenericType b=new BOXwithoutGenericType();
		b.setObj("aString");
		BOXwithoutGenericType box2=new BOXwithoutGenericType();
		box2.setObj("Another String");
		
		boxes.add(b);
		boxes.add(box2);
		
		Object p=new Object();
		Object pe=p;
		Integer pejman=new Integer(5);	    
		
	}
	@Test 
	public void BoxtestWithGeneric(){
		ArrayList <BoxWithGeneric<String>> pe=new ArrayList<>();
		
		BoxWithGeneric<String> pstrnig= new BoxWithGeneric<>();
		pstrnig.setObj("pe");
		BoxWithGeneric<Integer> pInteger= new BoxWithGeneric<>();
		pInteger.setObj(5);
		
		pe.add(pstrnig);
		
		
	}
		 

 
		
		 
 

}
