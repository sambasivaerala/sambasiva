package GenericsAssignment;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Program2 {
	public static void main(String[] args) {
		Map<Integer,Double> hm=new HashMap<>();
		hm.put(10,101.00);
		hm.put(11,101.11);
		hm.put(12,101.22);
		hm.put(13,101.33);
		hm.put(14,101.44);
		hm.put(15,101.55);
		hm.put(16,101.66);
		hm.put(17,101.77);
		hm.put(18,101.88);
		hm.put(19,101.99);
	
		Set<Integer> keys=hm.keySet();
		for(int i:keys)
		{
			System.out.println("Key:"+i+"|| Values:"+hm.get(i));
		}
	}
}
