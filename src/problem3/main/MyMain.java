/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student
import problem3.myqueue.MyPriorityQueue;
import problem5.student.Student;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {
    public static void main(String[] args) {
        Student student1 = new Student("abhishek","btech",1);
        Student student2 = new Student("atul","bca",2);
        Student student3 = new Student("alok","ba",3);
        Student student4 = new Student("adarsh","bpharma",4);
        Student student5 = new Student("ayush","bcom",5);
        MyPriorityQueue myPriorityQueue=new MyPriorityQueue();
        myPriorityQueue.enqueue(student1);
        myPriorityQueue.enqueue(student2);
        myPriorityQueue.enqueue(student3);
        myPriorityQueue.enqueue(student4);
        myPriorityQueue.enqueue(student5);
        System.out.println("Displaying all students: ");
        myPriorityQueue.displayAll();
        myPriorityQueue.dequeue();
        System.out.println("After  once using dequeue method : ");
        myPriorityQueue.displayAll();
        System.out.print("After once using peek method : ");
        myPriorityQueue.peek();
        myPriorityQueue.displayAll();


    }
}