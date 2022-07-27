package Vttp2.SSF.kenworkshop16.service;

import Vttp2.SSF.kenworkshop16.model.Mastermind;

public class BoardGameRepo {
    public int save(final Mastermind ctc);

    public Mastermind findById(final String msId);

    public int update(final Mastermind ctc);
}
