/**
 * @class           Floor Class 
 * @author          Amresh Tripathi 
 * @date            01-May-2023
 * @version         1.0
 */
package lib;

import java.util.Stack;

public class Floor {

	public Stack<Integer> floorSizesStack = new Stack<>();

	public Floor() {

		System.out.println("The order of construction is as follows :");

	}

	public void constructFloor(int requiredFloorSize, int[] floorSizes) {

		for (int i = 0; i < floorSizes.length; i++) {

			// day = i + 1;

			System.out.println("\nDay: " + (i + 1));// day

			if (floorSizes[i] != requiredFloorSize) {

				System.out.print(" ");

				floorSizesStack.push(floorSizes[i]);

			} else {

				requiredFloorSize -= 1;

				System.out.print(floorSizes[i] + " ");

				while (!floorSizesStack.isEmpty() && requiredFloorSize == floorSizesStack.peek()) {
					requiredFloorSize -= 1;

					System.out.print(floorSizesStack.pop() + " ");
				}
			}
		}
	}
}