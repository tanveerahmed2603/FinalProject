# LamdaTestPlayground
This is a personal Automation project for Web UI

# How to Run single test
mvn verify -Denv=qa -Dbrowser=chrome -Dcucumber.filter.tags="@purchaseItem"
mvn verify -Denv=qa -Dbrowser=chrome -Dcucumber.filter.tags="@checkout"
