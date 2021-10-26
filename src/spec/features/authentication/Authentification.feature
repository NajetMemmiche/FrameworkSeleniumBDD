Feature: Auhtentification - OrangeHRM
  ETQ utilisateur je souhaite m'authentifier

  @connexion
  Scenario: Connexion sur site web Orange
    Given je me connecte sur l'appli OrangeHRM 
    When je saisi username "Admin"
    And je saisi le mot de passe "admin123"
    And je clique sur le bouton login
    Then je me redirige vers la page Home "Welcome"