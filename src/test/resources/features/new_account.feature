#Author Mateo Ortiz Jaramillo

  Business Need: "Create an automation that takes care of accessing the Utest website and create a new user"

    Background: Open the Utest page
      Given The user is on the main page of Utest

      Scenario: Complete the registration form on the Utest website to create a new user
        When The user clicks on the Join Today button
        And Fill out all the information in the form
        Then Click the Complete Setup button


        Scenario: Verify the user creation
          When The user clicks the Log In button
          And Fill in the fields for username and password and click the Sign In button
          Then The user will see the confirmation message We're so excited for you to get started on uTest, but first you need to confirm your email address.


          Scenario: "Validation of incorrect password."
            When The user clicks the Log In button
            And Fill in the username field correctly but enter the password incorrectly then click the Sign In button
            Then The user will see the error message Invalid username or password.
