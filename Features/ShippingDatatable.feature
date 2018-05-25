Feature: Datatables

Scenario: 
 
Given the user is on landing page
When she provides her Name and clicks on Search
|Name|
|Shamili| 
Then validate the results
| Name : Shamili | Shipment Id : SHIP1236 | Phone Number : 9224158877 | E-mail: shamili93@gamil.com |
