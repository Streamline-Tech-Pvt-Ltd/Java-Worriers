
public class LoopThried {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {

				if (j == 5) {
					System.out.print("!" + "\t");
				} else if (i == 2) {
					System.out.print("-" + "\t");
				} else if (i == 3) {
					System.out.print("#" + "\t");
				} else if (i == 5) {
					System.out.print("@" + "\t");
				} else {
					System.out.print("ram" + "\t");
				}

			}
			System.out.println();
		}

	}

}
