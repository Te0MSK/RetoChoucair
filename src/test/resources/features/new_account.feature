#Author Mateo Ortiz Jaramillo

  Business Need: "Create an automation that takes care of accessing the Utest website and create a new user"

    Background: Open the Utest page
      Given The user is on the main page of Utest


      @NewUser
      Scenario: As a User i am going to Complete the registration form on the Utest website to create a new user
        When The user clicks on the Join Today button
        And Fill out all the information in the form
        Then Click the Complete Setup button and should see the confirmation message Welcome to the world's largest community of freelance software testers!

        @VerifyUser
        Scenario: As a User i am going to login on the Utest website to Verify the user creation
          When The user clicks the Log In button
          And Fill in the fields for username and password and click the Sign In button
          Then The user should see the confirmation message We're so excited for you to get started on uTest, but first you need to confirm your email address.

        @VerifyPassword
          Scenario: As a user I am going to log in to the Utest website with an incorrect password to validate the incorrect password message
            When The user clicks the Log In button
            And Fill in the username field correctly but enter the password incorrectly then click the Sign In button
            Then The user should see the error message Invalid username or password.
