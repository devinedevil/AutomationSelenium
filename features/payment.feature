Feature: SafePay Payment Validation
Background: the user is logged in
  Scenario: User enters valid SafePay credentials
    And the user has a product in the cart
    When he selects SafePay and enters "priyadharsh" and "Priya@123"
    Then he completes the payment
    
  Scenario: User enters invalid SafePay credentials
    And the user has a products in the cart
    When he selects SafePay and enter "sabari" and "sabarinadhansabari"
    Then he should see a payment error