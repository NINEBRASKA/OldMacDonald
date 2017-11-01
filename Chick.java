class Chick implements Animal 
{    
  private String myType;
  private String mySound;
  public Chick(String type)
  {
    myType = type;
    mySound = getSound();
  }
  public Chick(){}
  public String getSound()
  {
    if((Math.random() * 2) < 1 )
    {
      return "Cluck!";
    }
    else return "Quack!";
  }
  public String getType(){return myType;}
}
