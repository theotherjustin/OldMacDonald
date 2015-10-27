class Chick implements Animal 
{     
     //your code here
	private String myType;     
     private String mySound1, mySound2;      
     public Chick(String type, String sound, String sound1)     {         
         myType = type;         
         mySound1 = sound; 
         mySound2 = sound1;   
     }     
     public Chick()     {         
         myType = "Chick";  
         mySound1 = "unknown";
         mySound2 = "unknown";     
          
     }      
     public String getSound(){
     	if ((int)(Math.random()*2)==0)
     		return mySound1;
     		else return mySound2;
     }     
     public String getType(){return myType;} 
}
