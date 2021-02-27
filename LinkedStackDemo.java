public class LinkedStackDemo {
    public static void main(String a[]) {
        Stack <Integer> s = new LinkedStack<Integer>();
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);

        System.out.println("Size of stack: " + s.size());

        //Iterate through stack
        System.out.println("Stack contains following items till this moment:");
        for(Integer i : s)
            System.out.println(i);
    }
}