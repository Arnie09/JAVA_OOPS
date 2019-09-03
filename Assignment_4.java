/* Create a class Complex with two data members reals and imaginary. Overload 3 constructors to initialise the data members
(default,normal or parameterised). Provide methods which returns objects of the complex class as the result for addition,
subtraction and multiplication of two complex numbers.
 */

import java.io.*;

class Assignment_4{

    public static void main(String args[])throws IOException{

        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int ch;
        Complex ob1;
        Complex ob2;
        Complex ob3;
        Complex ob4;
        Complex ob5;
        Complex ob6;
        Complex ob7;

        System.out.println("Enter what kind of constructor you want to use:\n1 for non parameterised constructor\n2 for parameterised constructor\n3 for parameterised constructor using objects ");
        ch = Integer.parseInt(br.readLine());
        switch(ch) {
            case 1:
                ob1 = new Complex();
                ob2 = new Complex();
                ob5 = ob1.add(ob2);
                ob6 = ob1.sub(ob2);
                ob7 = ob1.multiple(ob2);

                System.out.println("The addition of numbers: "+ob5.real+" + "+ob5.imaginary+"i");
                System.out.println("The subtraction of numbers: "+ob6.real+" + "+ob6.imaginary+"i");
                System.out.println("The multiple of numbers: "+ob7.real+" + "+ob7.imaginary+"i");
                break;
            case 2:
                System.out.println("Enter the real and imaginary part of a number: ");
                double real1 = Double.parseDouble(br.readLine());
                double imaginary1 = Double.parseDouble(br.readLine());
                System.out.println("Enter the real and imaginary part of a number: ");
                double real2 = Double.parseDouble(br.readLine());
                double imaginary2 = Double.parseDouble(br.readLine());

                ob1 = new Complex(real1, imaginary1);
                ob2 = new Complex(real2, imaginary2);

                ob5 = ob1.add(ob2);
                ob6 = ob1.sub(ob2);
                ob7 = ob1.multiple(ob2);

                System.out.println("The addition of numbers: "+ob5.real+" + "+ob5.imaginary+"i");
                System.out.println("The subtraction of numbers: "+ob6.real+" + "+ob6.imaginary+"i");
                System.out.println("The multiple of numbers: "+ob7.real+" + "+ob7.imaginary+"i");
                break;

            case 3:
                System.out.println("Enter the real and imaginary part of a number: ");
                real1 = Double.parseDouble(br.readLine());
                imaginary1 = Double.parseDouble(br.readLine());
                System.out.println("Enter the real and imaginary part of a number: ");
                real2 = Double.parseDouble(br.readLine());
                imaginary2 = Double.parseDouble(br.readLine());

                ob1 = new Complex(real1, imaginary1);
                ob2 = new Complex(real2, imaginary2);

                ob3 = new Complex(ob1);
                ob4 = new Complex(ob2);

                ob5 = ob3.add(ob4);
                ob6 = ob3.sub(ob4);
                ob7 = ob3.multiple(ob4);

                System.out.println("The addition of numbers: "+ob5.real+" + "+ob5.imaginary+"i");
                System.out.println("The subtraction of numbers: "+ob6.real+" + "+ob6.imaginary+"i");
                System.out.println("The multiple of numbers: "+ob7.real+" + "+ob7.imaginary+"i");
                break;

            default:
                System.out.println("You have entered a wrong choice ");
        }


    }

    static class Complex{

        double real;
        double imaginary;

        Complex(){
            real = Math.random()*10;
            imaginary = Math.random()*10;
        }

        Complex(Complex a){
            real = a.real;
            imaginary = a.imaginary;
        }

        Complex(double real,double imaginary){
            this.real = real;
            this.imaginary = imaginary;
        }

        public Complex add(Complex a){
            Complex temp = new Complex();
            temp.real = this.real+a.real;
            temp.imaginary = this.imaginary+a.imaginary;
            return temp;
        }

        public Complex sub(Complex a){
            Complex temp = new Complex();
            temp.real = this.real-a.real;
            temp.imaginary = this.imaginary-a.imaginary;
            return temp;
        }

        public Complex multiple(Complex a){
            Complex temp = new Complex();
            temp.real = this.real*a.real;
            temp.imaginary = this.imaginary*a.imaginary;
            return temp;
        }
    }
}


