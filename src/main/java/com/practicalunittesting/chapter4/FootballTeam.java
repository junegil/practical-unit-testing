package com.practicalunittesting.chapter4;

import lombok.Getter;

public class FootballTeam implements Comparable<FootballTeam> {

  @Getter
  private int gamesWon;

  public FootballTeam(int gamesWon) {
    if (gamesWon < 0) {
      throw new IllegalArgumentException();
    }

    this.gamesWon = gamesWon;
  }

  @Override
  public int compareTo(FootballTeam o) {
    return gamesWon - o.getGamesWon();
  }
}
