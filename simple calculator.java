public abstract class arithmetic {

	abstract void Operator();
	abstract void Result();
////////////Addition Operator/////////
public class addition extends arithmetic  {
        public Double a;
        public Double b;
        public int sum;


        public void Operator(){
	   System.out.println("Addition:");
   }
        public Double getadd() {
	   return a + b;
   }
       public void Result(){
       System.out.println(" Addition of numbers is : "+ sum);

   }

   }
//////Division Operator/////////
public class division {
	  public Double a;
	  public Double b;
	  public int div;
	  public void Operator(){
		   System.out.println("Division:");
	   }
	  public Double getadd() {
		   return a / b;
	   }
	  public void Result(){
	           System.out.println(" Addition of numbers is : "+ div);	   
	   
}
	   }
///////////substraction Operator///////////
public class substraction extends arithmetic {
	  public Double a;
	  public Double b;
	  public int sub;
          

           public void Operator(){
	   System.out.println("Substraction:");
  }
           public Double getadd() {
           return a - b;
}
	   public void Result(){
           System.out.println(" substraction of numbers is : "+ sub);
    }
}
////////////multiplication Operator////////////
public class multiplication extends arithmetic{
	public Double a;
	public Double b;
	public int mul;
	public void Operator(){
	   System.out.println("Multiplication");
 }
        public void Result(){
        System.out.println(" Multiplication of numbers is : "+ mul);	
	   
 }
 public Double getmult() {
	return a*b;
 }
}

public class number extends arithmetic{
	void Operator() {
	}
	void Result() {
	}
}

public class operator extends arithmetic{
	void Operator() {
	}
	void Result() {
	}
}
}

