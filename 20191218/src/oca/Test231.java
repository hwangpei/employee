package oca;

public class Test231 {
	public static void main(String[] args) {
		Test231 t = new Test231();
		try {
			t.doPrint();
			t.doList();
		} catch (Exception e2) {
			System.out.println("Caught" + e2);
		}
	}

	public void doList() throws Exception {
		throw new Error("Error");
	}

	public void doPrint() throws Exception {
		throw new RuntimeException("Exception");
	}
}
