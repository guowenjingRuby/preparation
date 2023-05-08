package four;

public class Point {
    private double x;
    private double y;

    public Point(){
        System.out.println("无参");
    }
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }

    /**
     * distance(p1:Point,p2:Point):double
     * (X1-X2)^2+(Y1-Y2)^2
     */
    public static double distance(Point p1,Point p2){
        return Math.sqrt(Math.pow((p1.x-p2.x),2)+Math.pow((p1.y-p2.y),2));
    }

    public static void main(String[] args) {
        Point p1=new Point(1,2);
        Point p2=new Point(4,6);
        System.out.println(distance(p1,p2));
    }

}
