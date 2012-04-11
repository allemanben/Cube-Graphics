package sacm.cs.ou.edu;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.opengles.GL10;

public class Cube {
	 

	
	private FloatBuffer vertexBuffer;
	private FloatBuffer colorBuffer;
	private ByteBuffer indexBuffer;
	
	private float verticies[];
	private float colours[];
	private byte indicies[];
	
	public Cube(float vertex[], float color[], byte index[]){
		verticies = vertex;
		colours = color;
		indicies = index;
		
		ByteBuffer byteBuf =  ByteBuffer.allocateDirect(verticies.length*4);
		byteBuf.order(ByteOrder.nativeOrder());
        vertexBuffer = byteBuf.asFloatBuffer();
        vertexBuffer.put(verticies);
        vertexBuffer.position(0);
        
        byteBuf = ByteBuffer.allocateDirect(colours.length * 4);
        byteBuf.order(ByteOrder.nativeOrder());
        colorBuffer = byteBuf.asFloatBuffer();
        colorBuffer.put(colours);
        colorBuffer.position(0);
        
        indexBuffer = ByteBuffer.allocateDirect(indicies.length);
        indexBuffer.put(indicies);
        indexBuffer.position(0);
        
        
	}
	public void draw(GL10 gl) {             
        gl.glFrontFace(GL10.GL_CW);
        
        gl.glVertexPointer(3, GL10.GL_FLOAT, 0, vertexBuffer);
        gl.glColorPointer(4, GL10.GL_FLOAT, 0, colorBuffer);
        
        gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glEnableClientState(GL10.GL_COLOR_ARRAY);
         
        gl.glDrawElements(GL10.GL_TRIANGLES, 36, GL10.GL_UNSIGNED_BYTE, 
                        indexBuffer);
            
        gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
        gl.glDisableClientState(GL10.GL_COLOR_ARRAY);
}
	
}
