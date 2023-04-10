package lab_10;

// Single Inheritance
class single_inheritance {
    single_inheritance(){
        System.out.println("This is single inheritance");
    }
}

class sub_class_of_single_inheritance extends single_inheritance{
    sub_class_of_single_inheritance(){
        System.out.println("This is sub class of single inheritance");
    }
}
// Multilevel Inheritance
class multilevel_inheritance{
    multilevel_inheritance(){
        System.out.println("This is multilevel inheritance");
    }
}
class first_sub_class_of_multilevel_inheritance extends multilevel_inheritance {
    first_sub_class_of_multilevel_inheritance(){
        System.out.println("This is first sub class of multilevel inheritance");
    }
}
class second_sub_class_of_multilevel_inheritance extends first_sub_class_of_multilevel_inheritance{
    second_sub_class_of_multilevel_inheritance(){
        System.out.println("This is second sub class of multilevel inheritance");
    }
}
// Hierarchical Inheritance
class hierarchical_inheritance {
    hierarchical_inheritance(){
        System.out.println("This is hierarchical inheritance");
    }
}
class first_sub_class_of_hierarchical_inheritance extends hierarchical_inheritance {
    first_sub_class_of_hierarchical_inheritance(){
        System.out.println("This is first sub class of hierarchical inheritance");
    }
}
class second_sub_class_of_hierarchical_inheritance extends hierarchical_inheritance{
    second_sub_class_of_hierarchical_inheritance(){
        System.out.println("This is second sub class of hierarchical inheritance");
    }
}
public class single_inheritance_multilevel_inheritance_and_hierarchical_inheritance {
    public static void main(String[] args) {
        // Single Inheritance
        System.out.println("Single Inheritance");
        single_inheritance s_i = new single_inheritance();
        sub_class_of_single_inheritance  s_c_o_s_i = new sub_class_of_single_inheritance ();
        // Multilevel Inheritance
        System.out.println("Multilevel Inheritance");
        multilevel_inheritance m_i = new multilevel_inheritance();
        first_sub_class_of_multilevel_inheritance f_m_i = new first_sub_class_of_multilevel_inheritance();
        second_sub_class_of_multilevel_inheritance s_m_i = new second_sub_class_of_multilevel_inheritance();
        // Hierarchical Inheritance
        System.out.println("Hierarchical Inheritance");
        hierarchical_inheritance h_i = new hierarchical_inheritance();
        first_sub_class_of_hierarchical_inheritance f_h_i = new first_sub_class_of_hierarchical_inheritance();
        second_sub_class_of_hierarchical_inheritance s_h_i = new second_sub_class_of_hierarchical_inheritance();

    }
}
