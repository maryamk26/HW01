
public class LINE extends FIG{

    public LINE(){
        p1 = new P2D();
        p2 = new P2D();
    }

    public LINE(P2D p1, P2D p2){
        super(p1,p2);
    }

    @Override
    public double getcontour(){
        return Math.sqrt(getwidth() * getwidth() + getheight() * getheight() );
    }

    @Override
    public void draw(){
        System.out.println();
    }
}