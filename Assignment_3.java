/* 1) Write a programtocompute perimeter of a class Circle,Rectabgle,and Square using parameterised constructor with command line argument.
   2) Write a programr to calculate the area of a rectangle,circle,and square with parameterised constructor using Buffered reader class object.
   3) Write aprogram to design a class volume and then find out the volume of a cube of a cylinder and ellipsoid using method overloading through 
   	a) buffered Reader class object 
   	b) command line argument */
import java.io.*;

//class of circle
class Circle{
	double radius;
	public Circle(double radius){
		this.radius = radius;
	}
	public double perimeter(){
		return 2*3.142*this.radius;
	}
	public double area(){
		return 2*this.radius*this.radius;
	}
}

//Class of rectangle
class Rectangle{
	double length,breadth;
	public Rectangle(double length,double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	public double perimeter(){
		return (2*(length+breadth));
	}
	public double area(){
		return (length*breadth);
	}
}

//Class of Square 
class Square{
	double side;
	public Square(double side){
		this.side = side;
	}
	public double perimeter(){
		return 4*side;
	}
	public double area(){
		return (side*side);
	}
}

class Assignment_3{

	
	public static double volume(double radius,double height){
		return (3.142*radius*radius*height);
	}
	public static double volume(double a, double b,double c){
		return (4/3.0* 3.142*a*b*c);
	}
	public static double volume(double a){
		return (a*a*a);
	}
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int ch;

		double inputs[] = new double[10];
		//double circlerad,reclen,recbreadth,squareside,cubeside,ellipseA,ellipseB,ellipseC,cylinderrad,cylinderheight;
		int k = 0;
		System.out.println("Enter 1 if you have given input via commandline or 2 if you want to input via bufferedReader! ");
		ch = Integer.parseInt(br.readLine());

		if (ch == 1){

			for(String str:args){
				try{
					double temp  = Double.parseDouble(str);
					inputs[k] = temp;
					k++;
				}
				catch(Exception e){
					continue;
				}
			}
			call_objects(inputs);

		}else if (ch == 2){

			System.out.println("Enter the radius of the Circle: ");
			inputs[0] = Double.parseDouble(br.readLine());
			System.out.println("Enter the length and breadth of the Rectangle: ");
			inputs[1] = Double.parseDouble(br.readLine());
			inputs[2] = Double.parseDouble(br.readLine());
			System.out.println("Enter the side of the Square: ");
			inputs[3] = Double.parseDouble(br.readLine());
			System.out.println("Enter the side of the cube: ");
			inputs[4] = Double.parseDouble(br.readLine());
			System.out.println("Enter the a,b, and c value of the ellipsoid: ");
			inputs[5] = Double.parseDouble(br.readLine());
			inputs[6] = Double.parseDouble(br.readLine());
			inputs[7] = Double.parseDouble(br.readLine());
			System.out.println("Enter the radius and height of the cylinder: ");
			inputs[8] = Double.parseDouble(br.readLine());
			inputs[9] = Double.parseDouble(br.readLine());

			call_objects(inputs);
		}
	}

	public static void call_objects(double inputs[]){

		Circle circle = new Circle(inputs[0]);
		System.out.println("the perimeter of the circle is: " +circle.perimeter());
		System.out.println("the area of the circle is: " +circle.area());

		Rectangle rectangle = new Rectangle(inputs[1],inputs[2]);
		System.out.println("the perimeter of the rectangle is: " +rectangle.perimeter());
		System.out.println("the area of the rectangle is: " +rectangle.area());

		Square square = new Square(inputs[3]);
		System.out.println("the perimeter of the square is: " +square.perimeter());
		System.out.println("the area of the square is: " +square.area());

		System.out.println("the volume of the cube is: " + volume(inputs[4]));
		System.out.println("the volume of the ellipsoid is: " +volume(inputs[5],inputs[6],inputs[7]));
		System.out.println("the volume of the cylinder is: " +volume(inputs[8],inputs[9]));

	}
}