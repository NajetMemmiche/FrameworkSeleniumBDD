Feature: Recherche d'un billet - Oui.Sncf 
  ETQ utilisateur je souhaite rechercher un billet de train

  @reservation
  Scenario: Connexion sur l'application oui.sncf
    Given je me connecte sur l'application oui.sncf
    When je saisie la ville de départ "Paris"
    And je saisie la ville d'arrivée "Toulouse Matabiau"
    And je choisis la date
    And je choisis l'heure
    And je click sur le bouton search
    Then je me redirige vers la page home "Welcome"