package _04_Maze_Maker;

import java.awt.Graphics;

public class Maze {
	// 1. Create a 2D array of cells. Don't initialize it.
	Cell[][] grid;
	private int rows;
	private int cols;

	public Maze(int rows, int cols) {

		this.rows = rows;
		this.cols = cols;

		// 2. Initialize the cells array using the rows and cols variables
		grid = new Cell[rows][cols];

		// 3. Iterate through each cell and initialize it
		// using row and col as the cell location
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j] = new Cell(i, j);
			}
		}

	}

	// 4. This method iterates through the cells and draws them
	public void draw(Graphics g) {

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				grid[i][j].draw(g);

			}
		}
	}

	// 5. This method returns the selected cell
	public Cell getCell(int row, int col) {
		return grid[row][col];
	}

	public int getRows() {
		return rows;
	}

	public int getCols() {
		return cols;
	}
}
