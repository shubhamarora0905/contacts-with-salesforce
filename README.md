# contacts-with-salesforce
This is a simple project made using Spring Boot that can add contacts into salesforce using heroku connect. Deploy this as an Heroku App.
<br/><br/>
<a href="https://heroku.com/deploy?template=https://github.com/shubhamarora0905/contacts-with-salesforce">
  <img src="https://www.herokucdn.com/deploy/button.svg" alt="Deploy">
</a>

Steps to follow for deployment:

1. Add a new field in your salesforce org with Name <strong>External Phone Id</strong> and api name <strong>external_phone_id</strong>
2. Open your heroku dashboard, navigate yo the app you just deployed using the Deploy to Heroku button.
4. Go to resources and then add a new add-on <strong>Heroku Connect</strong>
5. In the App to Provision to select your new app and Click on "Provision add-on".
6. Now from resources open your heroku connect dashboard and click on Setup Connection.
7. Enter schema name as <strong>salesforce</strong>.
8. Click on Authotize and then Allow.
9. Now go to mappings and click on Create mappings
10. Select contact.
11. Make sure this setting is correct - Write database updates to Salesforce using External_Phone_Id__c as the unique identifier.
12. Select the following fields - LastName, FirstName, Name, Phone, Email.
13. Click on Save.
14. Done. Your new app is ready.

