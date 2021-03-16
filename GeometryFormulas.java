public class GeometryFormulas{

    
    public static void main(String[] args) {
        
         Formulas fmla = new Formulas();
	
	 //Made By Renzo Aldridge Quiballo
         //start
         System.out.println(fmla.areaOfCircle(4.0));
         System.out.println(fmla.areaOfTriangle(5.0,7.0));
         System.out.println(fmla.areaOfSquare(6.5));
         System.out.println(fmla.areaOfRectangle(4.5,3.5));
         //endd

    }
    
}

class Formulas{
    //Made by Renzo Aldridge Quiballo
    //start
    public double areaOfCircle(double r){
        double pi =  3.1415;
        double area = (pi*(r*r));
        return area;
    }
    public double areaOfTriangle(double b, double h){
        double area = (b*h)/2;
        return area;
    }
    public double areaOfSquare(double a){
        double area = (a*a);
        return area;
    }
    public double areaOfRectangle(double b, double h){
        double area = (b*h);
        return area;
    }
    //end
    
}
