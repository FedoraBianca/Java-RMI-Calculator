import java.rmi.*;
import java.util.*;
import java.io.*;


public class CalcClientComponent 
{
    private static final String host = "localhost";
    
    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) 
    {
        try 
        { 
            //We obtain a reference to the object from the registry and next,
            //it will be typecasted into the most appropriate type.
            ICalc calc = (ICalc) Naming.lookup("rmi://" 
                    + host + "/Calc");
            //Next, we will use the above reference to invoke the remote
            //object method.
            
            Scanner sc = new Scanner(System.in);
            String op = new String("");
            String input = new String("");
            double a,b;

            
            do{
               System.out.println("Alege un numar: \n  0 - iesire \n  1 - adunare \n  2 - scadere \n  3 - inmultire \n  4 - impartire \n  5 - inversare \n  6 - ridicare la putere \n  7 - factorial \n  8 - radacina patrata \n  9 - M+(rezultatul curent se adauga la val. memoriei) \n 10 - M-(rezultatul curent se scade din val. memoriei) \n 11 - MS (rezultatul curent devine val. memoriei) \n 12 - MR(valoarea memoriei devine rezultatul curent) \n 13 - MC(valoarea memoriei este reinitializata cu 0) \n");
                
                op =sc.next();
                
                switch (op) {
                case "0":
                    System.out.println("Ai iesit.");
                break;
                case "1":
                    System.out.println("\nFolositi result ca operand ? \n 1 pt. da \n 2 pt. nu \n");
                    input =sc.next();    
                    if (input.equals("2")){    
                    System.out.print("a = ");    
                    input =sc.next();
                    if(isDouble(input)){ a = Double.parseDouble(input);
                                         System.out.print("b = ");    
                                         input =sc.next();
                                         if(isDouble(input)){
                                            b = Double.parseDouble(input);
                                            calc.add(a,b); 
                                            System.out.println("\nMemory: " + calc.getmemory() + "\nResult: " + calc.getresult() +"\n"); 
                                         }else { System.out.print("Input invalid. ( trebuie sa fie double\n)"); break;  }
                                       }
                        else { System.out.print("Input invalid. ( trebuie sa fie double\n)");  }
                    }
                        else{
                            if (input.equals("1")){
                                         System.out.print("b = ");    
                                         input =sc.next();  
                                         if(isDouble(input)){
                                         b = Double.parseDouble(input);
                                         calc.add(calc.getresult(),b); 
                                         System.out.println("\nMemory: " + calc.getmemory() + "\nResult: " + calc.getresult() +"\n"); 
                                         }else { System.out.print("Input invalid. ( trebuie sa fie double\n)"); break;  }
                            }else { System.out.print("Input invalid. ( trebuie sa fie double\n)");  }
                        }

                break;
                case "2":
                    System.out.println("\nFolositi result ca operand ? \n 1 pt. da \n 2 pt. nu \n");
                    input =sc.next();    
                    if (input.equals("2")){    
                    System.out.print("a = ");    
                    input =sc.next();
                    if(isDouble(input)){ a = Double.parseDouble(input);
                                         System.out.print("b = ");    
                                         input =sc.next();
                                         if(isDouble(input)){
                                            b = Double.parseDouble(input);
                                            calc.sub(a,b); 
                                            System.out.println("\nMemory: " + calc.getmemory() + "\nResult: " + calc.getresult() +"\n"); 
                                         }else { System.out.print("Input invalid. ( trebuie sa fie double\n)"); break;  }
                                       }
                        else { System.out.print("Input invalid. ( trebuie sa fie double\n)");  }
                    }
                        else{
                            if (input.equals("1")){
                                         System.out.print("b = ");    
                                         input =sc.next();  
                                         if(isDouble(input)){
                                         b = Double.parseDouble(input);
                                         calc.sub(calc.getresult(),b); 
                                         System.out.println("\nMemory: " + calc.getmemory() + "\nResult: " + calc.getresult() +"\n"); 
                                         }else { System.out.print("Input invalid. ( trebuie sa fie double\n)"); break;  }
                            }else { System.out.print("Input invalid. ( trebuie sa fie double\n)");  }
                        }
                case "3":
                    System.out.println("\nFolositi result ca operand ? \n 1 pt. da \n 2 pt. nu \n");
                    input =sc.next();    
                    if (input.equals("2")){    
                    System.out.print("a = ");    
                    input =sc.next();
                    if(isDouble(input)){ a = Double.parseDouble(input);
                                         System.out.print("b = ");    
                                         input =sc.next();
                                         if(isDouble(input)){
                                            b = Double.parseDouble(input);
                                            calc.mul(a,b); 
                                            System.out.println("\nMemory: " + calc.getmemory() + "\nResult: " + calc.getresult() +"\n"); 
                                         }else { System.out.print("Input invalid. ( trebuie sa fie double\n)"); break;  }
                                       }
                        else { System.out.print("Input invalid. ( trebuie sa fie double\n)");  }
                    }
                        else{
                            if (input.equals("1")){
                                         System.out.print("b = ");    
                                         input =sc.next();  
                                         if(isDouble(input)){
                                         b = Double.parseDouble(input);
                                         calc.mul(calc.getresult(),b); 
                                         System.out.println("\nMemory: " + calc.getmemory() + "\nResult: " + calc.getresult() +"\n"); 
                                         }else { System.out.print("Input invalid. ( trebuie sa fie double\n)"); break;  }
                            }else { System.out.print("Input invalid. ( trebuie sa fie double\n)");  }
                        }
                break;
                case "4":
                    System.out.println("\nFolositi result ca operand ? \n 1 pt. da \n 2 pt. nu \n");
                    input =sc.next();    
                    if (input.equals("2")){    
                    System.out.print("a = ");    
                    input =sc.next();
                    if(isDouble(input)){ a = Double.parseDouble(input);
                                         System.out.print("b = ");    
                                         input =sc.next();
                                         if(isDouble(input)){
                                            b = Double.parseDouble(input);
                                            calc.div(a,b); 
                                            System.out.println("\nMemory: " + calc.getmemory() + "\nResult: " + calc.getresult() +"\n"); 
                                         }else { System.out.print("Input invalid. ( trebuie sa fie double\n)"); break;  }
                                       }
                        else { System.out.print("Input invalid. ( trebuie sa fie double\n)");  }
                    }
                        else{
                            if (input.equals("1")){
                                         System.out.print("b = ");    
                                         input =sc.next();  
                                         if(isDouble(input)){
                                         b = Double.parseDouble(input);
                                         calc.div(calc.getresult(),b); 
                                         System.out.println("\nMemory: " + calc.getmemory() + "\nResult: " + calc.getresult() +"\n"); 
                                         }else { System.out.print("Input invalid. ( trebuie sa fie double\n)"); break;  }
                            }else { System.out.print("Input invalid. ( trebuie sa fie double\n)");  }
                        }
                break;
                case "5":
                    System.out.println("\nFolositi result ca operand ? \n 1 pt. da \n 2 pt. nu \n");
                    input =sc.next();    
                    if (input.equals("2")){    
                    System.out.print("a = ");    
                    input =sc.next();
                    if(isDouble(input)){ a = Double.parseDouble(input);
                                            calc.inv(a); 
                                            System.out.println("\nMemory: " + calc.getmemory() + "\nResult: " + calc.getresult() +"\n"); 
                                       }
                        else { System.out.println("Input invalid.\n");  }
                    }
                        else{
                            if (input.equals("1")){
                                         calc.inv(calc.getresult()); 
                                         System.out.println("\nMemory: " + calc.getmemory() + "\nResult: " + calc.getresult() +"\n"); 
                                         System.out.print("Input invalid. ( trebuie sa fie double\n)");
                            }else { System.out.println("Input invalid. \n");  }
                        }
                break;
                case "6":
                     System.out.println("\nFolositi result ca operand ? \n 1 pt. da \n 2 pt. nu \n");
                    input =sc.next();    
                    if (input.equals("2")){    
                    System.out.print("a = ");    
                    input =sc.next();
                    if(isDouble(input)){ a = Double.parseDouble(input);
                                         System.out.print("b = ");    
                                         input =sc.next();
                                         if(isDouble(input)){
                                            b = Double.parseDouble(input);
                                            calc.pow(a,b); 
                                            System.out.println("\nMemory: " + calc.getmemory() + "\nResult: " + calc.getresult() +"\n"); 
                                         }else { System.out.print("Input invalid. ( trebuie sa fie double\n)"); break;  }
                                       }
                        else { System.out.print("Input invalid. ( trebuie sa fie double\n)");  }
                    }
                        else{
                            if (input.equals("1")){
                                         System.out.print("b = ");    
                                         input =sc.next();  
                                         if(isDouble(input)){
                                         b = Double.parseDouble(input);
                                         calc.pow(calc.getresult(),b); 
                                         System.out.println("\nMemory: " + calc.getmemory() + "\nResult: " + calc.getresult() +"\n"); 
                                         }else { System.out.print("Input invalid. ( trebuie sa fie double\n)"); break;  }
                            }else { System.out.print("Input invalid. ( trebuie sa fie double\n)");  }
                        }
                break;
                case "7":
                    System.out.println("\nFolositi result ca operand ? \n 1 pt. da \n 2 pt. nu \n");
                    input =sc.next();    
                    if (input.equals("2")){    
                    System.out.print("a = ");    
                    input =sc.next();
                    if(isDouble(input)){ a = Double.parseDouble(input);
                                         calc.fact(a); 
                                         System.out.println("\nMemory: " + calc.getmemory() + "\nResult: " + calc.getresult() +"\n"); 
                                       }
                        else { System.out.println("Input invalid.\n");  }
                    }
                        else{
                            if (input.equals("1")){
                                         calc.fact(calc.getresult()); 
                                         System.out.println("\nMemory: " + calc.getmemory() + "\nResult: " + calc.getresult() +"\n"); 
                            }else { System.out.print("Input invalid. ( trebuie sa fie double\n)");  }
                        }
                break;
                case "8":
                    System.out.println("\nFolositi result ca operand ? \n 1 pt. da \n 2 pt. nu \n");
                    input =sc.next();    
                    if (input.equals("2")){    
                    System.out.print("a = ");    
                    input =sc.next();
                    if(isDouble(input)){ a = Double.parseDouble(input);
                                        calc.rad(a); 
                                        System.out.println("\nMemory: " + calc.getmemory() + "\nResult: " + calc.getresult() +"\n"); 
                                       }
                        else { System.out.println("Input invalid.\n");  }
                    }
                        else{
                            if (input.equals("1")){
                                         calc.rad(calc.getresult()); 
                                         System.out.println("\nMemory: " + calc.getmemory() + "\nResult: " + calc.getresult() +"\n"); 
     
                            }else { System.out.print("Input invalid. ( trebuie sa fie double\n)");  }
                        }
                break;
                case "9":
                    calc.madd();
                    System.out.println("\nMemory: " + calc.getmemory() + "\nResult: " + calc.getresult() +"\n");    
                break;
                case "10":
                    calc.msub();
                    System.out.println("\nMemory: " + calc.getmemory() + "\nResult: " + calc.getresult() +"\n");
                break;
                case "11":
                    calc.ms();
                    System.out.println("\nMemory: " + calc.getmemory() + "\nResult: " + calc.getresult() +"\n");
                break;
                case "12":
                    calc.mr();
                    System.out.println("\nMemory: " + calc.getmemory() + "\nResult: " + calc.getresult() +"\n");
                break;
                case "13":
                    calc.mc();
                    System.out.println("\nMemory: " + calc.getmemory() + "\nResult: " + calc.getresult() +"\n");

                break;


                default:
                    System.out.println("Doar numerele de la 0 la 13 sunt permise. \nOrice alta alegere este invalida.");
             
                }
    
            }while(!op.equals("0"));
            

            
        
            
            
            
            
            
            
            
            
            
            
            
            
            

        } //-------------------------------------end of try----------------------------------------------------------
        catch (ConnectException conEx) 
        {
            System.out.println("Unable to connect to server!");
            System.exit(1);
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
            System.exit(1);
        }
    }//-------------------------------------end of main----------------------------------------------------------

}//-------------------------------------end of CalcClientComponent----------------------------------------------------------
