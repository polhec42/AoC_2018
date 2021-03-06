public class TestClass{
	public static void main(String[] args) {
		
		Day16 day16 = new Day16();
		day16.parseInput("input.txt");

		long time1 = System.currentTimeMillis();
		System.out.println(day16.partOne().toString());
		double timeForFirst = (System.currentTimeMillis() - time1)/1000.;

		long time2 = System.currentTimeMillis();		
		System.out.println(day16.partTwo().toString());
		double timeForSecond = (System.currentTimeMillis() - time2)/1000.;

		System.out.println("Task 1 took: " + timeForFirst);
		System.out.println("Task 2 took: " + timeForSecond);

	}
}