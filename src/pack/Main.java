package pack;

public class Main {

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}
	
	public static int sumDigits(int c) {
		c = Math.abs(c);
		if (c == 0) {
			return 0;
		}
		return c % 10 + sumDigits(c / 10);
	}
	
	public static int binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return -1;
	}
	
	public static String toBinary(int n) {
		if (n == 0) {
			return "0";
		}
		if (n == 1) {
			return "1";
		}
		return toBinary(n / 2) + (n % 2);
	}
	
	public static void main(String[] args) {
		System.out.println(toBinary(0)); // 0
		System.out.println(toBinary(1)); // 1
		System.out.println(toBinary(5)); // 101
		System.out.println(toBinary(10)); // 1010
		System.out.println(toBinary(42)); // 101010


	}

}
