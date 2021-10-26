Feature: Clic sur une alerte
  ETQ utilisateur je souhaite accepter l'alerte

  @alert
  Scenario: Accepter Alert sur site web 
    Given je me connecte sur le site
    When je clique sur bouton alert
    Then alerte se ferme en cliquant sur OK