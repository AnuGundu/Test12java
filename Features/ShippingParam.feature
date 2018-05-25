Feature: Scenario Outline

Scenario Outline: Customer Details 
    Given  To start firefox by creating a driver instance.
    When Test the "<ShippingDetails>" is present in "<tagname>" tag.
    And To click on the "<Link>" text if present.
    Then  To validate if the customer name is "<customername>".
    
Examples:
   |ShippingDetails|tagname|Link|customername|
   |Shipping Details|h2|6543217|Maya|
   |Shipping Details|h2|7465328|Sri|
   |Shipping Details|h2|9987653|Suruthi|