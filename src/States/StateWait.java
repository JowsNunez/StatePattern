package States;

public class StateWait implements IPlayerState{
    private Player player;
    @Override
    public void inPlay() {
            this.player.setState(new StatePlay());
    }

    @Override
    public void inWait() {
        player.setState(new StateWait());
    }

    @Override
    public void inLoose() {
        this.player.setState(new StateLoose());
    }

    @Override
    public void inWin() {
        this.player.setState(new StateWin());
    }

    @Override
    public void setPlayer(Player player) {
        this.player = player;


    }

    @Override
    public String toString(){
        return "Waiting....";
    }


}
