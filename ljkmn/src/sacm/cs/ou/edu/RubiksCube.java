package sacm.cs.ou.edu;

//import javax.microedition.khronos.opengles.GL10;

public class RubiksCube {
	private Cube[] chickens = new Cube[27];
	
	private float verticies[] = {
			// FRONT
  	      -1.0f, -1.0f,  1.0f,  // 0. left-bottom-front
  	       1.0f, -1.0f,  1.0f,  // 1. right-bottom-front
  	      -1.0f,  1.0f,  1.0f,  // 2. left-top-front
  	       1.0f,  1.0f,  1.0f,  // 3. right-top-front
  	       
  	       // RIGHT
  	       1.0f, -1.0f,  1.0f,  // 1. right-bottom-front
  	       1.0f, -1.0f, -1.0f,  // 6. right-bottom-back
  	       1.0f,  1.0f,  1.0f,  // 3. right-top-front
  	       1.0f,  1.0f, -1.0f,  // 7. right-top-back
  	       
  	        // TOP
  	      -1.0f,  1.0f,  1.0f,  // 2. left-top-front
  	       1.0f,  1.0f,  1.0f,  // 3. right-top-front
  	      -1.0f,  1.0f, -1.0f,  // 5. left-top-back
  	       1.0f,  1.0f, -1.0f,  // 7. right-top-back
  	       
  	      // BACK
  	       -1.0f, -1.0f, -1.0f,  // 4. left-bottom-back
  	       1.0f, -1.0f, -1.0f,  // 6. right-bottom-back
  	       -1.0f,  1.0f, -1.0f,  // 5. left-top-back
  	       1.0f,  1.0f, -1.0f,  // 7. right-top-back
  	      
  	      // LEFT
  	      -1.0f, -1.0f, -1.0f,  // 4. left-bottom-back
  	      -1.0f, -1.0f,  1.0f,  // 0. left-bottom-front 
  	      -1.0f,  1.0f, -1.0f,  // 5. left-top-back
  	      -1.0f,  1.0f,  1.0f,  // 2. left-top-front
  	      
  	     
  	      // BOTTOM
  	      -1.0f, -1.0f, -1.0f,  // 4. left-bottom-back
  	       1.0f, -1.0f, -1.0f,  // 6. right-bottom-back
  	      -1.0f, -1.0f,  1.0f,  // 0. left-bottom-front
  	       1.0f, -1.0f,  1.0f   // 1. right-bottom-front
            };
	
	private float colours[] = {/*TODO make a colour set for each chicken...*/};
	
	private byte indicies[] = {
    		0, 1, 2, 2, 3, 1,//Face1
            4, 5, 6, 5, 6, 7,//Face2
            8, 9, 10, 9, 10, 11,//Face3
            12, 13, 14, 13, 14, 15,//Face4
            16, 17, 18, 17, 18, 19,//Face5
            20, 21, 22, 21, 22, 23//Face6
                              };
	
	public RubiksCube(){
		chickens[0] = new Cube(verticies, colours, indicies);
		
	}

}
