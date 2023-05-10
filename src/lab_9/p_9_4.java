/*
Create a class “Rectangle” that would contain length and width as an instance variable and count
as a static variable. Define constructors [constructor overloading (default, parameterized and copy)]
to initialize variables of objects. Define methods to find area and to display variables’ value of objects
which are created. [Note: define initializer block, static initializer block and the static variable and method.
Also demonstrate the sequence of execution of initializer block and static initialize block]
*/
package lab_9;
class Rectangle{
    float length;
    float width;
    static float count;
    static {
        count = 0;
        System.out.println("This is a static block");
    }
    {
        count++;
        System.out.println("This is a non static block");
    }
    Rectangle(){

    }
    Rectangle(float length,float width){
        this.length = length;
        this.width = width;
    }
    Rectangle(Rectangle r){
        length = r.length;
        width = r.width;
    }
    void find_area(){
        double Rectangle = length * width;
        System.out.println("area of Rectangle is : " + Rectangle);
    }
    void display(){
        System.out.println(length);
        System.out.println(width);
        System.out.println(count);
    }

}
public class p_9_4 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.display();
        Rectangle r1 = new Rectangle(10,25);
        r1.find_area();
        r1.display();
        Rectangle r2 = new Rectangle(r1);
        r2.find_area();
        r2.display();

    }
}
