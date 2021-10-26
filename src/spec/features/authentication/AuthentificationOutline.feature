@tag
Feature: Authentification avec plusieurs utilisateurs
  Je souhaite m'identifier avec plusieurs utilisateurs

  @connexionoutline
  Scenario Outline: Authentification avec plusieurs utilisateurs
    Given je me connecte sur l'appli OrangeHRM
    When je saisis le nom utilisateur "<username>"
    And je saisis le mot de passe "<password>"
    And je clique sur le bouton login
    Then je me redirige vers la page Home "Welcome"

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | najet    | najet123 |
      | imen     | imen123  |
