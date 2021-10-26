Feature: RechercheCondidat - OrangeHRM
  ETQ utilisateur je souhaite rechercher un condidat
  
  Background:
    Given je me connecte sur l'appli OrangeHRM 
    When je saisi username "Admin"
    And je saisi le mot de passe "admin123"
    And je clique sur le bouton login

  @search
  Scenario: Recherche Condidat sur site web Orange
    When je clique sur menu Recruitment
    And je clique sur menu Condidates
    When je saisi nom condidat "Jennifer Clinton"
    And Je clique sur le bouton search
   Then Je trouve un seul condidat "Jennifer"
    And Je me déconnecte du compte
