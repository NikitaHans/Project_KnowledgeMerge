package edu.nh.knowledgemerge.game.states

import edu.nh.knowledgemerge.data.playable.PlayingCard
import edu.nh.knowledgemerge.data.player.CardGamePlayer
import java.util.function.Consumer

class PlayersTurnBoardState(
        activePlayer: CardGamePlayer
): BoardState {
    override fun endTurn(): PlayingCard? {
        TODO("not implemented")
    }

    override fun getCurrentPlayer(): CardGamePlayer {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun layCard(card: PlayingCard, cardReturn: Consumer<List<PlayingCard>>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCurrentCard(): PlayingCard {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}