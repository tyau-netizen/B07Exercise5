

public class Rectangle {
	Point A;
	Point B;
	Point C;
	Point D;
	
	Rectangle(Point A, Point B, Point C, Point D) {
		if (isRectangle(A, B, C, D)) {
			this.A = A;
			this.B = B;
			this.C = C;
			this.D = D;
		}
		else {
			throw new IllegalArgumentException("Points do not make valid rectangle");
		}
	}
	
	public double perimeter() {
		double dist1 = A.distance(B);
		double dist2 = A.distance(C);
		double dist3 = A.distance(D);
		double side1 = Math.min(dist1, Math.min(dist2, dist3));
		double diag = Math.max(dist1, Math.max(dist2, dist3));
		double side2 = dist1 + dist2 + dist3 - side1 - diag;
		return side1 + side1 + side2 + side2;
	}
	public boolean isSquare() {
		double dist1 = A.distance(B);
		double dist2 = A.distance(C);
		double dist3 = A.distance(D);
		if (dist1 == dist2 || dist1 == dist3 || dist2 == dist3) return true;
		return false;
	}
	
	private static boolean isRectangle(Point A, Point B, Point C, Point D) {
		if (A.distance(B) == C.distance(D) && A.distance(C) == B.distance(D) && A.distance(D) == B.distance(C))
			return true;
		return false;
	}
	
	
}