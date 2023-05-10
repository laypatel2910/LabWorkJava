package lab_9;

public class static_block_will_be_executed_before_main_method_in_a_class {
    static{
        System.out.println("This is static block executing ");
    }
    public static void main(String[] args) {
        System.out.println("This is main method executing");
    }
}
