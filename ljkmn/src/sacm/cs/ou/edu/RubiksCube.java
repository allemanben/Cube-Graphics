package sacm.cs.ou.edu;


//import javax.microedition.khronos.opengles.GL10;

public class RubiksCube {
	Cube[][][] chickens = new Cube[3][3][3];



	Colors r = Colors.RED;
	Colors g = Colors.GREEN;
	Colors b = Colors.BLUE;
	Colors y = Colors.YELLOW;
	Colors o = Colors.ORANGE;
	Colors w = Colors.WHITE;
	Colors k = Colors.BLACK;


	public RubiksCube(){
		// front right top back left bottom
		chickens[0][0][0] = new Cube(new Colors[] {r,k,g,k,y,k});
		chickens[0][0][1] = new Cube(new Colors[] {r,k,g,k,k,k});
		chickens[0][0][2] = new Cube(new Colors[] {r,w,g,k,k,k});

		chickens[0][1][0] = new Cube(new Colors[] {r,k,k,k,y,k});
		chickens[0][1][1] = new Cube(new Colors[] {r,k,k,k,k,k});
		chickens[0][1][2] = new Cube(new Colors[] {r,w,k,k,k,k});

		chickens[0][2][0] = new Cube(new Colors[] {r,k,k,k,y,b});
		chickens[0][2][1] = new Cube(new Colors[] {r,k,k,k,k,b});
		chickens[0][2][2] = new Cube(new Colors[] {r,w,k,k,k,b});

		chickens[1][0][0] = new Cube(new Colors[] {k,k,g,k,y,k});
		chickens[1][0][1] = new Cube(new Colors[] {k,k,g,k,k,k});
		chickens[1][0][2] = new Cube(new Colors[] {k,w,g,k,k,k});

		chickens[1][1][0] = new Cube(new Colors[] {k,k,k,k,y,k});
		chickens[1][1][1] = new Cube(new Colors[] {k,k,k,k,k,k});
		chickens[1][1][2] = new Cube(new Colors[] {k,w,k,k,k,k});

		chickens[1][2][0] = new Cube(new Colors[] {k,k,k,k,y,b});
		chickens[1][2][1] = new Cube(new Colors[] {k,k,k,k,k,b});
		chickens[1][2][2] = new Cube(new Colors[] {k,w,k,k,k,b});

		chickens[2][0][0] = new Cube(new Colors[] {k,k,g,o,y,k});
		chickens[2][0][1] = new Cube(new Colors[] {k,k,g,o,k,k});
		chickens[2][0][2] = new Cube(new Colors[] {k,w,g,o,k,k});

		chickens[2][1][0] = new Cube(new Colors[] {k,k,k,o,y,k});
		chickens[2][1][1] = new Cube(new Colors[] {k,k,k,o,k,k});
		chickens[2][1][2] = new Cube(new Colors[] {k,w,k,o,k,k});

		chickens[2][2][0] = new Cube(new Colors[] {k,k,k,o,y,b});
		chickens[2][2][1] = new Cube(new Colors[] {k,k,k,o,k,b});
		chickens[2][2][2] = new Cube(new Colors[] {k,w,k,o,k,b});


		for(int z = 0; z < 3; z++)
			for(int y = 0; y < 3; y++)
				for(int x = 0; x < 3; x++)
				{
					chickens[x][y][z].translate = new float []{2.1f*z,-2.1f*y,-2.1f*x};
				}

	}

}
