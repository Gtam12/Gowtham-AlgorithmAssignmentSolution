package com.greatlearning.services;

import java.util.HashMap;

public class SortAscending {

	void merge(HashMap<Integer, Double> shares, int left, int mid, int right) {

		double leftArray[] = new double[mid - left + 1];
		double rightArray[] = new double[right - mid];

		for (int i = 0; i < leftArray.length; i++)
			leftArray[i] = shares.get(left + i);
		for (int i = 0; i < rightArray.length; i++)
			rightArray[i] = shares.get(mid + i + 1);
		int leftIndex = 0;
		int rightIndex = 0;
		for (int i = left; i < right + 1; i++) {
			if (leftIndex < leftArray.length && rightIndex < rightArray.length) {
				if (leftArray[leftIndex] < rightArray[rightIndex]) {
					shares.put(i, leftArray[leftIndex]);
					leftIndex++;
				} else {
					shares.put(i, rightArray[rightIndex]);
					rightIndex++;
				}
			} else if (leftIndex < leftArray.length) {
				shares.put(i, leftArray[leftIndex]);
				leftIndex++;
			} else if (rightIndex < rightArray.length) {
				shares.put(i, rightArray[rightIndex]);
				rightIndex++;
			}
		}			
	}

	// Main function that sorts array[left...right] using merge()
	public void sort(HashMap<Integer, Double> shares, int left, int right) {
		if (left < right) {
			// Find the middle point
			int mid = (left + right) / 2;

			// Sort first and second halves
			sort(shares, left, mid);
			sort(shares, mid + 1, right);

			// Merge the sorted halves

			merge(shares, left, mid, right);

		}
	}

}
