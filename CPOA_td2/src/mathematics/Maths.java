package mathematics;

import exception.MathsException;
import interfaces.IMaths;

public class Maths implements IMaths {

	@Override
	public int addition(int a, int b) {
		
		
		// TODO Stub de la méthode généré automatiquement
		return a+b;
	}

	@Override
	public int soustraction(int a, int b) {
		// TODO Stub de la méthode généré automatiquement
		return a-b;
	}

	@Override
	public int multiplication(int a, int b) {

		int c= 0;
		
	    if (a<0 && b>0){
	    	if (Math.abs(a)>=Math.abs(b)) {
	    		for(int i= 0; i<Math.abs(b); i++) {
			    		c=(addition(c,a));	
			    		}}
			    else if ((Math.abs(a)<=Math.abs(b)) && (a<0) && (b<0)) {
				    for(int i= 0; i<Math.abs(a); i++) {
				    	c=addition(c,-b);
				    }}}
	    		
		else if (a>0 && b<0){
			if (Math.abs(a)>=Math.abs(b)) {
				for(int i= 0; i<Math.abs(b); i++) {
					c=addition(c,-a);	
					}}
			else if ((Math.abs(a)<=Math.abs(b)) && (a<0) && (b<0)) {
				for(int i= 0; i<Math.abs(a); i++) {
					c=addition(c,b);
					}}}
		
	    else if ((a<0) && (b<0)) {
	    	if (Math.abs(a)>=Math.abs(b)) {
		    	for(int i= 0; i<Math.abs(b); i++) {
		    		c=addition(c,Math.abs(a));	
		    		}}
		    else if ((Math.abs(a)<=Math.abs(b)) && (a<0) && (b<0)) {
			    for(int i= 0; i<Math.abs(a); i++) {
			    	c=addition(c,Math.abs(b));	
			    	}}}
	    
	    
	    else if ((a>0) && (b>0)){
	    	if((Math.abs(a)<=Math.abs(b))) {
	    		for(int i= 0; i<Math.abs(a); i++) {
	    		c=addition(c,b);
	    			}}
	    	else if (Math.abs(a)>=Math.abs(b)) {
		    	for(int i= 0; i<Math.abs(b); i++) {
		    		c=addition(c,a);		
		    		}}}
	    	
	    return c;}


	@Override
	public double division(int a, int b) throws MathsException{
		
		if(b==0) {
			throw new MathsException("Division par zero impossible");
		}
		try {
			return a/b;
		}catch (Exception e) {
			throw new MathsException(e.getMessage());
		}
		
	}}

