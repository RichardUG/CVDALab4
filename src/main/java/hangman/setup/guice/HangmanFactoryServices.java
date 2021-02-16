/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.setup.guice;

/**
 *
 * @author 2106913
 */

import hangman.model.English;
import hangman.model.French;
import hangman.model.Language;
import hangman.model.Spanish;
import hangman.model.dictionary.EnglishDictionaryDataSource;
import hangman.model.dictionary.HangmanDictionary;
import hangman.model.dictionary.FrenchDictionaryDataSource;
import hangman.model.dictionary.SpanishDictionaryDataSource;
import hangman.model.score.GameScore;
import hangman.model.score.PowerScore;
import hangman.view.HangmanPanel;
import hangman.view.HangmanStickmanPanel;

public class HangmanFactoryServices extends com.google.inject.AbstractModule {
    public Class idioma;
    public Class dictionary;
    public Class gameType;
    public Class panel;
    public HangmanFactoryServices(String idioma, String dictionary, String gameType, String panel) throws ClassNotFoundException {
        this.idioma = Class.forName("hangman.model."+idioma);
        this.dictionary = Class.forName("hangman.model.dictionary."+dictionary);
        this.gameType = Class.forName("hangman.model.score."+gameType);
        this.panel = Class.forName("hangman.view."+panel);
    }
    @Override
    protected void configure() {
        /* Guice dependency injection */
        // bind(Interface.class).to(Concrete.class);
        bind(Language.class).to(idioma);
        bind(HangmanDictionary.class).to(dictionary);
        bind(GameScore.class).to(gameType);
        bind(HangmanPanel.class).to(panel);
    }

}
