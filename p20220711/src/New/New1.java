package New;

public class New1 {
	public static void main(String[] args) {

		int val = 373;

		int val2 = 373 / 100;

		int val3 = (373 - (val2 * 100)) / 10;
//	val2*100 = 3*100
//	373-val2*100=373-300
//	73/10=7
		int val4 = (373 - (val2 * 100) - (val3 * 10));
//	val2*100 = 3*100
//	373-val2*100=373-300
//	73-val3*10(70)=3

		int var = -2;
		int var2 = var > 0 ? var : 0;

		if (var > 0) {
			System.out.println(var);
		} else {
			System.out.println(0);
		}

	}

}
