Feature: Add Product to the cart

Scenario Outline: To verify is user is able to add product in the cart


Given user is on the store page
When  user adds "<ProductName>" to the cart
Then user should see <Quantity> "<ProductName>" in the cart

Examples:

| ProductName      | Quantity |
|  Blue Shoes      |     1    |
|  Anchor Bracelet |     1    |



