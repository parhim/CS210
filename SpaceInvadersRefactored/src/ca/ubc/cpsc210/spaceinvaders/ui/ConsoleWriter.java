package ca.ubc.cpsc210.spaceinvaders.ui;

import ca.ubc.cpsc210.spaceinvaders.model.Invader;
import ca.ubc.cpsc210.spaceinvaders.model.SIGame;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by S.parhim on 2016-03-23.
 */
public class ConsoleWriter implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof Invader) {
            SIGame.displayOuchMessage();
        }
    }
}
