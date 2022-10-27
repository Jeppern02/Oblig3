Startet med å lage et nytt repository ved å "Enable Version Control Integration" og dele filen på github. Kalte repositoriet for Oblig3 og det ble opprettet et nytt et.
Neste lagde jeg meg en egen workflow som jeg kalte "Java CI With Gradle" og skrev inn denne koden. (se .github/workflows).
On [push] betyr at den kjøres hver gang den pushes. Setup JDK og java forteller hvilket språk og versjon som er brukt.
Run: chmod +x ./gradlew sjekker den ut som kjørbar på Linux.
Neste var å gjøre det kjørbart og da skrev jeg inn dette i terminalen på github "git update-index --chmod=+x gradlew".
Og så gjorde jeg noen små endringer i Oblig2 og pusha og fikk grønt lys i github
