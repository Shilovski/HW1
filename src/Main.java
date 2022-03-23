import OOP.OOP1.*;
import OOP.OOP2.Ball;
import OOP.OOP2.Container;
import OOP.OOP2.MyComplex;
import OOP.OOP2.MyPolynomial;

public class Main {

    public static void main(String[] args) {

        // Circle
        System.out.println("\n*********************************");
        System.out.println("Circle class");
        System.out.println("*********************************\n");

        Circle circle1 = new Circle(10.0, "black");
        Circle circle2 = new Circle();

        System.out.println("first circle color: " + circle1.getColor());
        System.out.println("first circle radius: " + circle1.getRadius());
        System.out.println("second circle color: " + circle2.getColor());
        System.out.println("second circle radius: " + circle2.getRadius());

        circle2.setColor("blue");
        circle2.setRadius(20.0);

        System.out.println("circle1: " + circle1);
        System.out.println("circle2: " + circle2);

        // Rectangle
        System.out.println("\n*********************************");
        System.out.println("Rectangle class");
        System.out.println("*********************************\n");

        Rectangle rectangle = new Rectangle();

        System.out.println(rectangle);
        System.out.println("the area of the rectangle is " + rectangle.getArea());
        System.out.println("the perimeter of the rectangle is " + rectangle.getPerimeter());

        rectangle.setLength(2.0f);
        rectangle.setWidth(3.0f);

        System.out.println(rectangle);
        System.out.println("the area of the rectangle is " + rectangle.getArea());
        System.out.println("the perimeter of the rectangle is " + rectangle.getPerimeter());

        // Employee
        System.out.println("\n*********************************");
        System.out.println("Employee class");
        System.out.println("*********************************\n");

        Employee employee1 = new Employee(1,"Ivan", "Ivanon", 250);
        Employee employee2 = new Employee(2,"Oleg", "Smirnov", 300);

        System.out.println("employee1: " + employee1.toString());
        System.out.println("employee2: " + employee2.toString());
        System.out.println("first employee's annual salary: " + employee1.getAnnualSalary());
        System.out.println("increased salary of the second worker: " + employee2.raiseSalary(200));
        System.out.println("full name of the second worker: " + employee2.getName());

        // Author and Book classes
        System.out.println("\n*********************************");
        System.out.println("Author and Book classes");
        System.out.println("*********************************\n");

        Author[] authors = new Author[2];
        authors[0] =  new Author("John", "qwert123@mail.com", 'm');
        authors[1] =  new Author("Tom", "qwert12345@mail.com", 'f');

        Book book = new Book("Book", authors, 200.0, 1);

        System.out.println("book1: " + book);
        System.out.println("the names of the authors of the book1: " + book.getAuthorNames());

        // MyPoint
        System.out.println("\n*********************************");
        System.out.println("MyPoint class");
        System.out.println("*********************************\n");

        MyPoint point1 = new MyPoint(4.0,8.0);
        MyPoint point2 = new MyPoint(1.0,4.0);
        MyPoint point3 = new MyPoint(3.0,4.0);

        System.out.println("point1: " + point1);
        System.out.println("point2: " + point2);
        System.out.println("point3: " + point3);
        System.out.println("distance from point1 to (1, 4): " + point1.distance(1.0,4.0));
        System.out.println("distance from point1 to point2: " + point1.distance(point2));
        System.out.println("distance from point3 to (0, 0): " + point3.distance());
        System.out.println("x-coordinate of point2: " +  point2.getXY()[0] + "; y-coordinate of point2: " + point2.getXY()[1]);

        // MyTriangle
        System.out.println("\n*********************************");
        System.out.println("MyTriangle class");
        System.out.println("*********************************\n");

        MyTriangle t1 = new MyTriangle(1.0,1.0,  3.0,5.0,  6.0,2.0);
        MyTriangle t2 = new MyTriangle(1.0,1.0,  7.0,4.0,  13.0,1.0);
        MyTriangle t3 = new MyTriangle(0.0,0.0,  0.5,Math.sqrt(3) / 2,  1.0,0.0);

        System.out.println("triangle1: " + t1);
        System.out.println("triangle1: " + t2);
        System.out.println("triangle1: " + t3);
        System.out.println("triangle1 type: " + t1.getType() + "; perimeter: " + t1.getPerimeter());
        System.out.println("triangle2 type: " + t2.getType() + "; perimeter: " + t2.getPerimeter());
        System.out.println("triangle3 type: " + t3.getType() + "; perimeter: " + t3.getPerimeter());

        // MyComplex
        System.out.println("\n*********************************");
        System.out.println("MyComplex class");
        System.out.println("*********************************\n");

        MyComplex complex1 = new MyComplex(1.0,2.0);
        MyComplex complex2 = new MyComplex(3.0,2.0);

        System.out.println("complex1: " + complex1);
        System.out.println("complex2: " + complex2);
        System.out.println("sum of complex1 and complex2: " + complex1.add(complex2));
        System.out.println("devide of complex1 by complex2: " + complex1.divide(complex2));
        System.out.println("argument of complex1: " + complex1.argument());
        System.out.println("magnitude of complex1: " + complex1.magnitude());
        System.out.println("conjugate of complex1: " + complex1.conjugate());
        System.out.println("is complex2 equal to complex (3.0, 2.0): " + complex2.equals(3.0,2.0));

        // MyPolynomial
        System.out.println("\n*********************************");
        System.out.println("MyPolynomial class");
        System.out.println("*********************************\n");

        MyPolynomial polinom1 = new MyPolynomial(3,2,1);
        MyPolynomial polinom2 = new MyPolynomial(1,2,3);
        MyPolynomial polinom3 = new MyPolynomial(1,2,3,4,5);

        System.out.println("degree of the first polynomial: " + polinom1.getDegree());
        System.out.println("degree of the second polynomial: " + polinom2.getDegree());
        System.out.println("degree of the third polynomial: " + polinom3.getDegree());
        System.out.println("first polynomial: " + polinom1);
        System.out.println("second polynomial: " + polinom2);
        System.out.println("third polynomial: " + polinom3);
        System.out.println("evaluate of the first polynomial at x = (-2): " + polinom1.evaluate(-2));
        System.out.println("evaluate of the second polynomial at x = (-2): " + polinom2.evaluate(-2));
        System.out.println("evaluate of the third polynomial at x = (-2): " + polinom3.evaluate(-2));
        System.out.println("multiplication of the first and second polynomials: " + polinom1.multiply(polinom2));
        System.out.println("the sum of the first and second polynomials: " + polinom1.add(polinom2));

        // Container and Ball
        System.out.println("\n*********************************");
        System.out.println("Container and Ball classes");
        System.out.println("*********************************\n");

        Container container = new Container(0,0,100,100);
        Ball ball = new Ball(90, 25, 5, 10, 30);
        for (int i = 0; i < 3; i++) {
            System.out.println(ball);
            System.out.println(container.collides(ball));
            ball.move();
        }
    }
}
