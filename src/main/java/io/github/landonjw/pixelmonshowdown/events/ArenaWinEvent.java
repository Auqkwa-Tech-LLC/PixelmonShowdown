package io.github.landonjw.pixelmonshowdown.events;

import org.spongepowered.api.entity.living.player.Player;
import org.spongepowered.api.event.cause.Cause;
import org.spongepowered.api.event.entity.living.humanoid.player.TargetPlayerEvent;
import org.spongepowered.api.event.impl.AbstractEvent;

public class ArenaWinEvent extends AbstractEvent implements TargetPlayerEvent {

    private final Cause cause;
    private final Player winner;
    private final double wonElo;

    public ArenaWinEvent(Player winner, double wonElo, Cause cause) {
        this.winner = winner;
        this.wonElo = wonElo;
        this.cause = cause;
    }

    public double getWonElo() {
        return wonElo;
    }

    public Player getWinner() {
        return winner;
    }

    @Override
    public Player getTargetEntity() {
        return this.winner;
    }

    @Override
    public Cause getCause() {
        return cause;
    }
}
