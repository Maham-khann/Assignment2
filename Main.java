class Main {
	public static void main(String[] args) {
		int m = 10;
    System.out.println("THE TOTAL OF GIVEN NUMBER IS: ");
		System.out.println(addRecursive(m));		
	}
	public static int addRecursive(int m) {
		if (m <= 1)
			return m;
		return m + addRecursive(m-1);	
	}
}
