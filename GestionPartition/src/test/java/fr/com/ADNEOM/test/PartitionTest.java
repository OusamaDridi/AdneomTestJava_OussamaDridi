package fr.com.ADNEOM.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.com.ADNEOM.ListUtilitaire;

public class PartitionTest {

	public static ListUtilitaire partition;

	@Before
	public void setUp() {
		partition = new ListUtilitaire();
	}

	@Test()
	public void testPartition() throws Exception {
		/* declaration des listes avec des types differents */
		List<Integer> listOfInt = Arrays.asList(1, 5, 6, 8, 0);
		List<Long> listOfLong = Arrays.asList(1L, 5L, 6L, 8L, 45L, 12L);
		List<String> listOfString = Arrays.asList("fo", "bal", "c", "tr", "fr",
				"m");

		@SuppressWarnings("rawtypes")
		List<List> listOfMixedTypes = new ArrayList<List>();
		listOfMixedTypes.add(listOfInt);
		listOfMixedTypes.add(listOfLong);
		listOfMixedTypes.add(listOfString);

		int taille = 2;
		System.out.println("=> taille: " + taille);
		for (@SuppressWarnings("rawtypes")
		List i : listOfMixedTypes) {

			@SuppressWarnings("rawtypes")
			final List subList;

			subList = ListUtilitaire.partition(i, taille);

			if (taille <= i.size()) {
				if (i.size() % taille == 0) {
					assertEquals(subList.size() * taille, i.size());
					System.out.println("list: " + i);
					System.out.println("subList :" + subList);
					System.out.println("-----------------------------------");
				} else {
					assertEquals(subList.size() * taille, i.size() + 1);
					System.out.println("list: " + i);
					System.out.println("subList :" + subList);
					System.out.println("-----------------------------------");
				}
			} else {
				assertEquals(subList.size(), 1);
				System.out.println("list: " + i);
				System.out.println("subList :" + subList);
				System.out.println("-----------------------------------");
			}

		}

		int taille2 = 3;

		System.out.println("=> taille: " + taille2);

		for (@SuppressWarnings("rawtypes")
		List i : listOfMixedTypes) {

			@SuppressWarnings("rawtypes")
			final List subList;

			subList = ListUtilitaire.partition(i, taille2);

			if (taille2 <= i.size()) {
				if (i.size() % taille2 == 0) {
					assertEquals(subList.size() * taille2, i.size());
					System.out.println("list: " + i);
					System.out.println("subList :" + subList);
					System.out.println("-----------------------------------");
				} else {
					assertEquals(subList.size() * taille2, i.size() + 1);
					System.out.println("list: " + i);
					System.out.println("subList :" + subList);
					System.out.println("-----------------------------------");
				}
			} else {
				assertEquals(subList.size(), 1);
				System.out.println("list: " + i);
				System.out.println("subList :" + subList);
				System.out.println("-----------------------------------");
			}

		}
	}

	/* cas de test lorsque la taille est zero */

	@Test(expected = ArithmeticException.class)
	public void testPartitionTailleZero() throws Exception {
		/* declaration des listes avec des types differents */
		List<Integer> listOfInt = Arrays.asList(1, 5, 6, 8, 0);
		List<Long> listOfLong = Arrays.asList(1L, 5L, 6L, 8L, 45L, 12L);
		List<String> listOfString = Arrays.asList("fo", "bal", "c", "tr", "fr",
				"m");

		@SuppressWarnings("rawtypes")
		List<List> listOfMixedTypes = new ArrayList<List>();
		listOfMixedTypes.add(listOfInt);
		listOfMixedTypes.add(listOfLong);
		listOfMixedTypes.add(listOfString);

		int taille = 0;
		for (@SuppressWarnings("rawtypes")
		List i : listOfMixedTypes) {

			@SuppressWarnings("rawtypes")
			final List subList;

			subList = ListUtilitaire.partition(i, taille);

			if (taille <= i.size()) {
				if (i.size() % taille == 0) {
					assertEquals(subList.size() * taille, i.size());
					System.out.println("list: " + i);
					System.out.println("subList :" + subList);
					System.out.println("-----------------------------------");
				} else {
					assertEquals(subList.size() * taille, i.size() + 1);
					System.out.println("list: " + i);
					System.out.println("subList :" + subList);
					System.out.println("-----------------------------------");
				}
			} else {
				assertEquals(subList.size(), 1);
				System.out.println("list: " + i);
				System.out.println("subList :" + subList);
				System.out.println("-----------------------------------");
			}

		}
	}

	/* cas de test lorsque la taille est negatif */

	@Test(expected = NullPointerException.class)
	public void testPartitionTailleNegatif() throws Exception {
		/* declaration des listes avec des types differents */
		List<Integer> listOfInt = Arrays.asList(1, 5, 6, 8, 0);
		List<Long> listOfLong = Arrays.asList(1L, 5L, 6L, 8L, 45L, 12L);
		List<String> listOfString = Arrays.asList("fo", "bal", "c", "tr", "fr",
				"m");

		@SuppressWarnings("rawtypes")
		List<List> listOfMixedTypes = new ArrayList<List>();
		listOfMixedTypes.add(listOfInt);
		listOfMixedTypes.add(listOfLong);
		listOfMixedTypes.add(listOfString);

		int taille = -5;
		for (@SuppressWarnings("rawtypes")
		List i : listOfMixedTypes) {

			@SuppressWarnings("rawtypes")
			final List subList;

			subList = ListUtilitaire.partition(i, taille);

			if (taille <= i.size()) {
				if (i.size() % taille == 0) {
					assertEquals(subList.size() * taille, i.size());
					System.out.println("list: " + i);
					System.out.println("subList :" + subList);
					System.out.println("-----------------------------------");
				} else {
					assertEquals(subList.size() * taille, i.size() + 1);
					System.out.println("list: " + i);
					System.out.println("subList :" + subList);
					System.out.println("-----------------------------------");
				}
			} else {
				assertEquals(subList.size(), 1);
				System.out.println("list: " + i);
				System.out.println("subList :" + subList);
				System.out.println("-----------------------------------");
			}

		}
	}

}
