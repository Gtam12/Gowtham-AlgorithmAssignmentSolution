package com.greatlearning.services;

import java.util.ArrayList;

public class Sort {

	void merge(ArrayList<Double> notes, int left, int mid, int right) {
		// Find sizes of two sub arrays to be merged
		int n1 = mid - left + 1;
		int n2 = right - mid;

		/* Create temporary arrays */
		double leftArray[] = new double[n1];
		double rightArray[] = new double[n2];

		/* Copy data to temporary arrays */
		for (int i = 0; i < n1; ++i)
			leftArray[i] = notes.get(left + i);
		for (int j = 0; j < n2; ++j)
			rightArray[j] = notes.get(mid + 1 + j);

		/* Merge the temporary arrays */

		// Initial indexes of first and second sub-arrays
		int i = 0, j = 0;

		// Initial index of merged sub-array array
		int k = left;
		while (i < n1 && j < n2) {
			if (leftArray[i] >= rightArray[j]) {
				notes.set(k, leftArray[i]);
				i++;
			} else {
				notes.set(i, rightArray[j]);
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			notes.set(k, leftArray[i]);
			i++;
			k++;
		}

		while (j < n2) {
			notes.set(k, rightArray[j]);
			j++;
			k++;
		}
	}

	// Main function that sorts array[left...right] using merge()
	public void sort(ArrayList<Double> notes, int left, int right, boolean ascending) {
		if (left < right) {
			// Find the middle point
			int mid = (left + right) / 2;

			// Sort first and second halves
			sort(notes, left, mid, true);
			sort(notes, mid + 1, right, true);

			// Merge the sorted halves
			if (!ascending) {
				merge(notes, left, mid, right);
			} else {
				merge(notes, right, mid, left);
			}

		}
	}

}
