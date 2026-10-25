public class MainTest { 

    public static void main(String[] args) { 

        if (Main.add(2, 3) != 5) { 

            throw new AssertionError("Test 1 failed"); 

        } 

 

        if (Main.add(10, 20) != 30) { 

            throw new AssertionError("Test 2 failed"); 

        } 

 

        if (Main.add(-5, 5) != 0) { 

            throw new AssertionError("Test 3 failed"); 

        } 

 

        System.out.println("All 3 tests passed!"); 

    } 

}
