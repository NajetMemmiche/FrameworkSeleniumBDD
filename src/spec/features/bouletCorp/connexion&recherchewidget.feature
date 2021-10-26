

Feature: Auhtentification - siteboulet
  ETQ utilisateur je souhaite me connexter sur site boulet

  @connexionboulet
  Scenario: Connexion sur site web bouletcorp
    Given je me connecte sur bouletcorp 
    When je clique sur Aléatoire 
    Then la page a changé
    And les widgets facebook, twitter et tumblr sont bien affichés
