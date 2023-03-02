#Exploratory test: Manual transaction entry
##Objectives: Verification of manual transaction entry functionality.
###Test scenarios:
###Scenario 1: Entering an expense transaction manually
- Step 1: Open the application and select "Add expense transaction" (red button with minus sign (-)).
- Step 2: "Expense" has been selected as the transaction type.
- Step 3: Enter the amount of the expense, a description and a category of the expense.

#####Expected result:
- The transaction is successfully registered in the application. 

#####Result obtained:
- The transaction is successfully registered in the application, as no income has been previously entered, the balance shown is negative (the balance button is highlighted in red).

###Scenario 2: Entering a revenue transaction manually
•	Step 1: Open the application and select "Add Income Transaction" (Green button with the plus sign (+)).
•	Step 2: "Income" has been selected as the transaction type.
•	Step 3: Enter the amount of income, a description and the category of income. 

#####Expected result:
1.	The transaction is successfully registered in the application.
  
#####Result obtained:
•	The transaction has been correctly registered in the application, and if the amount is equal or higher than the expenses, the balance button turns green, otherwise, if the amount is lower the balance button will remain red.

###Scenario 3: Editing a transaction
- Step 1: Open the application and select "Balance Button".
- Step 2: Select any transaction to enter the "Edit Expense" screen.
- Step 3: Enter the new amount, if desired also a comment. 

#####Expected result:
•	The transaction is successfully edited.

#####Result obtained:
- On the screen under the heading "Edit expense" you will see the following message "changes have been saved" but to save them you are forced to select a category again.

#####Defects found:
- When editing expenses and you enter the value of 0, even though you have a message saying that the changes have been saved. They are not saved and do not allow you to change category.

#####Observations and recommendations:
- It is suggested to put a message indicating that the transaction type for value 0 cannot be performed, or something similar.

####Time and resource recording:

- **Test duration**: 10 minutes
  
- **Tester**: Gustavo Quijada

#Exploratory test: Expenditures and Revenues in graphs
##Objectives: Verification of the functionality of visual representation of expenses and income in graphs.

###Test scenarios:
###Scenario 1: Entering several expense and income transactions
- Step 1: Open the application and select "Add transaction".
- Step 2: Enter several expense and income transactions with different dates and amounts.
    - To change the dates, access the menu located in the upper left corner of the application, represented by three horizontal bars.
- Step 3: To display the graph and transaction totals, select a date range that matches the required data.

#####Expected result:
- Transactions are correctly recorded in the application. Visual representation of transactions is correctly updated in the graphs.

#####Result obtained:
- Transactions are not correctly recorded in the application. Visual representation of transactions is not updated correctly in the graphs.
 
#####Defects found:
- The balances and the graph are frozen and do not update the values of income and expenses.

#####Observations and recommendations:
- NA.

####Time and resource recording:
- **Test duration**: 15 minutes 
- **Tester**: Gustavo Quijada 

#Exploratory test: Transfers
##Objectives: Verification of the transfer functionality and its representation in the account balance.
###Test scenarios:
###Scenario 1: Entering several transfers from different accounts
- Step 1: Open the application and select the menu represented by 3 vertical dots located in the upper right corner of the screen.
- Step 2: Select the Accounts button, represented by a wallet.
- Step 3: To enter the transaction menu, select the transfer button.
- Step 4: Enter the amount to transfer between accounts, optional put a note. Mandatory, the source and destination accounts must be different.
- Step 5: To make the transfer you must be positioned in the amount field.
- Step 6: Verify the account balances in the account menu and the movements in the balance section of the main screen.

#####Expected result:
- Transactions are correctly recorded in the application. Visual representation of transactions is correctly updated in the graphs.

#####Result obtained:
- Transactions are correctly recorded in the application. The visual representation of transactions is not updated correctly in the graphs.

#####Defects found:
- The application allows transfers between accounts for amounts greater than the amount of the originating account, which causes negative balances to be reflected in the originating account.
- These balances are shown in the accounts in the accounts section, but are not updated in the application chart.
- The detail of the transfers is not shown in the detail of the balance in the balance section.

#####Observations and recommendations:
- The application should not allow transfers with amounts greater than the balance of the originating account.
- The detail of the transfers should be shown in the detail of the balance movements in the balance section.


###Scenario 2: Balancing different accounts
- Step 1: Open the application and select the menu represented by 3 vertical dots located in the upper right corner of the screen.
- Step 2: Select the Accounts button, represented by a wallet.
- Step 3: To enter the account balance menu, select the account to be credited.
- Step 4: Enter the account balance amount. You can also change the date of the opening balance.
- Step 5: Return to the accounts menu to observe the change in the balance.
- Step 6: Verify the account balances in the account menu and the movements in the balance section of the main screen.

#####Expected result:
. Transactions are correctly recorded in the application. Visual representation of transactions is correctly updated in the graphs.

#####Result obtained:
- Transactions are correctly recorded in the application. Visual representation of transactions is NOT updated correctly in the graphs.

#####Defects found:
- The detail of the balance entered is evidenced in the balance section, however, no change in the total amount of the balance is registered in the main screen.

#####Observations and recommendations:
- If opening balances are added to accounts and you are viewing a date that corresponds to the period and also the detail appears in the balance section, that balance should be reflected in the total balance amount on the main screen.



####Time and resource recording:
- **Test duration**: 20 minutes 
- **Tester**: Gustavo Quijada

#Exploratory test: Report Export 
##Objectives: Verification of the report generation functionality.
###Test scenarios:
###Scenario 1: Generate an expense and income report for a specific time period
- Step 1: Open the application and select the menu represented by 3 vertical dots located in the upper right corner of the screen.
- Step 2: Select the Configuration button, represented by a gear.
- Step 3: To enter the report option, select the Export File button.
- Step 4: Adjust the character set and encoding settings (by default UTF-8), only files with.CSV extension are generated.
- Step 5: Click on the OK button.
- Step 6: Select the medium through which the report is to be sent (in this case through the gmail application) and send the file.

#####Expected result:
- The file is received correctly and shows the complete information of the transactions made on the established date.

#####Result obtained:
- The file was successfully received and shows the complete information of the transactions made on the established date, including transfers.
Defects found:
- Some data containing "tilde" are distorted in the report, despite being UTF-8 encoded.

#####Observations and recommendations:
- It would be a good detail to correct the issue of special characters such as the tilde, improving the data encoding section.

####Time and resource recording:

- **Test duration**: 10 minutes 
- **Tester**: Gustavo Quijada
 
#Exploratory test: Deletion of data
##Objectives: Verification of the data deletion functionality.
###Test scenarios:
###Scenario 1: Deleting data entered into the application
- Step 1: Open the application and select the menu represented by 3 vertical dots located in the upper right corner of the screen.
- Step 2: Select the Configuration button, represented by a gear.
- Step 3: Select the delete data button located at the end of the menu, represented by a database symbol.
- Step 4: Select the yes option to delete the application data including those synchronized with the cloud.

#####Expected result:
- All data entered in the application will be deleted and the values should be zeroed in the history.
Result obtained:
- All the data entered in the application were not deleted and the values in the balance history were set to 12 million Colombian pesos (the currency had been configured in Colombian pesos).

#####Defects found:
- The values in the balance history were set to 12 million Colombian pesos (the currency had been configured in Colombian pesos).

#####Observations and recommendations:
- The delete function should be revised so that all values and data are deleted when such action is required.

####Time and resource recording:
- **Test duration**: 5 minutes 
- **Tester**: Gustavo Quijada
