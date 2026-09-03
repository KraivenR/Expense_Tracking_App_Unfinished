# Fix Issues in ExpensesActivity.java

The primary issue is a compilation error caused by using the class name `BillAdapter` while the actual class is named `Bill_Adapter`. Additionally, there are minor cleanup items like unused imports and optimizing variable scope.

## Proposed Changes

### Expenses Activity

#### [MODIFY] [ExpensesActivity.java](file:///C:/Users/Lenovo/OneDrive/Desktop/Expenses%20Tracking%20List/app/src/main/java/com/example/expensestrackinglist/ExpensesActivity.java)

- Rename `BillAdapter` to `Bill_Adapter` to match the existing class definition.
- Remove the unused `import android.widget.TextView;`.
- Move `recurringBills` and `oneTimeBills` from class fields to local variables in `onCreate`.
- (Optional/Refinement) Keep the `transactionButton` click listener, but it currently restarts the same activity.

## Verification Plan

### Automated Tests
- Run `gradle_build(":app:assembleDebug")` to ensure the compilation error is resolved.

### Manual Verification
- Deploy the app to verify that the lists are correctly populated with data using the fixed adapter reference.
