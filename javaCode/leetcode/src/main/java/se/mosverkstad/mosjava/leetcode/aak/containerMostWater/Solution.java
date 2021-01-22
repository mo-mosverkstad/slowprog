package se.mosverkstad.mosjava.leetcode.aak.containerMostWater;

public class Solution {
	public int maxArea(int[] height) {
		int leftPoint = 0, rightPoint = height.length - 1;
		int area = 0;
		int maxArea = 0, maxLeftPoint = leftPoint, maxRightPoint = rightPoint;
		while (leftPoint < rightPoint) {
			area = Math.min(height[leftPoint], height[rightPoint]) * (rightPoint - leftPoint);
			if (area > maxArea) {
				maxArea = area;
				maxLeftPoint = leftPoint;
				maxRightPoint = rightPoint;
			}
			if (height[leftPoint] > height[rightPoint]) {
				rightPoint -= 1;
			} else {
				leftPoint += 1;
			}
			
		}
		System.out.println(String.format("max area: %d (height[%d]=%d, height[%d]=%d).",
				maxArea, maxLeftPoint, height[maxLeftPoint], maxRightPoint, height[maxRightPoint]));
		return maxArea;
	}
}
