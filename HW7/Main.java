/**
 *  
 * 1  In the Student class, complete the three constructors, one that will take a String to initialize the student name, and an int array 
 *    that will initialize their test scores, a constructor that will initialize just the name and a blank array of  5 scores, and a
 *    default constructor that will set the string to "" and the array of zeroes.
 * 2  Increment the static variable for the student count every time a constructor is called.
 * 3  Complete the setter and getter methods for student name and test score.
 * 4  Complete the getTestAverage method that will calculate the avarage for each student.
 * 5  Complete the getStudentInfo method that will print the student's name, their average, and all their test scores.
 * 6  Complete the constructor of the gradebook class that takes one int variable which sets the number of students in the class.
 * 7  In the gradebook class, complete the getClassAverage method that will calculate the class average for each test. Also complete the getClassMin and
 *    getClassMax methods to find the high and low scores on each test. 
 * 8  In the main method, instantiate a new gradebook. Add  at least 3 students to it.  Assign them names and two test scores each
 *    by using each of the different constructors and appropriate setter methods.
 * 9  Use your getTestAverage method to find the avarage of each student. Use the getClassAverage method
 *    to find the class average for each test. Get the max and min grade for each test.
 * 10 Add a third test grade for each student.  Recalculate their averages, the class average, and the max and min for this test.
 * 
 */

public class Main {

    public static void main(String[] args) {
        
        Gradebook grades=new Gradebook(3);
        Student first=new Student("Joe");
        
        int [] sallyScores= new int[] {90,100};
        Student second=new Student("Sally",sallyScores);
        
        Student third =new Student();
        third.setName("Bob");
        
        grades.gradebook[0]=first;
        grades.gradebook[1]=second;
        grades.gradebook[2]=third;
        
        first.setScore(70,0);first.setScore(80,1);System.out.println("Joe's average: "+first.getTestAverage());
        System.out.println("Sally's average: "+second.getTestAverage());
        third.setScore(100,0);third.setScore(100,1);System.out.println("Bob's average: "+third.getTestAverage());
        System.out.println("Class Average: "+grades.getClassAverage(0));
        System.out.println("Class Min: "+grades.getClassMin(0));
        System.out.println("Class Max: "+grades.getClassMax(0));
    System.out.println();
        first.setScore(90,2);System.out.println("Joe's average: "+first.getTestAverage());
        second.setScore(80,2);System.out.println("Sally's average: "+second.getTestAverage());
        third.setScore(70,2);System.out.println("Bob's average: "+third.getTestAverage());
        System.out.println("Class Average: "+grades.getClassAverage(2));
        System.out.println("Class Min: "+grades.getClassMin(2));
        System.out.println("Class Max: "+grades.getClassMax(2));
       
        
        
    }
}
