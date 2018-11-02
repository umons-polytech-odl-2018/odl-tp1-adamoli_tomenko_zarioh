package exercise3;

public class ConvexPolygon {
	private Point vertices [];

	private double areatriangle(Point A, Point B, Point C){
		return (Math.abs((A.getX()-C.getX())*(B.getY()-C.getY())-(A.getY()-C.getY())*(B.getX()-C.getX()))/2);
	}

	public double perimeter(){
		double per = 0;
		for(int i = 0; i<vertices.length; i++) {
			if(i+1==vertices.length) per += vertices[i].distance(vertices[0]);
			else per += vertices[i].distance(vertices[i+1]);
		}
		return per;
	}

	/*public double area(){
		double area = 0;
		int dim = vertices.length;
		for(int i=0; i<(dim/2) )


		return area;
	}*/

	public ConvexPolygon(Point ver []){
		this.vertices=ver;
	}
}
