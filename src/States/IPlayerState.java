package States;

import Exceptions.StateException;

public interface IPlayerState {

    void inPlay() throws StateException;
    void inWait() throws StateException;
    void inLoose() throws StateException;
    void inWin() throws StateException;
    void setPlayer(Player player);
}
