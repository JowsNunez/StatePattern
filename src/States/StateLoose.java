package States;

import Exceptions.StateException;

public class StateLoose implements IPlayerState{
    private Player player;


    @Override
    public void inPlay() throws StateException{
        throw  new StateException("Cannot Change State",new Throwable("the state is not valid"));

    }

    @Override
    public void inWait(){
            player.setState(new StateWait());
    }

    @Override
    public void inLoose() throws StateException{
        throw  new StateException("Cannot Change State",new Throwable("the state is not valid"));
    }

    @Override
    public void inWin() throws StateException {
        throw  new StateException("Cannot Change State",new Throwable("the state is not valid"));
    }

    @Override
    public void setPlayer(Player player) {
        this.player = player;

    }


    @Override
    public String toString() {
        return "Loose....";
    }
}
