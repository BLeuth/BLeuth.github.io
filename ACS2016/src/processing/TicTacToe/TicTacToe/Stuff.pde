public class Stuff{
  int x,y,t;
   public Stuff(int xPos, int yPos, int turn){
     x=xPos; y=yPos; t=turn;
   }
   public int getX(){
     if(x==0){
       return 100;
     }
     else if(x==1){
       return 300; 
     }
     else{
       return 500;
     } 
   }
   public int getY(){
     if(y==0){
       return 200;
     }
     else if(y==1){
       return 400; 
     }
     else{
       return 600;
     }
   }
   public int getTurn(){
     return t; 
   }
}

void loadA(){
  for(int y=0; y<3; y++){
    for(int x=0; x<3; x++){
       array[y][x]=new Stuff(0,0,0);
    }
  }
}