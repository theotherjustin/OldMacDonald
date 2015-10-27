class Farm 
{     
   //your code here
	 private Animal[] aBunchOfAnimals = new Animal[3];    
   public Farm()     {       
      aBunchOfAnimals[0] = new NamedCow("cow","Elisie","moo");           
      aBunchOfAnimals[1] = new Chick("chick","cluck","cheep");       
      aBunchOfAnimals[2] = new Pig("pig","oink");    
  }         
   public void animalSounds()    {       
     for (int nI=0; nI < aBunchOfAnimals.length; nI++)       {          
       System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound()); }
       System.out.println( "This cow's name is" + ((NamedCow)aBunchOfAnimals[0]).getName() );      
          
    } 
}
