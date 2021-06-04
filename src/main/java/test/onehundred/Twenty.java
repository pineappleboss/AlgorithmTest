package test.onehundred;
/**
 * 甲堆abc，和乙队xyz进行比赛，a不和x比，c不和xz比
 * @author TKQ
 *
 */
public class Twenty {
	public static void main(String[] args) {
		String[] jiaStrings= {"a","b","c"};
		String[] yiStrings= {"x","y","z"};
		for (int i = 0; i < jiaStrings.length; i++) {
			for (int j = 0; j < yiStrings.length; j++) {
				if (jiaStrings[i].equals("a")&&yiStrings[i].equals("x")) {
					continue;
				}else if(jiaStrings[i].equals("c")&&yiStrings[i].equals("x")) {
					continue;
				}
				System.out.println(jiaStrings[i]+yiStrings[j]);
			}
		}
	}
}
