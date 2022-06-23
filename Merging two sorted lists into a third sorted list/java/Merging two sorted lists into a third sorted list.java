package javacode.mergtowsortlist;

import java.util.ArrayList;

public class MerTwoList {
	
	public ArrayList<String> merfish(ArrayList<String> sea, ArrayList<String> fresh) {
	
		ArrayList<String> fish = new ArrayList<String>();
		while (!sea.isEmpty() && !fresh.isEmpty()) {
			int diff = (sea.get(0)).charAt(0) - (fresh.get(0)).charAt(0);// compare alphabet two String
			if (diff < 0) {
				fish.add(sea.get(0));
				sea.remove(0);
			} else {
				fish.add(fresh.get(0));
				fresh.remove(0);
			}
		}
		
		// if sea empty then add all fresh to fish
		if (sea.isEmpty()) {
			fish.addAll(fresh);
		} else {
			fish.addAll(sea);
		}

		return fish;
	}

	public static void main(String[] args) {

		ArrayList<String> saltwater_fish = new ArrayList<String>();
		saltwater_fish.add("cod");
		saltwater_fish.add("herring");
		saltwater_fish.add("marlin");

		ArrayList<String> freshwater_fish = new ArrayList<String>();
		freshwater_fish.add("asp");
		freshwater_fish.add("carp");
		freshwater_fish.add("ide");
		freshwater_fish.add("trout");

		System.out.println("List of saltwater  fish: " + saltwater_fish);
		System.out.println("List of freshwater fish: " + freshwater_fish);

		MerTwoList merTwoList = new MerTwoList();
		ArrayList<String> merfish = merTwoList.merfish(saltwater_fish, freshwater_fish);

		System.out.println("List fish after merg: " + merfish);

	}
}
