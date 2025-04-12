package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		Dictionary_Chapter21 dic = new Dictionary_Chapter21();
		String[] searchWords = {"apple","banana","grape","orange"};
		for(String a:searchWords) {
			if(dic.dictionarymap.containsKey(a)){
				System.out.println(a + "の意味は" + dic.dictionarymap.get(a));
			}else{
				System.out.println(a + "は辞書に存在しません");
			}
			
		}
		
	}

}
