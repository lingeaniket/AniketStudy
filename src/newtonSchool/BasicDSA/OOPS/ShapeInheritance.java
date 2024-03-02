package newtonSchool.BasicDSA.OOPS;

import java.util.Scanner;

public class ShapeInheritance {
    static abstract class Quadrilateral {
        double side1;
        double side2;
        double side3;
        double side4;

        public Quadrilateral(double side1, double side2, double side3, double side4) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            this.side4 = side4;
        }
        protected abstract double getArea();

        protected double getPerimeter() {
            return (side1+side2+side3+side4);
        }
    }

    // Implement class Parallelogram and methods getArea() and getPerimeter()
    static class Parallelogram extends Quadrilateral {
        double height;
        Parallelogram(double side1, double side2, double height){
            super(side1, side2, side1, side2);
            this.height = height;
        }

        public double getArea() {
            return height*side1;
        }

    }

    // Implement class Rhombus and methods getArea() and getPerimeter()
    static class Rhombus extends Parallelogram {
        Rhombus(double side1, double height){
            super(side1, side1, height);
        }
        public double getArea() {
            return height*side1;
        }
        //Write your code here

    }

    //Implement class Rectangle and methods getArea() and getPerimeter()
    static class Rectangle extends Parallelogram {
        Rectangle(double side1, double height){
            super(side1, height, height);
        }
        public double getArea() {
            return side1*height;
        }
        //Write your code here

    }
    //Implement class Square and methods getArea() and getPerimeter()
    static class Square extends Rhombus {
        Square(double side1){
            super(side1, side1);
        }
        public double getArea() {
            return side1*side1;
        }
        //Write your code here

    }

    // Do not edit the Main class
    static class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            double side1P = scan.nextDouble();
            double side2P = scan.nextDouble();
            double heightP = scan.nextDouble();
            double side1R = scan.nextDouble();
            double heightR = scan.nextDouble();
            double side1Rec = scan.nextDouble();
            double heightRec = scan.nextDouble();
            double side1S = scan.nextDouble();
            if((side1P <0 || side2P < 0) || heightP <0 || side1R <0 || heightR<0 || side1Rec<0 || heightRec<0 || side1S <0) {
                System.out.println("Length of a side cannot be negative. Please Enter a positive integer");
            } else {
                Quadrilateral parallelogram = new Parallelogram(side1P, side2P, heightP);
                Quadrilateral rhombus = new Rhombus(side1R, heightR);
                Quadrilateral rectangle = new Rectangle(side1Rec, heightRec);
                Quadrilateral square = new Square(side1S);
                System.out.println("Perimeter of Parallelogram is " + parallelogram.getPerimeter()
                        +" and Area of Parallelogram is " + parallelogram.getArea());
                System.out.println("Perimeter of Rhombus is " + rhombus.getPerimeter()
                        +" and Area of Rhombus is " + rhombus.getArea());
                System.out.println("Perimeter of Rectangle is " + rectangle.getPerimeter()
                        +" and Area of Rectangle is " + rectangle.getArea());
                System.out.println("Perimeter of Square is " + square.getPerimeter()
                        + " and Area of Square is " + square.getArea());

                scan.close();
            }
        }
    }
}
