

//int pieces[][] = new int[3][3];
PImage p1,p2;

Stuff[][] array = new Stuff[3][3];


void setup(){
  loadA();
  size(601,700);

  textSize(32);
  textMode(CENTER);

  p1 = loadImage("https://www.washingtonpost.com/graphics/politics/2016-election/trump-lies/images/trumplies_leadcutout_small.png");
  p2 = loadImage("http://static.guim.co.uk/sys-images/Guardian/Pix/pictures/2016/1/12/1452598832111/HillaryClintonR.png");
  p1.resize(150,150); p2.resize(150,150);
  
}


void draw(){
  background(0);
  if(findWinner()==1){
    background(300);
    text("Donald Wins!!!", 300,350);
    System.out.println("P1 Wins!!!");
  }
  else if(findWinner()==2){
    background(300);
    text("Hillary Wins!!!", 300,350);
    System.out.println("P2 Wins!!!");
  }
  else if(findWinner()==3){
    background(300);
    text("You both suck...", 300,350);
  }
  else{
    board();
  }
}

void board(){
  for(int y=0; y<600; y+=200){
    for(int x=0; x<width; x+=200){
      rect(x,y+100,200,200);
      placePiece();
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
   
  // System.out.println(Arrays.deepToString(array));
  if(array[yBox(y)][xBox(x)].getTurn()==0){
    loadPieces(x,y);
    turn();
  }
}

boolean f=false;
boolean turn(){
   if(f){
     f=false;
     return true;
   }
   else{
     f=true;
     return false;
   }
}

void loadPieces(int xPos, int yPos){
  int x =0; x= xBox(xPos);
  int y = yBox(yPos);
  System.out.println("yb: " + y + " xb: " + x);
  turn();
   if(turn()&&array[y][x].getTurn()==0){
     array[y][x]= new Stuff(x,y,1); 
   }
   else if(array[y][x].getTurn()==0) {
     array[y][x]= new Stuff(x,y,2); 
   }
}

void placePiece(){
  imageMode(CENTER);
  for(int y=0; y<3; y++){
    for(int x=0; x<3; x++){
      if(array[y][x].getTurn()==1){
         image(p1,array[y][x].getX(),array[y][x].getY());
      }
      else if(array[y][x].getTurn()==2){
         image(p2,array[y][x].getX(),array[y][x].getY());
      }
    }
  }
}

int findWinner(){
    if(array[0][0].getTurn()==1 && array[0][1].getTurn()==1 && array[0][2].getTurn()==1){
      return 1;
    }
    else if(array[1][0].getTurn()==1 && array[1][1].getTurn()==1 && array[1][2].getTurn()==1){
      return 1;
    }
    else if(array[2][0].getTurn()==1 && array[2][1].getTurn()==1 && array[2][2].getTurn()==1){
      return 1;
    }
    else if(array[0][0].getTurn()==1 && array[1][1].getTurn()==1 && array[2][2].getTurn()==1){
      return 1;
    }
    else if(array[0][2].getTurn()==1 && array[1][1].getTurn()==1 && array[2][0].getTurn()==1){
      return 1;
    }
    else if(array[0][0].getTurn()==1 && array[1][0].getTurn()==1 && array[2][0].getTurn()==1){
      return 1;
    }
    else if(array[0][1].getTurn()==1 && array[1][1].getTurn()==1 && array[2][1].getTurn()==1){
      return 1;
    }
    else if(array[0][2].getTurn()==1 && array[1][2].getTurn()==1 && array[2][2].getTurn()==1){
      return 1;
    }


   if(array[0][0].getTurn()==2 && array[0][1].getTurn()==2 && array[0][2].getTurn()==2){
      return 2;
    }
    else if(array[1][0].getTurn()==2 && array[1][1].getTurn()==2 && array[1][2].getTurn()==2){
      return 2;
    }
    else if(array[2][0].getTurn()==2 && array[2][1].getTurn()==2 && array[2][2].getTurn()==2){
      return 2;
    }
    else if(array[0][0].getTurn()==2 && array[1][1].getTurn()==2 && array[2][2].getTurn()==2){
      return 2;
    }
    else if(array[0][2].getTurn()==2 && array[1][1].getTurn()==2 && array[2][0].getTurn()==2){
      return 2;
    }
    else if(array[0][0].getTurn()==2 && array[1][0].getTurn()==2 && array[2][0].getTurn()==2){
      return 2;
    }
    else if(array[0][1].getTurn()==2 && array[1][1].getTurn()==2 && array[2][1].getTurn()==2){
      return 2;
    }
    else if(array[0][2].getTurn()==2 && array[1][2].getTurn()==2 && array[2][2].getTurn()==2){
      return 2;
    }
    
    for(int y=0; y<3; y++){
      for(int x=0; x<3; x++){
        if(array[y][x].getTurn()==0){
          return 0;
        }
      }
    }
    
  return 3;
}