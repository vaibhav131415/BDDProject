Feature: Order Placement

Scenario: To verify if user is able to place an order successfully 

Given user is a guest customer
And user have a product in the cart
And user is on the checkout page
When user provide the billing details

 | firstname | lastname | country            | address_line1     | city  | state | zip   | email                      |
 | demo      | user     | united states (US) | 6300 Spring Creek | plano | Texas | 75024 | vprabhugaonkar13@gmail.com |

And user places an order 
Then user should be able to place an order successfully 