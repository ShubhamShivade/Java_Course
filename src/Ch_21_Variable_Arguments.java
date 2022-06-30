
public class Ch_21_Variable_Arguments {

	class calculate{
		static int add(int ...arr) {
			int result=0;
			for(int a:arr) {
				result+=a;
			}
			return result;
		}
		static int multi(int ...arr) {
			int result=1;
			for(int a:arr) {
				result*=a;
			}
			return result;
		}
	
	public static void main(String[] args) {
	
		System.out.println(add(1,2));
		System.out.println(add(2,3,4));
		System.out.println(add(4,5,6));
		System.out.println(multi(1,2));
		System.out.println(multi(2,3,4));
		System.out.println(multi(4,5,6));
	}


}
}
