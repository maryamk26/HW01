
public class POLYLINE extends FIG{

    private P2D[] points;

    public POLYLINE(P2D[] points) {
        super(points[0], points[points.length - 1]);
        this.points = points.clone();
    }


    @Override
    public void draw() {
        System.out.println("This is a PolyLine : _____/////------/////______");
    }

    @Override
    public double getcontour() {
        double length = 0;
        for (int i = 0; i < points.length - 1; i++) {
            length += points[i].distance(points[i+1]);
        }
        return length;
    }
}