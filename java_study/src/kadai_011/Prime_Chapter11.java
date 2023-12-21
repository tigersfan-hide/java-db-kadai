package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		boolean[] primeJudge = new boolean[101];
		for (int i =0; i<primeJudge.length; i++) {
			primeJudge[i]=true;
		}
		
		int numDivided =2;
		while(numDivided <primeJudge.length){
			for(int i=numDivided+1; i<primeJudge.length;i++) {
				if (i % numDivided ==0) {
					primeJudge[i]=false;
				}
			}
			numDivided++;
		}
		for (int i =2;i<primeJudge.length;i++) {
			if(primeJudge[i]) {
				System.out.println(i);
			}
		}
		
	}

}
