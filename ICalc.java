import java.rmi.*;

public interface ICalc extends Remote
{
    public void add(double a, double b) throws RemoteException;
    public void sub(double a, double b) throws RemoteException;
    public void mul(double a, double b) throws RemoteException;
    public void div(double a, double b) throws RemoteException;
    public void inv(double a) throws RemoteException;
    public void pow(double a, double b) throws RemoteException;
    public void fact(double a) throws RemoteException;
    public void rad(double a) throws RemoteException;
    public void mc() throws RemoteException;
    public void mr() throws RemoteException;
    public void ms() throws RemoteException;
    public void madd() throws RemoteException;
    public void msub() throws RemoteException;
    public void setresult(double a)throws RemoteException;
    public double getresult()throws RemoteException;
    public void setmemory(double a)throws RemoteException;
    public double getmemory()throws RemoteException;
}
