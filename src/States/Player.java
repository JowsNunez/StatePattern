package States;

import Exceptions.StateException;

public class Player {

    private String name;
    private IPlayerState state;

    public Player(String name){

        this.name = name;
        setState(new StateWait());
        this.state.setPlayer(this);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IPlayerState getState() {
        return state;
    }

    public void setState(IPlayerState state) {
        this.state = state;
    }

    public void inPlay()throws StateException {
            this.state.inPlay();
            this.state.setPlayer(this);

    }

    public void inWait()throws StateException{
            this.state.inWait();
        this.state.setPlayer(this);

    }

    public void inLoose() throws StateException{
            this.state.inLoose();
            this.state.setPlayer(this);


    }

    public void inWin()throws StateException{

        this.state.inWin();
        this.state.setPlayer(this);


    }


    @Override
    public String toString() {
        return  " name:" + name + " state: " + state;
    }
}
