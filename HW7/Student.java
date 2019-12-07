public class Student{
    private String name;
    private int[] test;
    private double average;
    public static int count;
    
    
    public Student(){ //default constructor
       name="";
       test=new int [5];
       count++;
    }
    
    public Student(String nm){  //constructor for name only
       name=nm;
       test=new int [5];
       count++;
    }
    
    public Student(String nm, int[] arr){ //constructor for name and scores  (careful not to change the test array size from 5 or you won't be able to add scores later)
        name=nm;
        test=new int [5];
        for(int i=0;i<arr.length;i++)
        test[i]=arr[i];
        count++;
    }
   
   public void setName(String n){
       name=n;
   }
    
    public void setScore(int sc, int i){
        test[i]=sc;
    }
    
    public String getName(){
        return name;
    }
    
    public int getScore(int i){  //return the i'th test score of a student
        return test[i];
    }
    
    public double getTestAverage(){  //return a student's test average (careful not to average the 0's at the end of the array!!)
       int countNum=0;
       int sum=0;
    for (int i=0;i<test.length;i++)
    {  if (test[i]!=0)
       { countNum++;
           sum+=test[i];
       }
    }
        average=(double)(sum/countNum);
    return average;    
    }
     public void getStudentInfo(){  //print the student's name, their average, and all their test scores.
        System.out.println("Name: "+name);
        System.out.println("Average: "+average+"\nTest Scores: ");
        for (int i=0;i<test.length;i++)
        System.out.print(test[i]+" ");
    }
}