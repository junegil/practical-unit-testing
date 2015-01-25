package com.practicalunittesting.chapter4;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class FootballTeamTest {

  private Object[] numOfGamesWon() {
    return $(
      0,
      1,
      2
    );
  }

  @Test
  @Parameters(method = "numOfGamesWon")
  public void constructorShouldSetGamesWon(int numOfGamesWon) {
    FootballTeam team = new FootballTeam(numOfGamesWon);
    assertEquals(numOfGamesWon + " games passed to constructor, but " + team.getGamesWon() + " were returned", numOfGamesWon, team.getGamesWon());
  }

  private Object[] illegalNumOfGamesWon() {
    return $(
      -10,
      -1
    );
  }

  @Test(expected = IllegalArgumentException.class)
  @Parameters(method = "illegalNumOfGamesWon")
  public void constructorShouldThrowExceptionForIllegalGamesWon(int illegalNumOfGamesWon) {
    new FootballTeam(illegalNumOfGamesWon);
  }

  private static final int ANY_NUMBER = 123;

  @Test
  public void shouldBePossibleToCompareTeams() {
    FootballTeam team = new FootballTeam(ANY_NUMBER);

    assertTrue("FootballTeam should be implement Comparable", team instanceof Comparable);
  }

  @Test
  public void teamsWithMoreMatchesWonShouldBeGreater() {
    FootballTeam team_2 = new FootballTeam(2);
    FootballTeam team_3 = new FootballTeam(3);

    assertTrue(team_3.compareTo(team_2) > 0);
  }

  @Test
  public void teamsWithLessMatchesWonShouldBeLesser() {
    FootballTeam team_2 = new FootballTeam(2);
    FootballTeam team_3 = new FootballTeam(3);

    assertTrue(team_2.compareTo(team_3) < 0);
  }

  @Test
  public void teamsWithSameMatchesWonShouldBeEqual() {
    FootballTeam teamA = new FootballTeam(2);
    FootballTeam teamB = new FootballTeam(2);

    assertTrue(teamA.compareTo(teamB) == 0);
  }
}
