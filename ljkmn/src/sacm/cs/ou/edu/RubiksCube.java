package sacm.cs.ou.edu;

import javax.microedition.khronos.opengles.GL10;

public class RubiksCube {
	private Cube[] chickens = new Cube[27];
	
	private float verticies[] = {
            -1.0f, -1.0f, -1.0f,
            1.0f, -1.0f, -1.0f,
            1.0f,  1.0f, -1.0f,
            -1.0f, 1.0f, -1.0f,
            -1.0f, -1.0f,  1.0f,
            1.0f, -1.0f,  1.0f,
            1.0f,  1.0f,  1.0f,
            -1.0f,  1.0f,  1.0f
            };
	
	private float colours[] = {(float)(Math.random()), (float)(Math.random()), (float)(Math.random()), 1.0f};
	
    private byte indicies[] = {
            0, 4, 5, 0, 5, 1,
            1, 5, 6, 1, 6, 2,
            2, 6, 7, 2, 7, 3,
            3, 7, 4, 3, 4, 0,
            4, 7, 6, 4, 6, 5,
            3, 0, 1, 3, 1, 2
            };
	
	public RubiksCube(){
		chickens[0] = new Cube(verticies, colours, indicies);
		
	}

}
