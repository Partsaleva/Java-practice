
public class Problem2 {

	public static void main(String[] args) {
		int number=0, f1=1, f2=2;
		int i=0, sum=2;
		while(number < 4_000_000){
			number=f1+f2;
			f1=f2;
			f2=number;
			i++;
			if (i % 3==0) {
				sum+=number;
			}
		}

		System.out.println(sum);
	}

}
