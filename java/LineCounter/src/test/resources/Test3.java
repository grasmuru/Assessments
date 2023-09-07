 /*****
    * This is a test program with 9 lin
es of code
    *  \/* no nesting allowed!
    //*****//***/// Slightly pathological comment ending...
  
    public class Hello
    { //*
        public static final void main(String [] args) { // gotta love Java
            // Say hello
        	/*
        	/*
        		this line causes issues
        	*/
          System./*wait*/out./*for*/println/*it*/("/*Hello"
          		+ "/*" /// ****/
        		 + /** */ "fffff" );
          /*return
           * 
          */ continue; /*****/ return; /*
          */
        }
    }
