/*
GNU LESSER GENERAL PUBLIC LICENSE V3.0 
https://www.gnu.org/licenses/lgpl-3.0.fr.html 
 */
package lb.edu.isae.nfp103.tp0;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Pascal Fares <pascal.fares at cofares.net>
 */
public class Data {

    private int x = 0;
    Semaphore s = new Semaphore(1); 

    public void inc() {
        try{
            s.acquire();
            x = x + 1;
            s.release();
        }catch(InterruptedException e){
            
        }
        
        
    }

    public void dec() {
        try{
            s.acquire();
            x = x - 1;
            s.release();
        }catch(InterruptedException e){
            
        }
    }
    
    @Override
    public String toString(){
        return String.format("x=%d",x);
    }

}
