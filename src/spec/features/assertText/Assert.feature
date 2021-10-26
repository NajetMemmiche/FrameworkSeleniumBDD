@tag
Feature: Clic sur bouton & assert texte
  ETQ utilisateur je souhaite verifier texte affiché suite clic sur bouton

  @asserttext
  Scenario Outline: Vérifier texte suite clic sur bouton
    Given je me connecte sur le site demoqa
    When je clique sur bouton "<bouton>"
    Then message "<texte>" s'affiche

    Examples: 
      | bouton                                                       | texte                         |
      | doubleClickBtn                                               | You have done a double click  |
      | rightClickBtn                                                | You have done a right click   |
      | /html/body/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/button | You have done a dynamic click |
