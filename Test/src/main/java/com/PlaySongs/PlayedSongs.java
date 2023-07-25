package com.PlaySongs;

import java.util.List;

import com.listenSongs.RecentlyPlayedSongs;

public class PlayedSongs extends RecentlyPlayedSongs {
	public PlayedSongs(int capacity) {
		super(capacity);
	}

	public static void main(String[] args) {
		RecentlyPlayedSongs player = new RecentlyPlayedSongs(3);
		player.playSong("S1");
		player.playSong("S2");
		player.playSong("S3");

		List<String> recentlyPlayed = player.getRecentlyPlayedSongs();
		System.out.println("The playlist would look like ->");
		for (String song : recentlyPlayed) {
			System.out.println(song);
		}

		player.playSong("S4");

		recentlyPlayed = player.getRecentlyPlayedSongs();
		System.out.println("When S4 song is played ->");
		for (String song : recentlyPlayed) {
			System.out.println(song);
		}

		player.playSong("S2");

		recentlyPlayed = player.getRecentlyPlayedSongs();
		System.out.println("When S2 song is played ->");
		for (String song : recentlyPlayed) {
			System.out.println(song);
		}

		player.playSong("S1");

		recentlyPlayed = player.getRecentlyPlayedSongs();
		System.out.println("When S1 song is played ->");
		for (String song : recentlyPlayed) {
			System.out.println(song);
		}
	}

}
