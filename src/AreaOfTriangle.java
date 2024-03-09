public class AreaOfTriangle extends AreaOfSquare
{
   static double Triangle(int base, int height){
       return 0.5 * base * height;

   }

   public static void main(String[]args){
       int base = 5;
       int height= 10;
      double area=AreaOfTriangle.Triangle(base, height);
       System.out.println("The area Of Triangle is:" + area);
       AreaOfCircle.circle(2);
       AreaOfSquare areaOfSquare=new AreaOfSquare();



   }











}
