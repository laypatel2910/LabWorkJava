package lab_10;
class Method_overriding{
    void Display(){
        System.out.println("This is Method overriding class");
    }
}
class sub_class_of_Method_overriding extends Method_overriding{
    @Override
    void Display() {
        System.out.println("This is sub class of Method overriding class");
    }
}
public class Use_Of_Method_Overriding {
    public static void main(String[] args) {
        System.out.println("This is super class : ");
        Method_overriding m_o = new Method_overriding();
        m_o.Display();
        System.out.println("This is sub class : ");
        sub_class_of_Method_overriding s_c_o_m_o = new sub_class_of_Method_overriding();
        s_c_o_m_o.Display();
    }
}
