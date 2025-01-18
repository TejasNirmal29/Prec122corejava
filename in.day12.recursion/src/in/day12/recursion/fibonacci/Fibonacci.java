package in.day12.recursion.fibonacci;

public class Fibonacci {
	public int fibonacci(int n) {
		return (n<=1)? n:fibonacci(n-1)+fibonacci(n-2);
	}
}
