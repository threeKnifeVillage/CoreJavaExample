/**
 * 2016.9.15
 * @author cjp
 *
 */
public class ArrayAlg {
	public static <T extends Comparable> Pair<T> minmax(T[] a) {
		if (a == null || a.length == 0) {
			return null;
		}
		
		T min = a[0];
		T max = a[1];
		for (int i = 0; i < a.length; i++)
		{
			if (min.compareTo(a[i]) > 0)
			{
				min = a[i];
			}
			
			if (max.compareTo(a[i]) < 0)
			{
				max = a[i];
			}
		}
		
		return new Pair<T>(min,max);
	}
	
}
