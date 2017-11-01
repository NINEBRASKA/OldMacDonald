class Farm 
{     
   //your code here
}
class Farm 
{     
  private Animal[] aBunchOfAnimals = new Animal[3];
  public Farm()
  {
    aBunchOfAnimals[0] = new NamedCow("Cow", "Randy", "Moo!");
    aBunchOfAnimals[1] = new Chick("Chick");
    aBunchOfAnimals[2] = new Pig("Pig", "Snort!");
  }
  public void animalSounds()
  {
    for (int nI = 0; nI < aBunchOfAnimals.length; nI++)
    {
      System.out.println( aBunchOfAnimals[nI].getType() + " goes " + aBunchOfAnimals[nI].getSound());
    }
    System.out.println( "The cow is known as " + ((NamedCow)aBunchOfAnimals[0]).getName() );
  }
}
