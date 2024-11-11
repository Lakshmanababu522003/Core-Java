import java.util.Scanner;

class parent{
    int tamil;
    int eng;
    int maths;
    int science;
    int ss;

}

class sub extends parent{
    int total,avg;

    void getData(int tamil, int eng, int maths, int science, int ss){
        this.tamil = tamil;
        this.eng = eng;
        this.maths = maths;
        this.science = science;
        this.ss = ss;
         total = tamil+eng+maths+science+ss;

         avg = total/5;
    
    }

   


}

class display extends sub{

    void display1(){
        System.out.println(this.total +" " + this.avg);
    }
}


public class problem25 {

    public static void main(String[] args) {

        display obj = new display();

        Scanner s1 = new Scanner(System.in);

        obj.getData(80,75,73,50,100);

        obj.display1();
        
    }
    
}
