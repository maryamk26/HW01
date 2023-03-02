
public class RECT extends FIG implements AREAABLE {

    public RECT(){

    }

    public RECT(P2D p1, P2D p2) {
        super(p1, p2);
    }

    public double getArea(){
        return getwidth() * getwidth();
    }

    public double getcontour(){
        return 2.0 * (getwidth() + getheight());
    }

    public void draw(){
        System.out.println(" ______________");
        System.out.println("|              |");
        System.out.println("|              |");
        System.out.println("|              |");
        System.out.println("|______________|");

    }
}
