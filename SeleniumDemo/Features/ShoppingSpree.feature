Feature: Homepage Automation


  Scenario: Successfully Adding Multiple Items to the Shopping Cart.
    Given the user is on the home page of the QA automation site.
    When the Add to cart button is clicked for several items.
    And the Cart link is clicked.
    Then the user ends up on the cart summary page with the appropriate number of items in the cart.


 
