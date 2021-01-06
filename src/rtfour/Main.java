package rtfour;

public class Main {
    public static void main(String[] args) {
        Team<FootballPlayer> zenit = new Team<>("Zenit");
        Team<FootballPlayer> barcelona = new Team<>("Barcelona");
        Team<FootballPlayer> arsenal = new Team<>("Arsenal");
        Team<BasketballPlayer> goldenStateWarriors = new Team<>("Golden State Warriors");
        Team<BasketballPlayer> chicagoBulls = new Team<>("ChicagoBulls");

        Team rawTeam = new Team("rawTeam");
        rawTeam.addMember(new BasketballPlayer("Philipp"));

        barcelona.setPoints(10);
        zenit.setPoints(2);
        arsenal.setPoints(15);

        LeagueTable<Team<FootballPlayer>> fifa = new LeagueTable<>("FIFA World Cup");
        fifa.addTeam(zenit);
        fifa.addTeam(barcelona);
        fifa.addTeam(arsenal);
        fifa.addTeam(rawTeam);
        fifa.printLeaderBoard();
    }
}
