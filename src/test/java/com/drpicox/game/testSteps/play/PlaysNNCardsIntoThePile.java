package com.drpicox.game.testSteps.play;

import com.drpicox.game.forms.VisibleGameForm;
import com.drpicox.game.testPost.TestPostForms;
import com.drpicox.game.testPost.reader.PostLine;
import com.drpicox.game.testSteps.AbstractPostLineStep;
import org.springframework.stereotype.Component;

import static com.google.common.truth.Truth.assertThat;

@Component
public class PlaysNNCardsIntoThePile extends AbstractPostLineStep {

    private final TestPostForms testPostForms;

    public PlaysNNCardsIntoThePile(TestPostForms testPostForms) {
        this.testPostForms = testPostForms;
    }

    @Override
    protected String getRegex() {
               // 1 player      2.    3 name1       4.    5 name2   6 type                   7 pile
        return "_([^_]+)_ plays (\\d) _([^_]+)_ and (\\d) _([^_]+)_ _([^_]+)_ cards into the _([^_]+)_ pile";
    }

    @Override
    protected void run(PostLine line, String[] match) {
        var player = match[1];
        var count1 = Integer.parseInt(match[2]);
        var name1 = match[3];
        var count2 = Integer.parseInt(match[4]);
        var name2 = match[5];
        var type = match[6];
        var pile = match[7];
        var response = testPostForms.getForm(VisibleGameForm.class);

        var cards = response.getCards().ofOwner(player).atHand().ofType(type);
        playCardsOfName(pile, response, cards, count1, name1);
        playCardsOfName(pile, response, cards, count2, name2);
    }

    private void playCardsOfName(String pile, VisibleGameForm response, com.drpicox.game.cards.CardListFilter<com.drpicox.game.forms.VisibleCardForm> cards, int count, String name) {
        cards = cards.ofName(name).limit(count);
        cards.forEach(c -> response.play(c, pile));
        assertThat(cards).hasSize(count);
    }


}
