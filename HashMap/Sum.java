
// Find the sum of all values in a HashMap
import java.util.HashMap;
class Sum
{
	public static void main(String args[])
	{
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("A",10);
		hm.put("B",20);
		hm.put("C",30);
			
        int sum = 0;

        for(String key : hm.keySet()) {
            sum = sum + hm.get(key);
        }

        System.out.println(sum);
	}
}



