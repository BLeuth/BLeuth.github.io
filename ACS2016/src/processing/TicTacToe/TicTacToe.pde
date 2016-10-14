import java.util.*;

int pieces[][] = new int[3][3];
PImage p1,p2;


void setup(){
  size(600,700);
  imageMode(CENTER);
  p1 = loadImage("https://www.washingtonpost.com/graphics/politics/2016-election/trump-lies/images/trumplies_leadcutout_small.png");
  p2 = loadImage("http://static.guim.co.uk/sys-images/Guardian/Pix/pictures/2016/1/12/1452598832111/HillaryClintonR.png");
  p1.resize(200,200); p2.resize(200,200);
  
}

void draw(){
  board();
  placePiece(mouseX,mouseY);
}

void board(){
  for(int y=0; y<600; y+=200){
    for(int x=0; x<width; x+=200){
      rect(x,y+100,200,200);
    }
  }
}

int yBox(int y){
  if(y>100&&y<300){
    return 0;
  }
  else if(y>300&&y<500){
    return 1;
  }
  else if(y>500&&y<700){
    return 2; 
  }
  return 0;
}

int xBox(int x){
  if(x>0&&x<200){
    return 0;
  }
  else if(x>200&&x<400){
    return 1;
  }
  else if(x>400&&x<600){
    return 2; 
  }
  return 0;
}


void mouseClicked(){
  int x=mouseX;
  int y=mouseY;
   loadPieces(x,y);
   System.out.println(Arrays.deepToString(pieces));
   turn();
   
}

int f=0;
boolean turn(){
   f++;
   if(f%2==0){
     return true;
   }
   else{
     return false;
   }
}

void loadPieces(int xPos, int yPos){
  int x =0; x= xBox(xPos);
  int y = yBox(yPos);
  System.out.println("yb: " + y + " xb: " + x);
  turn();
   if(turn()&&pieces[y][x]==0){
     pieces[y][x]=1; 
   }
   else {
     pieces[y][x]=2; 
   }
}

void placePiece(int xPos, int yPos){
   for(int y=0; y<3; y++){
     for(int x=0; x<3; x++){
       if(pieces[y][x]==1){
         if(xPos==0){
           image(p1,150,250);
         }
       }
     }
   }
}