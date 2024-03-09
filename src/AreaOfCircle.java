public class AreaOfCircle extends AreaOfTriangle
{
   static void circle(int a){
       double pie = 3.14;
       double area= (pie * (a * a));
       System.out.println("area of the circle for given radius " + a + " is " + area);
   }

   public static void main(String[]args){
        AreaOfCircle areaofcircle = new AreaOfCircle();
        areaofcircle.circle(2);
        AreaOfTriangle areaOfTriangle= new AreaOfTriangle();




    }
}
