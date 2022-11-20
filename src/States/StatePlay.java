package States;

import Exceptions.StateException;

public class StatePlay implements IPlayerState{

    private Player player;


    @Override
    public void inPlay() throws StateException {
        throw new StateException("The State Cannot Change",new Throwable("the state is not valid"));
    }

    @Override
    public void inWait() {

        player.setState(new StateWait());
    }

    @Override
    public void inLoose() throws StateException{
        if(player.getState() instanceof StateWin){
            throw new StateException("The State Cannot Change",new Throwable("the state is not valid"));
        }
        player.setState(new StateLoose());
    }

    @Override
    public void inWin() throws StateException{
        if(player.getState() instanceof StateLoose){
            throw new StateException("The State Cannot Change",new Throwable("the state is not valid"));
        }
        player.setState(new StateWin());

    }

    @Override
    public void setPlayer(Player player) {
        this.player = player;


    }

    @Override
    public String toString() {
        return "Playing....";
    }
}
