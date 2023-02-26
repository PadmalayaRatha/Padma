public class Test1 {
    static{
        System.out.println("Am another  inside static block.");//4

    }


    static{
        System.out.println("Am inside static block.");//1
        Test1 tt = new Test1();
    }

    {
        System.out.println("Am inside nonstatic block");//2
    }
    {
        System.out.println("Am inside another nonstatic block");//3
    }
    public static void main(String[] args){
        System.out.println("Am inside main method.");//5
    }
}
