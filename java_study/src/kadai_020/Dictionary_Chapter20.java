package kadai_020;
import java.util.HashMap;

public class Dictionary_Chapter20 {
	public void search(String word){
		HashMap <String,String> dictionary = new HashMap <String,String>();
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
		for(String key : dictionary.keySet()) {
			if (word.equals(key)) {
				System.out.println(word+"の意味は"+ dictionary.get(key));
			} 
		}
		if(dictionary.get(word)==null) {
			System.out.println(word+"は辞書に存在しません");
		}
	}
}