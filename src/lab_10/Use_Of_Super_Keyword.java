package lab_10;

class Multilevel_Inheritance{
    Multilevel_Inheritance(){
        System.out.println("This is multilevel inheritance");
    }
    Multilevel_Inheritance(int i){
        System.out.println("This is multilevel inheritance and value of i is " + i);
    }
}
class First_sub_class_of_multilevel_inheritance extends Multilevel_Inheritance {
    First_sub_class_of_multilevel_inheritance(){
        System.out.println("This is first sub class of multilevel inheritance");
    }
    First_sub_class_of_multilevel_inheritance(int i,int j){
        super(i);
        System.out.println("This is first sub class of multilevel inheritance and value of i is " + i +" and value of j is" + j);
    }
}
class Second_sub_class_of_multilevel_inheritance extends First_sub_class_of_multilevel_inheritance{
    Second_sub_class_of_multilevel_inheritance(){
        System.out.println("This is second sub class of multilevel inheritance");
    }
    Second_sub_class_of_multilevel_inheritance(int i,int j,int k){
        super(i,j);
        System.out.println("This is second sub class of multilevel inheritance and value of i is " + i +" and value of j is" + j+" and value of k is" + k);
    }
}
public class Use_Of_Super_Keyword {
    public static void main(String[] args) {
        Multilevel_Inheritance M_I = new Multilevel_Inheritance(1);
        First_sub_class_of_multilevel_inheritance F_M_I = new First_sub_class_of_multilevel_inheritance(10,20);
        Second_sub_class_of_multilevel_inheritance S_M_I = new Second_sub_class_of_multilevel_inheritance(100,200,300);
    }
}
