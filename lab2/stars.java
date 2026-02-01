package lab2;

public class stars {
	private int a;
	public stars(int cnt) {
		this.a = cnt;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i <=a;i++) {
			for(int j = 1; j<=i; j++) {
			    sb.append("[*]");
			}
			if(i < a) sb.append("\n");
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		stars small = new stars(3);
		System.out.println(small.toString());
	}

}