package States;

import Exceptions.StateException;

public class StateWin implements IPlayerState{

    private  Player player;


    @Override
    public void inPlay() throws StateException {
       throw new StateException( "The State cannot change ",new Throwable("the state is not valid"));
    }

    @Override
    public void inWait() throws StateException {
        if(this.player.getState() instanceof StateLoose){
            throw new StateException( "The State cannot change ",new Throwable("the state is not valid"));

        }
        this.player.setState(new StateWait());
    }

    @Override
    public void inLoose() throws StateException {
        throw new StateException( "The State cannot change ",new Throwable("the state is not valid"));


    }

    @Override
    public void inWin() throws StateException {
        throw new StateException( "The State cannot change ", new Throwable("the state is not valid"));
    }


    @Override
    public void setPlayer(Player player) {
        this.player = player;

    }

    @Override
    public String toString() {
        return "Win....";
    }


}
