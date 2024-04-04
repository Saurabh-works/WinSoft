import java.util.HashMap;
import java.util.Map;

class WordCount {
	public static void main(String[] args)
	{

		String str = "Saurabh Shinde Shinde Saurabh Chandrakant Shinde Saurabh";

		Map<String, Integer> hashMap = new HashMap<>();

		String[] words = str.split(" ");

		for (String word : words) {
		
			if (hashMap.containsKey(word))
				hashMap.put(word, hashMap.get(word) + 1);

			else
				hashMap.put(word, 1);
		}

		System.out.println(hashMap);
	}
}
