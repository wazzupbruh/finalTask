Feature: Smoke
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Scenario Outline: Test main functionality
    Given User opens '<HomePage>' page
    And User checks header visibility
    And User checks search field visibility
    And User checks footer visibility
    And User checks cart visibility
    And User checks 'my account' button visibility
    And User hovers 'my account' button
    And User checks popped 'sign in' button visibility
    And User clicks popped 'sign in' button
    And User gets redirected to 'sign in' page
    And User checks email field visibility on 'sign in' page
    And User checks password field visibility on 'sign in' page
    And User enters email in appropriate field on 'sign in' page
    And User enters password in appropriate field on 'sign in' page
    And User checks 'sign in' button visibility on 'sign in' page
    And User clicks 'sign in' button on 'sign in' page
    And User gets redirected to home page
    And User checks 'my account' button visibility
    And User hovers 'my account' button
    And User checks 'sign out' button visibility
    And User clicks 'sign out' button
    And User checks 'my account' button visibility
    And User hovers 'my account' button
    And User checks popped 'sign up' button visibility
    And User clicks popped 'sign up' button
    And User gets redirected to 'sign up' page
    And User checks email field visibility on 'sign up' page
    And User checks first name field visibility on 'sign up' page
    And User checks last name field visibility on 'sign up' page
    And User checks password field visibility on 'sign up' page
    And User checks birthday select visibility on 'sign up' page
    And User checks birth month select visibility on 'sign up' page
    And User checks birth year select visibility on 'sign up' page
    And User checks 'sign up' button visibility on 'sign up' page
    And User enters email in appropriate field on 'sign up' page
    And User enters first name in appropriate field on 'sign up' page
    And User enters last name in appropriate field on 'sign up' page
    And User enters password in appropriate field on 'sign up' page
    And User picks day of birth in appropriate selector on 'sign up' page
    And User picks month of birth in appropriate selector on 'sign up' page
    And User picks year of birth in appropriate selector on 'sign up' page
    And User clicks 'sign up' button on 'sign up' page

    Examples:
      | HomePage                     |
      | https://www.asos.com/ru/men/ |

  Scenario Outline: Negative tests for 'sign in' page
    Given User opens '<SignInPage>' page
    And User checks sign in container visibility
    And User enters email without '@' symbol
    And User clicks 'sign in' button on 'sign in' page
    And User gets 'wrong-email' warning
    And User gets 'empty-password-field' warning
    And User clears email field
    And User enters correct password
    And User enters email with multiple '@' symbols
    And User clicks 'sign in' button on 'sign in' page
    And User gets 'wrong-email' warning
    And User clears email field
    And User enters correct email
    And User clicks 'sign in' button on 'sign in' page

    Examples:
      | SignInPage                         |
      | https://my.asos.com/identity/login |

  Scenario Outline: Negative tests for 'sign up' page
    Given User opens '<SignUpPage>' page
    And User checks sign up container visibility
    And User clicks email field and leaves it empty
    And User clicks random label
    And User sees 'wrong-email' warning
    And User clicks first name field and leaves it empty
    And User clicks random label
    And User sees 'wrong-first-name' warning
    And User clicks last name field and leaves it empty
    And User clicks random label
    And User sees 'wrong-last-name' warning
    And User clicks password field and leaves it empty
    And User clicks random label
    And User sees 'wrong-first-name' warning
    And User clicks birthday selector and chooses nothing
    And User clicks random label
    And User sees 'wrong-birthday' warning
    And User clicks month of birth selector and chooses nothing
    And User clicks random label
    And User sees 'wrong-birth-month' warning
    And User clicks year of birth selector and chooses nothing
    And User clicks random label
    And User sees 'wrong-birth-year' warning

    Examples:
      | SignUpPage                            |
      | https://my.asos.com/identity/register |

  Scenario Outline: Test 'my account' page
    Given User opens '<HomePage>' page
    And User checks 'my account' button visibility
    And User hovers 'my account' button
    And User checks popped 'sign in' button visibility
    And User clicks popped 'sign in' button
    And User gets redirected to 'sign in' page
    And User checks email field visibility on 'sign in' page
    And User checks password field visibility on 'sign in' page
    And User enters email in appropriate field on 'sign in' page
    And User enters password in appropriate field on 'sign in' page
    And User checks 'sign in' button visibility on 'sign in' page
    And User clicks 'sign in' button on 'sign in' page
    And User gets redirected to home page
    And User hovers 'my account' button
    And User checks popped 'my account' link visibility
    And User clicks popped 'my account' link
    And User gets redirected to 'my account' page
    And User checks 'account view' button visibility
    And User clicks 'account view' button
    And User sees label on 'welcome to your account' page
    And User checks 'my orders' label visibility
    And User clicks 'my orders' button
    And User sees label on 'my orders' page
    And User checks 'my information' button visibility
    And User clicks 'my information' button
    And User sees label on 'my information' page
    And User checks 'change password' button visibility
    And User clicks 'change password' button
    And User sees label on 'change password' button
    And User checks 'address book' button visibility
    And User clicks 'address book' button
    And User sees label on 'address book' page
    And User checks 'my payment methods' button visibility
    And User clicks 'my payment methods' button
    And User sees label on 'my payment methods' page
    And User checks 'my contacts' button visibility
    And User clicks 'my contacts' button
    And User sees label on 'my contacts' page
    And User checks 'my profiles in social networks' button visibility
    And User clicks 'my profiles in social networks' button
    And User sees label on 'my profiles in social networks' page
    And User checks 'my gifts and vouchers' button visibility
    And User clicks 'my gifts and vouchers' button
    And User sees label on 'my gifts and vouchers' page
    And User checks 'customer service' button visibility
    And User clicks 'customer service' button
    And User gets redirected to 'customer service' page
    And User returns to previous page
    And User checks 'order tracker' button visibility
    And User clicks 'order tracker' button
    And User sees label on 'order tracker' page
    And User checks 'refund' button visibility
    And User clicks 'refund' button
    And User sees label on 'refund' page
    And User checks 'needs new label' button visibility
    And User clicks 'needs new label' button
    And User sees label on 'needs new label' page
    And User checks 'sign out' button visibility on 'my account' page
    And User clicks 'sign out' button on 'my account' page
    And User gets redirected to home page




    Examples:
      | HomePage                     |
      | https://www.asos.com/ru/men/ |










