class ConstructorChainingExample{
String name;
String modelno;
int engineno;
int vehicleno;
     public ConstructorChainingExample( String name,String modelno){

     this.name=name;
     this.modelno=modelno;

    }

    public ConstructorChainingExample(int engineno,int vehicleno){
    this.engineno=engineno;
    this.vehicleno=vehicleno;
    this("Bmw","m3");
    System.out.println(engineno);
    System.out.println(vehicleno);
	System.out.println(name);
     System.out.println(modelno);
    }


  public static void main(String[] args){
   ConstructorChainingExample cdd=new ConstructorChainingExample(1234,123456);
   
  }

}