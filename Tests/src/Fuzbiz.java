
public class Fuzbiz {

	public static void main(String[] args) {

		
		for (int i = 1; i < 101; i++) {
			StringBuilder sb=new StringBuilder();
			if (i%3 !=0 && i%5 != 0) {
				System.out.print(i);
			}
			if (i%3 == 0) {
				sb.append("fuz");
			}
			if (i%5 == 0) {
				sb.append("biz");
			}
			System.out.println(sb.toString());
		}
		
		
	}
	
}
