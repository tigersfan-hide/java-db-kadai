package kadai_020;

public class DictionaryExec_Chapter20 {

	public static void main(String[] args) {
		Dictionary_Chapter20 fruitDic = new Dictionary_Chapter20();
		
		String[] words = {"apple","banana","grape", "orange"};
		for(int i=0;i<words.length;i++) {
			fruitDic.search(words[i]);
		}
	}

}
