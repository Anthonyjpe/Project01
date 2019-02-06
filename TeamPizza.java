package Project01;

public class TeamPizza extends Team{

    public TeamPizza(String name) {
        super(name);
        createTeamMembers();
    }

    @Override
    public void createTeamMembers()
    {
        members.add(new MillerMember("Kimberly Miller"));
        members.add(new EstephanMember("Anthony Estephan"));
        members.add(new NorwoodMember("Kylie Norwood"));
        members.add(new FreemanMember("Trae Freeman"));
        //members.add(new Project01.SchaperMember("Greg Schaper"));
        // create a new member class for each team member
        // and add it to the team members list
    }

}
