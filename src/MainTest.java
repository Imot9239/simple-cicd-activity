public class Main { 

    public static int add(int a, int b) { 

        return a + b; 

    } 

 

    public static void main(String[] args) { 

        System.out.println("Sum: " + add(10, 20)); 

    } 

} 

5. Click Commit changes and commit the file to the main branch. 

Step 3. Create the automated test 

Click Add file → Create new file again. 

Enter src/MainTest.java. 

Paste the following code. 

 

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
