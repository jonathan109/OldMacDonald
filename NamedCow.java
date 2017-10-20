class NamedCow extends Cow

{
  private String myName;
  public NamedCow(String typeA, String name, String soundA)
  {
    myName = name;
    myType = typeA;
    mySound = soundA;
  }
  public NamedCow()
  {
    myName = "unknown";
  }
  public String getName()
  {
    return myName;
  }
}