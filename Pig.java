class Pig implements Animal 
{     
     //your code here
	private String myType;     
     private String mySound;      
     public Pig(String type, String sound)     {         
         myType = type;         
         mySound = sound;     
     }     
     public Pig()     {         
         myType = "Piggy";         
         mySound = "Oink";     
     }      
     public String getSound(){return mySound;}     
     public String getType(){return myType;} 
}
