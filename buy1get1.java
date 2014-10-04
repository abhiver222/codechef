public class prac2 {
	public static void main(String[] args) {
		String str = "sssSSSabcdABCD";
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			int val = c[i];
			int j = i;
			int swap = 0;
			while (j > 0 && c[j - 1] > val) {
				swap = c[j];
				c[j] = c[j - 1];
				c[j - 1] = (char) swap;
				j--;
			}
		}
		int count1 = 0;

		for (int i = 0; i < c.length; i++) {
			if (i != c.length - 1) {
				if (c[i] == c[i + 1]) {
					count1++;
					i++;
					continue;
				} else {
					count1++;
					continue;
				}
			} else
				count1++;

		}
		System.out.println(c);
		System.out.println(count1);
	}

}
