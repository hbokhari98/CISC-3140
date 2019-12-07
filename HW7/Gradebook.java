public class Gradebook{
    public Student[] gradebook ;
    public double classAvg;
    public int classMin, classMax;
    
    
    
    public Gradebook(int n){ // constructor for n students
        gradebook = new Student[n];
    }
    
    public double getClassAverage(int t){  //calculate the class average for the t'th test
       double sum = 0;
       for (int i=0; i<gradebook.length; i++)
       sum+= gradebook[i].getScore(t);
       classAvg=(sum/gradebook.length);
    return classAvg;
    }
    
    public int getClassMin(int t){  //return the lowest score on the t'th test                                        
        int classMin = gradebook[0].getScore(t);
        for (int j=0; j<gradebook.length; j++)
        {
            if (gradebook[j].getScore(t)<classMin)
            classMin=gradebook[j].getScore(t);
        }
    return classMin;
    }
        
    public int getClassMax(int t){  //return the highest score on the t'th test
        int classMax = gradebook[0].getScore(t);
        for (int h=0; h<gradebook.length; h++)
        {
            if (gradebook[h].getScore(t)>classMax)
            classMax=gradebook[h].getScore(t);
        }
    return classMax;
    }
    
   
    
    
}