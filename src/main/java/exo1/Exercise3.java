package exo1;

public class Exercise3 {
	public static void main(String[] args) {
		new Panel(new Drawable[] {
			new ConvexPolygon(new Point[]{
				new Point(1, 1),
				new Point(100, 100),
				new Point(200, 1)
			})
		});
	}
}
