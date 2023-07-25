package com.listenSongs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class RecentlyPlayedSongs {
	private Queue<String> queue;
	private Set<String> set;
	private int capacity;

	public RecentlyPlayedSongs(int capacity) {
		this.capacity = capacity;
		queue = new LinkedList<String>();
		set = new HashSet<String>();
	}

	public void playSong(String song) {
		// If the song is already in the set, remove it from the queue
		if (set.contains(song)) {
			queue.remove(song);
		} else {
			// If the queue has reached its capacity, remove the oldest song
			if (queue.size() == capacity) {
				String oldestSong = queue.poll();
				set.remove(oldestSong);
			}
		}

		// Add the new song to the queue and set
		queue.offer(song);
		set.add(song);
	}

	public List<String> getRecentlyPlayedSongs() {
		// Convert the queue to a list to return the songs in order of play
		return new ArrayList<String>(queue);
	}

}
