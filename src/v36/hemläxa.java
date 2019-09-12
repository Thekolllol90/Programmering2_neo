package v36;

public class hemläxa {
	public static void main(String[] args) {

		int arr[] = {4, 6, 10, 8, 2};
		System.out.println(heltal_summa(arr));

		String str = ("jag är en string");
		String revstr = rec(str);
		System.out.println("stringen är: " + revstr);

		ReturnArray();

		Box boi = new Box("boi", 4, "bruh");
	}

	public static int heltal_summa(int[] arr) {
		int res = 0;
		for (int i = 0; i < arr.length; i++) {
			res = res + arr[i];
		}
		return res;
	}

	public static String rec(String str) {
		if (str.isEmpty())
			return str;
		return rec(str.substring(1)) + str.charAt(0);
	}

	public static <T> T[] ReturnArray(T... items) {

		return items;
	}

}

