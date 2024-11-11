public class problem15 {

    public static void main(String[] args) {

        Area obj = new Area();

       obj.setVal(10,20);

        System.out.println(obj.rect());

        


        
    }
    
}


class Area{

   private int length,width;

   int getLenght(){
    return length;
   }

   void setVal(int l,int w){
    length = l;
    width =w;

   }

   int rect(){

    int area = length*width;

    return area;

   }


}
