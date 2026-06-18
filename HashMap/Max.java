
// Print the max value key
import java.util.HashMap;
class Max
{
	public static void main(String args[])
	{
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("A",10);
		hm.put("B",40);
		hm.put("C",30);
			

        String subj = "";
        int max = Integer.MIN_VALUE;

        for(String key : hm.keySet()) {

            if(hm.get(key) > max) {
                max = hm.get(key);
                subj = key;
            }
        }

        System.out.println(subj);
	}
}






