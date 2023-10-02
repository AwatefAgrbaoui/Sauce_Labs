Feature: Je souhaite  tester le bouton about
  En tant que utilisateur je souhaite m informer sur l appliquation Swag Labs

  @about
  Scenario: Je souhaite tester le bouton about
    Given Je me connecte a l application Swag Labs
    When Je clique sur le menu burger
    When Je clique sur le bouton about
    Then Je me redirige vers le page about
