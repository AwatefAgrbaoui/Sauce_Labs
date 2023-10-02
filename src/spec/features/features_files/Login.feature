@login
Feature: Je shouaite tester la page de la connexion a l application Swag Labs
  En tant que utilistaeur je shouaite tester la page de la connexion a l application Swag Labs

  @login_casPassant
  Scenario: Je shouaite tester la page de la connexion avec un cas passant
    Given Je me connecte a l application Swag Labs
    Then Je me redirige vers la page home "Products"

  @login_casNonPassant
  Scenario: Je shouaite tester la page de la connexion avec un cas non passant
    Given Je me connecte a l application Swag Labs avec coordonnees non correct
    Then Le message d erreur s affiche "Epic sadface: Username and password do not match any user in this service"
