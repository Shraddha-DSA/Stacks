//Unlimited size unlike arrays but we can access any element directly.

//import java.util.ArrayList;
//import java.util.Stack;
import java.util.*;
import java.util.Scanner;
public class basics{
    public static void main(String[] args){
        //int[] arr = new int[5];
        //ArrayList<Integer> arr = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        /*
        st.push(1);
        st.push(3);
        st.push(5);
        st.push(7);
        //peek
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println("Size is: "+st.size());
        st.pop();
        System.out.println(st);
        System.out.println("Size is: "+st.size());
        */


        //Copy contents of one stack to another in same order
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the no of elements you want to insert: ");
        n = sc.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        //reverse order
        Stack<Integer> rst = new Stack<>();
        while(st.size()>0){
            int x1 = st.peek();
            rst.push(x1);
            st.pop();
        }
        System.out.println("Reverse Stack: "+rst);
        //Copy
        Stack<Integer> copy = new Stack<>();
        while(rst.size()>0){
            int x2 = rst.peek();
            copy.push(x2);
            rst.pop();
        }
        System.out.println("Copy Stack: "+copy);




    }
}