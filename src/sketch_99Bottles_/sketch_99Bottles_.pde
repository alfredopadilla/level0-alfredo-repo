void setup(){
for(int i=99; i>0; i--){
   if(i==2){
    
    System.out.println(i+" Bottles of beer on the wall, " + i + " bottles of beer.");
  System.out.println( "Take one down and pass it around," + (i-1) + " bottle of beer on the wall.");
  System.out.println(" ");
  }

  else if(i==1){
   System.out.println(i+" Bottle of beer on the wall, " + i + " bottle of beer.");
  System.out.println( "Take one down and pass it around," + " no more bottles of beer on the wall.");
  System.out.println(" ");
  System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
  System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
  
  } 
  else{
  
  System.out.println(i+" Bottles of beer on the wall, " + i + " bottles of beer");
  System.out.println( "Take one down and pass it around," + (i-1) + " bottles of beer on the wall.");
  System.out.println(" ");
  }
 
}
}

void draw(){
  
  
  
}