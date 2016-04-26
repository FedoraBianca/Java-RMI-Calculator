import java.rmi.*;
import java.rmi.server.*;

public class CalcImplementation extends UnicastRemoteObject
        implements ICalc {
    String memory, result;

    public CalcImplementation() throws RemoteException {
    	memory = new String("0");
    	result = new String("0");
    }
    
    @Override
    public void add(double a, double b) throws RemoteException{
    	result = Double.toString(a+b);
    }
    @Override
    public void sub(double a, double b) throws RemoteException{
    	result = Double.toString(a-b);
    }
    @Override
    public void mul(double a, double b) throws RemoteException{
    	result = Double.toString(a*b);
    }
    @Override
    public void div(double a, double b) throws RemoteException{
        if( b == 0 ) result = String.valueOf("NaN");
    	else result = Double.toString(a/b);
    }
    @Override
    public void inv(double a) throws RemoteException{
    	result = Double.toString(1/a);
    }
    @Override
    public void pow(double a, double b) throws RemoteException{
    	result = Double.toString(Math.pow(a,b));
    }
    @Override
    public void fact(double a) throws RemoteException{
    	double val =1;
    	while(a > 1) { val = a*val; a--; }
    	result = Double.toString(val);
    }
    @Override
    public void rad(double a) throws RemoteException{
    	result = Double.toString(Math.sqrt(a)); 
    }
    @Override
    public void mc() throws RemoteException{
    	memory = String.valueOf("0");
    }
    @Override
    public void mr() throws RemoteException{
    	result = String.valueOf(memory);
    }
    @Override
    public void ms() throws RemoteException{
    	memory = String.valueOf(result);
    }
    @Override
    public void madd() throws RemoteException{
    if( memory.equals("NaN") || result.equals("NaN") ){ memory = String.valueOf("NaN"); }
        else{
    	double val1 = Double.parseDouble(memory);
    	double val2 = Double.parseDouble(result);
    	double val = val1+val2;
    	memory = String.valueOf(val);	
        }
    }
    @Override
    public void msub() throws RemoteException{
        if( memory.equals("NaN") || result.equals("NaN") ){ memory = String.valueOf("NaN"); }
        else{
    	double val1 = Double.parseDouble(memory);
    	double val2 = Double.parseDouble(result);
    	double val = val1-val2;
    	memory = String.valueOf(val);
        }
    }
    @Override
    public void setresult(double a)throws RemoteException{
        result = Double.toString(a); 
    }
    @Override
    public double getresult()throws RemoteException{
        return Double.parseDouble(result); 
    }
    @Override
    public void setmemory(double a)throws RemoteException{
        memory = Double.toString(a); 
    }
    @Override
    public double getmemory()throws RemoteException{
        return Double.parseDouble(memory); 
    }
    
    
       
}
