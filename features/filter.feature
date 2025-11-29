Feature: user view product by filters
Scenario: Verify OS filter for multiple OS types
  Given user is on the laptop page
  When user select the "<osType>" OS filter
  Then user should see laptops that match the selected OS

  Examples:
    | osType                 |
    | Windows 10             |
    | Chrome OS             |
    | Windows 7 Professional 64  |
    | Windows 8.1             |
    
    
 Scenario: User filters laptops by the processor
    When the user filter the laptops by the processor 
    Then the displayed laptops should have in selected processor

    
    
  