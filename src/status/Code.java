/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 *
 * @author Raxit Patel
 */
public class Code {

    /**
     *
     */
    public enum Status{
        ONE,TWO,THREE,FOUR
    }
    
private final Status status;

 public Code(Status s)
        {
           status =s;
           
        }

   public Status getValue() {
		return this.status;
	}

	
	  
        
    
}
