
public class TwoCircles {
    public static double findAngle(double x1,double y1 ,double x2,double y2 ){
        double angle =  Math.acos((x1*x2+y1*y2)/(Math.sqrt(Math.pow(x1,2) + Math.pow(y1,2))* Math.sqrt(Math.pow(x2,2)+ Math.pow(y2,2))));
        return angle;
    }
//    public static void angle(){
//        int radius=6;
//        System.out.println("X "+radius* Math.cos());
//        System.out.println("Y "+);
//    }
    public static void main(String[] args) {
//        System.out.println(findAngle(0,360,1,359));
       // System.out.println(Math.toDegrees(findAngle(0,360,1,359)));
        findCoordinates(3,6,3,0);
    }

    /*public static void coordinates(double x1,double y1){

        double theta = Math.toDegrees(Math.atan(y1/x1));
        System.out.println(theta);
        double x2 = Math.sqrt(Math.pow(x1,2)+Math.pow(y1,2)) * Math.cos(theta+0.1596);
        double y2 = Math.sqrt(Math.pow(x1,2)+Math.pow(y1,2)) * Math.sin(theta+0.1596);
        System.out.println("X2 :: "+x2+"    Y2  :: "+y2);
    }*/

    public static void findCoordinates(double x1,double y1 , double radius ,double angle){
        System.out.println((Math.cos(Math.toRadians(90))));
        System.out.printf("%.3d",Math.cos(Math.toRadians(90)));
        double x2 =  radius * Math.cos(90);
        double y2 = radius * Math.sin(90);
        System.out.println("X2 :: "+x2+"    Y2  :: "+y2);
    }



}

