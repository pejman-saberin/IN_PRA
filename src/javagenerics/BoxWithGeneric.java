package javagenerics;

 /* THIS IS WITHOUT USING GENERIC TYPE

public class BOXwithoutGenericType  {	
	private Object obj;  //with type object you can't do much, you are just declaring that obj is an object here
	
	public Object getObj() {
		return obj;	}
	
	public void setObj(Object obj) {
		this.obj = obj;	}
	
	public BOXwithoutGenericType() {}
}
*/

/* THIS IS WITH USING GENERIC TYPE*/
public class BoxWithGeneric <T>{  //you can use any letters you want for generic type. But the conventions are written in Oran
	//now replace your type with T . Now T can accept any object.
	private T obj;
	
	
	public T getObj() {
		return obj;
	}


	public void setObj(T obj) {
		this.obj = obj;
	}


	public BoxWithGeneric() {
		 
	}

}
