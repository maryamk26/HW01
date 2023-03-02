import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        LINE line = new LINE(new P2D(1, 5), new P2D(2, 5));
        line.printall();
        System.out.println();

        RECT rectangle = new RECT(new P2D(1, 5), new P2D(2, 5));
        rectangle.printall();
        System.out.println("Area:" + rectangle.getArea());

        FIG[] figures = new FIG[7];
        figures[0] = line;
        figures[1] = rectangle;
        figures[2] = new RECT(new P2D(2, 7), new P2D(4, 3));
        figures[3] = new RECT(new P2D(2, 17), new P2D(4, 5));
        figures[4] = new LINE(new P2D(2, 6), new P2D(5, 32));
        figures[5] = new LINE(new P2D(2, 6), new P2D(5, 1));
        figures[6] = new RECT(new P2D(2, 9), new P2D(4, 1));

        for (var f : figures) {
            f.printall();
            System.out.println();
        }

        //       double sumLinerect = sumCounter(line,rectangle);
        //       System.out.println("Line + rectangle = "+ sumLinerect);
        //       System.out.println();

        //       System.out.println("sumCounter for figures "+sumCounter(figures));

        ((FIG) getmaxareaable(rectangle, new RECT(new P2D(2, 3), new P2D(4, 2)))).printall();
        System.out.println();

        System.out.println("Площадь наиболшей фигуры =" +
                getmaxareaable(rectangle, new RECT(new P2D(2, 3), new P2D(4, 2))).getArea());
        System.out.println("|||||||||||||||||||||||||||||");

        FIG m = rectangle;
        for (var f : figures) {
            if (f instanceof AREAABLE) {
                m = (FIG) getmaxareaable((AREAABLE) m, (AREAABLE) f);
            }
        }
        m.printall();
        System.out.println(((AREAABLE) m).getArea());

        System.out.println("Unsorted figures:");
        for (FIG f : figures) {
            f.printall();
        }
        System.out.println();

        Arrays.sort(figures);
        System.out.println("sorted figures:");
        for (FIG f: figures) {
            f.printall();
            System.out.println();
        }
    }

    public static AREAABLE getmaxareaable(AREAABLE... fff) {
        AREAABLE max = fff[0];
        for (int i = 1; i < fff.length; i++) {
            if (fff[i].getArea() > max.getArea()) {
                max = fff[i];
            }
        }
        return max;
    }

    public static double sumCounter(FIG... fff) {
        double sum = 0;
        for (var f : fff) {
            sum += f.getcontour();
        }
        return sum;
    }
}