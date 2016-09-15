
public class PairTest1 {

	public static void main(String[] args) {
		String[] words = {"china","usa","england","japan"};
		Pair<String> mm = ArrayAlg.minmax(words);
		System.out.println(mm.getFirst() + " " + mm.getSecond());
	}
}
