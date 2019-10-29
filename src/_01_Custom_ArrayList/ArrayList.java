package _01_Custom_ArrayList;

import java.util.Arrays;

@SuppressWarnings("unchecked")

public class ArrayList<T> {
	T[] templates;

	public ArrayList() {
		templates = (T[]) new Object[0];
	}

	public T get(int loc) throws IndexOutOfBoundsException {

		return templates[loc];
	}

	public void add(T val) {
		T[] templatesTwo = (T[]) new Object[templates.length + 1];
		for (int i = 0; i <= templates.length - 1; i++) {

			templatesTwo[i] = templates[i];
		}

		templatesTwo[templates.length] = val;

		templates = templatesTwo;
	}

	public void insert(int loc, T val) throws IndexOutOfBoundsException {

		T[] templatesTwo = (T[]) new Object[templates.length + 1];
		for (int i = 0; i < templates.length; i++) {

			if (i < loc) {
				templatesTwo[i] = templates[i];

			}

			else if (i == loc) {
				templatesTwo[i] = val;
			}

			else {

				templatesTwo[i + 1] = templates[i];
			}

		}

		templates = templatesTwo;

	}

	public void set(int loc, T val) throws IndexOutOfBoundsException {
		templates[loc] = val;

	}

	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] templatesTwo = (T[]) new Object[templates.length - 1];
		for (int i = 0; i < templates.length; i++) {

			if (i < loc) {
				templatesTwo[i] = templates[i];

			}

			else if (i == loc) {

			}

			else {

				templatesTwo[i - 1] = templates[i];
			}

		}

		templates = templatesTwo;

	}

	public boolean contains(T val) {

		return false;
	}
}