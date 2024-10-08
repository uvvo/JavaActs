
import java.util.Scanner; //import the Scanner class 
abstract class Project
{
    void question()
    
    {
        Scanner scan = new Scanner(System.in);
        char answer;
        int score = 0;
        for(int count = 1; count <= 30; count++)
        {
            switch(count)
            {
                case 1:
                    System.out.print("\u000C");
                    System.out.println("Note: The JavaQ Test Game is multiple-choice and questions require you to identify the correct answer.");
                    System.out.println("\nQuestion 1");
                    System.out.println("         Who invented Java Programming?"); //question
                    System.out.println("            a. Guido van Rossum  b. James Gosling");
                    System.out.println("            c. Dennis Ritchie    d. Bjarne Stroustrup");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'b')
                    {
                        score++;
                    }
                    break;
                
                case 2:
                    System.out.print("\u000C");
                    System.out.println("Question 2");
                    System.out.println("         Which component is used to compile, debug and execute the java programs?"); //question
                    System.out.println("            a. JRE  b. JIT");
                    System.out.println("            c. JDK  d. JVM");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'c')
                    {
                        score++;
                    }
                    break;
                
                case 3:
                    System.out.print("\u000C"); 
                    System.out.println("Question 3");
                    System.out.println("         Which one of the following is not a Java feature?"); //question
                    System.out.println("            a. Object-oriented   b.  Use of pointers");
                    System.out.println("            c. Portable          d.  Dynamic and Extensible");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'b')
                    {
                        score++;
                    }
                    break;
                
                case 4:
                    System.out.print("\u000C"); 
                    System.out.println("Question 4");
                    System.out.println("         Which of these cannot be used for a variable name in Java?"); //question
                    System.out.println("            a. identifier & keyword   b. identifier");
                    System.out.println("            c. keyword                d. none of the mentioned ");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'c')
                    {
                        score++;
                    }
                    break;
                
                case 5:
                    System.out.print("\u000C"); 
                    System.out.println("Question 5");
                    System.out.println("         Which of the following is not an OOPS concept in Java?"); //question
                    System.out.println("            a. Compilation    b. Inheritance");
                    System.out.println("            c. Encapsulation  d. Polymorphism");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'a')
                    {
                        score++;
                    }
                    break;
                
                case 6:
                    System.out.print("\u000C");
                    System.out.println("Question 6");
                    System.out.println("         What is the extension of java code files?"); //question
                    System.out.println("            a. js    b. class");
                    System.out.println("            c. txt   d. java");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'd')
                    {
                        score++;
                    }
                    break;
                
                case 7:
                    System.out.print("\u000C");
                    System.out.println("Question 7");
                    System.out.println("         Which one of the following is not an access modifier?"); //question
                    System.out.println("            a. Private    b. Void");
                    System.out.println("            c. Protected  d. Public");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'b')
                    {
                        score++;
                    }
                    break;
                
                case 8:
                    System.out.print("\u000C"); 
                    System.out.println("Question 8");
                    System.out.println("         Which of the following can be operands of arithmetic operators?"); //question
                    System.out.println("            a. Characters  b. Both Numeric & Characters ");
                    System.out.println("            c. BoNumeric   d. Boolean");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'b')
                    {
                        score++;
                    }
                    break;
                
                case 9:
                    System.out.print("\u000C"); 
                    System.out.println("Question 9");
                    System.out.println("         Modulus operator, %, can be applied to which of these?"); //question
                    System.out.println("            a. Floating – point numbers  b. None of the mentioned");
                    System.out.println("            c. Integers                  d. Both Integers and floating – point numbers");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'd')
                    {
                        score++;
                    }
                    break;
                
                case 10:
                    System.out.print("\u000C"); 
                    System.out.println("Question 10");
                    System.out.println("         An expression involving byte, int, and literal numbers is promoted to which of these?"); //question
                    System.out.println("            a. float   b. long");
                    System.out.println("            c. int     d. byte");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'c')
                    {
                        score++;
                    }
                    break;
                    
                case 11:
                    System.out.print("\u000C"); 
                    System.out.println("Question 11");
                    System.out.println("         Which statement is not true in java language?  "); //question
                    System.out.println("            a. A private member of a class cannot be accessed by the methods of the same class.");
                    System.out.println("            b. A protected member of a class can be accessed from its derived class..");
                    System.out.println("            c. A private member of a class cannot be accessed from its derived class.");
                    System.out.println("            d. A public member of a class can be accessed in all the packages.");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'a')
                    {
                        score++;
                    }
                    break;
                
                case 12:
                    System.out.print("\u000C"); 
                    System.out.println("Question 12");
                    System.out.println("         is used to find and fix bugs in the Java programs. "); //question
                    System.out.println("            a. JDB");
                    System.out.println("            b. JVM");
                    System.out.println("            c. JDK");
                    System.out.println("            d. JRE");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'a')
                    {
                        score++;
                    }
                    break;
                    
                case 13:
                    System.out.print("\u000C"); 
                    System.out.println("Question 13");
                    System.out.println("         Which of the following is true about the anonymous inner class?"); //question
                    System.out.println("            a. It has a fixed class name");
                    System.out.println("            b. Objects can't be created");
                    System.out.println("            c. It has no class name");
                    System.out.println("            d. It has only methods");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'c')
                    {
                        score++;
                    }
                    break;
                    
                case 14:
                    System.out.print("\u000C"); 
                    System.out.println("Question 14");
                    System.out.println("         Which package contains the Random class?"); //question
                    System.out.println("            a. java.io package");
                    System.out.println("            b. java.awt package");
                    System.out.println("            c. java.lang package");
                    System.out.println("            d. java.util package");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'd')
                    {
                        score++;
                    }
                    break;
                    
                case 15:
                    System.out.print("\u000C"); 
                    System.out.println("Question 15");
                    System.out.println("         Which of the following is a reserved keyword in Java?"); //question
                    System.out.println("            a. object");
                    System.out.println("            b. strictfp");
                    System.out.println("            c. system");
                    System.out.println("            d. maine");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'b')
                    {
                        score++;
                    }
                    break;
                    
                case 16:
                    System.out.print("\u000C"); 
                    System.out.println("Question 16");
                    System.out.println("         In java, jar stands for"); //question
                    System.out.println("            a. Java Application Resource");
                    System.out.println("            b. Java Application Runner ");
                    System.out.println("            c. Java Archive Runner");
                    System.out.println("            d. None of the above");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'c')
                    {
                        score++;
                    }
                    break;
                    
                case 17:
                    System.out.print("\u000C"); 
                    System.out.println("Question 17");
                    System.out.println("         How many threads can be executed at a time?"); //question
                    System.out.println("            a. Only main (main() method) thread");
                    System.out.println("            b. two threads");
                    System.out.println("            c. Only one thread");
                    System.out.println("            d. Multiple threads");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'd')
                    {
                        score++;
                    }
                    break;
                    
                case 18:
                    System.out.print("\u000C"); 
                    System.out.println("Question 18");
                    System.out.println("         Java program processing always starts with main() method"); //question
                    System.out.println("            a. False");
                    System.out.println("            b. True");
                    System.out.println("            c. All of the above");
                    System.out.println("            d. None of the above");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'b')
                    {
                        score++;
                    }
                    break;
                    
                case 19:
                    System.out.print("\u000C"); 
                    System.out.println("Question 19");
                    System.out.println("         On which platforms Java runs?"); //question
                    System.out.println("            a. UNIX");
                    System.out.println("            b. Windows");
                    System.out.println("            c. Mac OS");
                    System.out.println("            d. All of these");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'd')
                    {
                        score++;
                    }
                    break;
                    
                 case 20:
                    System.out.print("\u000C"); 
                    System.out.println("Question 20");
                    System.out.println("         Which one of the following is Equality operator in Java?"); //question
                    System.out.println("            a. !=");
                    System.out.println("            b. +=");
                    System.out.println("            c. >=");
                    System.out.println("            d. <=");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'a')
                    {
                        score++;
                    }
                    break;
                    
                case 21:
                    System.out.print("\u000C"); 
                    System.out.println("Question 21");
                    System.out.println("         Which primitive type is for integers?"); //question
                    System.out.println("            a. boolean");
                    System.out.println("            b. double");
                    System.out.println("            c. char");
                    System.out.println("            d. long");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'd')
                    {
                        score++;
                    }
                    break;
                    
                case 22:
                    System.out.print("\u000C"); 
                    System.out.println("Question 22");
                    System.out.println("         What are the 4 basic components of a computer system?"); //question
                    System.out.println("            a. Processor, RAM, ROM and the bus");
                    System.out.println("            b. Processor, RAM, I/O and Windows");
                    System.out.println("            c. Processor, hard drive, VGA port and USB");
                    System.out.println("            d. Processor, Main Memory, Secondary Memory and I/O");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'd')
                    {
                        score++;
                    }
                    break;
                    
                case 23:
                    System.out.print("\u000C"); 
                    System.out.println("Question 23");
                    System.out.println("         What does a comment look like in Java?"); //question
                    System.out.println("            a. \\comment");
                    System.out.println("            b. //comment");
                    System.out.println("            c. ==comment");
                    System.out.println("            d. /=comment");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'b')
                    {
                        score++;
                    }
                    break;
                    
                 case 24:
                    System.out.print("\u000C"); 
                    System.out.println("Question 24");
                    System.out.println("         What is a good example of an input device?"); //question
                    System.out.println("            a. monitor");
                    System.out.println("            b. speakers");
                    System.out.println("            c. webcam");
                    System.out.println("            d. printer");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'c')
                    {
                        score++;
                    }
                    break;
                    
                case 25:
                    System.out.print("\u000C"); 
                    System.out.println("Question 25");
                    System.out.println("         What is a good example of an output device?"); //question
                    System.out.println("            a. headphones");
                    System.out.println("            b. mouse");
                    System.out.println("            c. microphone");
                    System.out.println("            d. keyboard");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'a')
                    {
                        score++;
                    }
                    break;
                    
                case 26:
                    System.out.print("\u000C"); 
                    System.out.println("Question 26");
                    System.out.println("         Begins and ends the body of class and method?"); //question
                    System.out.println("            a. []");
                    System.out.println("            b. {}");
                    System.out.println("            c. :");
                    System.out.println("            d. {{");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'b')
                    {
                        score++;
                    }
                    break;
                    
                case 27:
                    System.out.print("\u000C"); 
                    System.out.println("Question 27");
                    System.out.println("         What is byte code in Java?"); //question
                    System.out.println("            a. Code generated by a Java compiler");
                    System.out.println("            b. Code generated by a Java Virtual Machine");
                    System.out.println("            c. Block of code written inside a class");
                    System.out.println("            d. Name of Java source code file");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'a')
                    {
                        score++;
                    }
                    break;
                    
                case 28:
                    System.out.print("\u000C"); 
                    System.out.println("Question 28");
                    System.out.println("         Which of these is returned by operator '&'?"); //question
                    System.out.println("            a. Boolean");
                    System.out.println("            b. Float");
                    System.out.println("            c. Character");
                    System.out.println("            d. Integer");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'a')
                    {
                        score++;
                    }
                    break;
                    
                case 29:
                    System.out.print("\u000C"); 
                    System.out.println("Question 29");
                    System.out.println("         Data type long literals are appended by?"); //question
                    System.out.println("            a. Long");
                    System.out.println("            b. Lowercase L");
                    System.out.println("            c. Uppercase L");
                    System.out.println("            d. Both A and B");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'd')
                    {
                        score++;
                    }
                    break;
                    
                case 30:
                    System.out.print("\u000C"); 
                    System.out.println("Question 30");
                    System.out.println("         Java language was initially called as"); //question
                    System.out.println("            a. Sumatra");
                    System.out.println("            b. Pine ");
                    System.out.println("            c. Oak");
                    System.out.println("            d. C++");
                    answer = scan.next(".").charAt(0);
                    if(answer == 'c')
                    {
                        score++;
                    }
                    break;
            }
            
        }
        System.out.println("\nYour score is:" + score);
    }
}
      class quiz extends Project
     {   
}
public class Projectdisplay
{
    public static void main()
    {
        quiz a = new quiz();
        a.question();
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\nDo you want to try again?[y/n]");
        char ulit;
        ulit = scan.next(".").charAt(0);
        while(ulit == 'y')
        {
            System.out.print("\u000C"); 
            a.question(); 
            
            System.out.println("\nDo you want to try again?[y/n]");
            ulit = scan.next(".").charAt(0);
        }
    }
}