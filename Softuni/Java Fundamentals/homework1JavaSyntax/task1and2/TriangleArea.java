package homework1JavaSyntax.task1and2;

public class TriangleArea {

	public static void main(String[] args) {
		Triangle triangle1=new Triangle(new Coord(-5, 10), new Coord(25, 30), new Coord(60, 15));
		Triangle triangle2=new Triangle(new Coord(53, 18), new Coord(56, 23), new Coord(24, 27));
		Triangle triangle3=new Triangle(new Coord(1, 1), new Coord(2, 2), new Coord(3, 3));
		System.out.println("Triangle Area 1 : "+ calculateTriangleArea(triangle1));
		System.out.println("Triangle Area 2 : "+ calculateTriangleArea(triangle2));
		System.out.println("Triangle Area 3 : "+ calculateTriangleArea(triangle3));
	}

	
	
	private static double calculateTriangleArea(Triangle tr){
					//Ax* (By - Cy) +
		double area=(tr.getA().getX()* (tr.getB().getY() - tr.getC().getY() )+
					//Bx(Cy-Ay) +
					tr.getB().getX()* (tr.getC().getY() - tr.getA().getY() )+
					//Cx(Ay-By)
					tr.getC().getX()* (tr.getA().getY() - tr.getB().getY() )
				)/2;
		return Math.abs(area);
	}
}
