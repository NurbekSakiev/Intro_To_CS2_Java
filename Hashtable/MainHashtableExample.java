import java.util.Hashtable;


class MainHashtableExample
{
  public static void main(String[] args)
  {
    /* 
	   Hashtable is a predefined Java class which maps keys to values. 
	   In any one Hashtable object, every key is associated with at most 
	   one value. Given a Hashtable and a key, the associated 
	   element can be looked up. Any non-null object can be used 
	   as a key and as a value.

	   Every key is associated with a unique value and keys are unique.
	*/
	
	// For example, in the following example we store the names and IDs of 
	// the faculty members.
	Hashtable<String, Integer> facultyList = new Hashtable<String, Integer>();
	// So every element in the hashtable has 2 fields: 
	// 1) a key, which is a string and v
	// 2) value, which is integer
	// Let's store the faculty information
	facultyList.put("ibrahim", 123); // key:"ibrahim", value:123
	facultyList.put("hakan", 234);   // key:"hakan",   value:234
	facultyList.put("ahmet", 537);   // key:"ahmet",   value:537
	facultyList.put("kemal", 838);   // key:"kemal",   value:838
	
	// what is the ID of hakan?
	// To retrieve value of a key, we can use the following code:
	System.out.println("hakan's id is " + facultyList.get("hakan") );
	
	// what if we look for a non-existing key?
	System.out.println("ayse's id is " + facultyList.get("ayse") );
	// if the key does not exist, facultyList.get("ayse") will return null
	
	// you can also use the member method containsKey( ), which returns true or false
	if( facultyList.containsKey("ayse") )
	{
		System.out.println("ayse's id is " + facultyList.get("ayse") );
	}
	else
	{
		System.out.println("ayse cannot be found!");
	}
	
  }
}