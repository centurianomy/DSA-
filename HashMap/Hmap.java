import java.util.HashMap;
class Hmap
{
	public static void main(String args[])
	{
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("A",10);
		hm.put("B",20);
		hm.put("C",30);
			
		System.out.println("Elements are: "+hm); //returns whole key set pairs
		System.out.println("1: "+hm.get("B")); //returns particular value pair for a key
		System.out.println("2: "+hm.get("C"));
		System.out.println("Returns keyset: "+hm.keySet()); //only returns kes.
		System.out.println("2: "+hm.get("C"));
			
		for(String key: hm.keySet()) 
		System.out.println(key +"-->"+hm.get(key));
		
	}
}
