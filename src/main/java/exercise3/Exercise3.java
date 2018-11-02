package exercise3;

public class Exercise3 {
	static ConvexPolygon buildConvexPolygon(Point[] vertices) {
		ConvexPolygon convexPolygon = new ConvexPolygon(vertices);
		System.out.println("perimetre polygone = "+ convexPolygon.perimeter() + " aire = " + convexPolygon.area());
		return null;
	}

	static ConvexPolygon buildRectangle(Point upperLeft, Point lowerRight) {
		Rectangle rectangle = new Rectangle(upperLeft, lowerRight);
		return null;
	}

	static ConvexPolygon buildSquare(Point upperLeft, int sideLength) {
		Square square = new Square(upperLeft, sideLength);
		return null;
	}

	static Ellipsis buildEllipsis(Point center, int xAxisLength, int yAxisLength) {
		Ellipsis ellipsis = new Ellipsis(center, xAxisLength, yAxisLength);
		return null;
	}

	static Ellipsis buildCircle(Point center, int radius) {
		Circle circle = new Circle(center, radius);
		return null;
	}

	static double computePerimeter(ConvexPolygon convexPolygon) {
		return convexPolygon.perimeter();
	}

	static double computeArea(ConvexPolygon convexPolygon) {
		return convexPolygon.area();
	}

	static double computePerimeter(Ellipsis ellipsis) {
		return ellipsis.perimeter();
	}

	static double computeArea(Ellipsis ellipsis) {
		return ellipsis.area();
	}
}
